object Utils {

  case class Details(key:String,value:String)
  case class SrcConfig(srcTyp:String,conDetails: Seq[Details])
  case class Input(name: String, srcType: SrcConfig )

}
