package com.wznln.mc.api

import java.io.File

object FileReader {
    @JvmStatic
    fun getFileContent(path:String):String = File(path).readText(Charsets.UTF_8)
    @JvmStatic
    fun setFileContent(path:String,content:String) = File(path).writeText(content)
}