package me.apon.customplugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by yaopeng(https://github.com/apon) on 2021/2/25.
 */
class MyFirstPlugin:Plugin<Project>{
    override fun apply(p0: Project) {
        //创建task生成文件
        p0.tasks.create("MyFirstPlugin"){
            it.group = "MyPluginTasks"
            it.doLast {
                File("${p0.projectDir.path}/myFirstGeneratedFile.txt").apply {
                    writeText("Hello World!\nPrinted at: ${SimpleDateFormat("HH:mm:ss").format(Date())}")
                }
            }
        }
    }
}