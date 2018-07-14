package controllers

import akka.util.ByteString
import javax.inject.{Inject, Singleton}
import play.api.http.HttpEntity
import play.api.mvc._

@Singleton
class ActionController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def echo = Action { implicit request =>
    Ok(getResult())
  }

  def redirect = Action {
    Redirect("https://baidu.com", MOVED_PERMANENTLY)
  }

  def result = Action {
    Result(
      header = ResponseHeader(200, Map("play" -> "play life")),
      body = HttpEntity.Strict(ByteString("Hello world!"), Some("text/plain"))
    )
  }

  def getResult()(implicit request: Request[_]) = {
    s"Got request [${request}]"
  }
}
