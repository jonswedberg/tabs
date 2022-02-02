package util

import java.nio.file.{Path, Paths, Files}
import java.nio.charset.StandardCharsets.UTF_8

object FileHandler:
    
    def write(fileName: String, output: String, path: String = "output/"): Unit = {
        val fileNameWithPath = path + {
            if fileName.endsWith(".txt") then 
                fileName
            else fileName + ".txt"
        }
    
        Files.write(Paths.get(fileNameWithPath), output.getBytes(UTF_8))
    }

    /*
    Outputs the contents of a file as a Vector[String] with each element being one line. 
    */
    def read(fileName: String, path: String = "output/"): Vector[String] = {
        val fileNameWithPath = path + {
            if fileName.endsWith(".txt") then 
                fileName
            else fileName + ".txt"
        }

        scala.io.Source.fromFile(fileNameWithPath, "UTF-8").getLines.toVector

    }
