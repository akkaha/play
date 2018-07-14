package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class RoutesController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def show(id: Long) = Action {
    Ok(s"id: $id")
  }
}
