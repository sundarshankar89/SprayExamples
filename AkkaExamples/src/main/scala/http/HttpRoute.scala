package http

import scala.concurrent.ExecutionContext
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import ch.megard.akka.http.cors.scaladsl.CorsDirectives.cors

class HttpRoute ( user: String)(implicit executionContext: ExecutionContext) {

  val route: Route =
    cors() {
      pathPrefix("v1") {
        complete(s"This is Landing Page: $user")
      } ~
        pathPrefix("healthcheck") {
          get {
            complete("OK")
          }
        }
    }

}

