package internal

import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager

trait AppLogger {

  val log = LogManager.getLogger(getClass.getName)

}
