package com.crisspian.class26_example_01

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.RuntimeException
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.HttpsURLConnection


fun main() {
    val test = Test()
    test.connectApi()
}

class Test {
    fun connectApi() {
        try {
            val url = URL("https://jsonplaceholder.typicode.com/posts")
            val conn = url.openConnection() as HttpsURLConnection

            if(conn.responseCode != 200) {
                throw RuntimeException("Failed: HTTP: " + conn.responseCode)
            }

            val br = BufferedReader(InputStreamReader(conn.inputStream))
            println("OUT from SERVER...")
            while (br.readLine() != null) {
                println(br.readLine())
            }
            conn.disconnect()

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}



