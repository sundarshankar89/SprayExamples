// Databricks notebook source
import Utils.{Details, Input, SrcConfig}
import spray.json.enrichAny

object Hello extends config with App {
val  json = Input("xyz",
  SrcConfig("jdbc",
    Seq(
    Details("user","user"),Details("pwd","pwd")
  )
  )
).toJson

  println(json.prettyPrint)
}
