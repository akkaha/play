package controllers

import javax.inject.{Inject, Singleton}
import play.api.Configuration
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class ConfigController @Inject()(config: Configuration, c: ControllerComponents) extends AbstractController(c) {

  def getConfig = Action {
    Ok(config.get[String]("play.editor"))
  }
}
