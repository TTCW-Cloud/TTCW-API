package com.wznln.mc.api

import java.io.File

object FileReader {
    @JvmStatic
    fun getFileContent(path:String):String = getFileContent(File(path))
    @JvmStatic
    fun getFileContent(file:File):String = file.readText(Charsets.UTF_8)

    @JvmStatic
    fun setFileContent(path:String,content:String) = setFileContent(File(path),content)
    @JvmStatic
    fun setFileContent(file:File,content:String) = file.writeText(content,Charsets.UTF_8)

    @JvmStatic
    fun createFile(path:String) = createFile(File(path))
    @JvmStatic
    fun createFile(file:File) = file.createNewFile()

    @JvmStatic
    fun deleteFile(path:String) = deleteFile(File(path))
    @JvmStatic
    fun deleteFile(file:File) = file.delete()
}
