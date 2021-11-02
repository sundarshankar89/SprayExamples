name := "TestSpray"

version := "0.1"

scalaVersion := "2.12.15"

val sparkVersion = "3.2.0"
val deltaVersion = "1.0.0"
val compileType = "compile"

// https://mvnrepository.com/artifact/io.spray/spray-json
// https://mvnrepository.com/artifact/io.spray/spray-json
libraryDependencies ++= Seq(
  "io.spray" %% "spray-json" % "1.3.6",
  "org.apache.spark" %% "spark-core" % sparkVersion % compileType,
  "org.apache.spark" %% "spark-sql" % sparkVersion % compileType,
  "org.apache.spark" %% "spark-hive" % sparkVersion % compileType,
  "org.apache.spark" %% "spark-yarn" % sparkVersion % compileType,
  "io.delta" %% "delta-core" % deltaVersion % compileType,
  "io.delta" %% "delta-sharing-spark" % "0.3.0-SNAPSHOT"
)