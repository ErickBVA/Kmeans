package kMeans.code

import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>){
    println("Hello mother fuker")

    //List to be called
    val lineList = mutableListOf<String>()

    //File reading
    val br: BufferedReader? = try{
        File("C:/Users/Erick/Desktop/Pokemon.csv").bufferedReader();
    }catch(ex: FileNotFoundException){ null }

    //File validation
    if (br == null) {
        print("Error al encontrar el archivo ");
        System.exit(1);
    }

    br!!.useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach { println("> " + it) }

}