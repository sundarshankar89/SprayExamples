package internal

import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

trait AppContext extends AppLogger {

  implicit val spark = SparkSession
    .builder()
    //.master("local[*]") #enable this to  run in local
    .appName(getClass.getName)
    .config("spark.databricks.delta.schema.autoMerge.enabled", "true") //To Enable Delta Merge Schema as True
    .getOrCreate()

  spark.conf.getAll
  Logger.getLogger("org").setLevel(Level.OFF)
  Logger.getLogger("akka").setLevel(Level.OFF)

}
