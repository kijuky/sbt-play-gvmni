ThisBuild / organization := "io.github.kijuky"
ThisBuild / scalaVersion := "2.12.21"

lazy val root =
  project
    .in(file("."))
    .enablePlugins(SbtPlugin)
    .settings(
      name := "sbt-play-gvmni",
      libraryDependencies ++= Seq("org.playframework" % "sbt-plugin_2.12_1.0" % "3.0.10")
    )
    // scripted
    .settings(
      scriptedLaunchOpts ++=
        Seq("-Xmx1024M", s"-Dplugin.version=${version.value}"),
      scriptedBufferLog := false
    )
