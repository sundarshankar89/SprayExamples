package utils

import com.typesafe.config.ConfigFactory

object Prop {

  val config = ConfigFactory.load()

  val host = config.getString("http.host")
  val port = config.getInt("http.port")
}
