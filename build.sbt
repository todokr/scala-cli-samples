
lazy val scalaCli = (project in file("scala-cli"))
  .settings(
    name := "scala-cli-samples",
    scalaVersion := "2.12.8"
  )

lazy val scalaNativeCli = (project in file("scala-native-cli"))
  .settings(
    scalaVersion := "2.11.12"
  ).enablePlugins(ScalaNativePlugin)



