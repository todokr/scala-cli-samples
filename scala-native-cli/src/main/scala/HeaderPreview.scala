import java.io.File

import scala.io.Source

object HeaderPreview {
  def main(args: Array[String]): Unit = {
    val targetDir = args.headOption.getOrElse(".")
    val files = new File(targetDir).listFiles()
    files.foreach { f =>
      if (f.getName.endsWith(".md")) {
        val source = Source.fromFile(f)
        val headers = source.getLines.filter(_.startsWith("#"))
        println(s"${f.getName} ------------------------")
        headers.foreach(println)
        println()
      }
    }
  }
}
