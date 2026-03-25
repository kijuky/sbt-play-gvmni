package io.github.kijuky.sbt.plugins.playgvmni

import play.sbt.PlayScala
import sbt.AutoPlugin
import sbt.Def
import sbt.PluginTrigger
import sbt.Plugins
import sbt.TaskKey
import sbt.taskKey

object PlayGraalVMNativeImagePlugin extends AutoPlugin {

  override def trigger: PluginTrigger = allRequirements

  override def requires: Plugins = PlayScala


  object autoImport {
    val graalVMNativeImage: TaskKey[Unit] = taskKey("")
  }

  import autoImport.*

  override lazy val projectSettings: Seq[Def.Setting[?]] =
    Seq(graalVMNativeImage := graalVMNativeImageTask.value)

  private lazy val graalVMNativeImageTask =
    Def.task {}
}
