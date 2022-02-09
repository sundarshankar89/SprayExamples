// Databricks notebook source
import Utils.Input
import spray.json._

object ParserJson extends config with App{

val jsonInput = """{
                  |  "name": "xyz",
                  |  "srcType": {
                  |    "conDetails": [{
                  |      "key": "user",
                  |      "value": "Sundar"
                  |    }, {
                  |      "key": "pwd",
                  |      "value": "Ganesh"
                  |    }, {
                  |      "key": "predicates",
                  |      "value": "Bla Bla"
                  |    }
                  |    ],
                  |    "srcTyp": "jdbc"
                  |  }
                  |}
                  |""".stripMargin

  val convClass = jsonInput.parseJson.convertTo[Input]

  println(convClass)

}
