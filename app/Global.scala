import play.api._

import models._
import controllers._
import anorm._

object Global extends GlobalSettings {
  
  override def onStart(app: Application) {
    // Doe iets wanneer applicatie opstart
  }
  
}