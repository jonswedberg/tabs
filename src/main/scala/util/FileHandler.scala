package util

import java.nio.file.{Path, Paths, Files}
import java.nio.charset.StandardCharsets.UTF_8

object FileHandler:
    
    def write(fileName: String, output: String, path: String = "output/"): Unit = {
        val finalFileName = 
            if fileName.endsWith(".txt") then 
                fileName
            else fileName + ".txt"

        val fileNameWithPath = path + finalFileName
    
        Files.write(Paths.get(fileNameWithPath), output.getBytes(UTF_8))
    }
