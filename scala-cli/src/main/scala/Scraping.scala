import scala.io.Source

object Scraping {
  def main(args: Array[String]): Unit = {
    val targetUrl = args(0)
    val targetTag = args(1)

    val source = Source.fromURL(targetUrl, "utf-8")
    val LinkPattern = s"""<$targetTag.*?>(.*)</$targetTag>""".r
    val body = source.mkString
    LinkPattern.findAllMatchIn(body).foreach { m =>
      println(m.group(1))
    }
  }
}
