import akka.actor.ActorSystem
import com.typesafe.config.Config
import http.HttpRoute
import akka.http.scaladsl.Http
import utils.Prop

import scala.concurrent.ExecutionContext

object Boot extends App{
  def startApp() = {
    implicit val actorSystem = ActorSystem()
    implicit val executor: ExecutionContext = actorSystem.dispatcher


    val httpRoute = new HttpRoute("sundar")

    println(Prop.host + ":" + Prop.port)


    Http().newServerAt(Prop.host, Prop.port).bind(httpRoute.route)
  }

  startApp()
}
