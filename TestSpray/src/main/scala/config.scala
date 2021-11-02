import Utils._
import spray.json.DefaultJsonProtocol
import spray.json._

trait config extends DefaultJsonProtocol {
  implicit val details = jsonFormat2(Details)
  implicit val srcConfig = jsonFormat2(SrcConfig)
  implicit val input = jsonFormat2(Input)

}
