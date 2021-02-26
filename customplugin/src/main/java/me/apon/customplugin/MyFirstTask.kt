package me.apon.customplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by yaopeng(https://github.com/apon) on 2021/2/26.
 */
open class MyFirstTask : DefaultTask(){

    @Input
    var inputName:String? = null
    @OutputFile
    var file: File? = null
    @TaskAction
    fun generateFile(){
        file?.apply {
            writeText("Hello $inputName!\nPrinted at: ${SimpleDateFormat("HH:mm:ss").format(Date())}")
        }
    }
}
