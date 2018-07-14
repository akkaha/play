package controllers

import javax.inject.Inject
import play.api.Configuration
import play.api.mvc.{AbstractController, ControllerComponents}

class ConfigController @Inject()(config: Configuration, c: ControllerComponents) extends AbstractController(c) {

  def getConfig = Action {
    Ok(config.get[String]("play.editor"))
  }
}
