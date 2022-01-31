import org.apache.spark.sql.SparkSession

trait Appcontext {

  val spark = SparkSession
    .builder()
    .master("local[*]")
    .getOrCreate()

}
