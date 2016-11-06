import sbt.Keys.version

lazy val commonSettings = Seq(
  scalaVersion := "2.11.7"
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, SbtWeb, JavaServerAppPackaging, DockerPlugin)
  .settings(commonSettings: _*)
  .settings(
    name := """play-react""",
    version := "1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      jdbc,
      cache,
      ws,
      "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
      "org.webjars" %% "webjars-play" % "2.5.+",
      "org.webjars" % "react" % "15.3.+"
    ),
    dockerExposedPorts := Seq(9000)
  )



