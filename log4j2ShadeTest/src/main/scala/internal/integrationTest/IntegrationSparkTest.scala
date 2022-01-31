package internal.integrationTest

import internal.AppContext

object IntegrationSparkTest extends AppContext with App{
  import spark.implicits._
  val srcdf = Seq(
    (10,"Col120","11-JUL-2020 00:00:00",11111),
    (20,"Col120","11-JUL-2020 00:00:00",22222)
  ).toDF("id","value","date","partCol")

  srcdf.show(false)
  assert(1==1)

}
