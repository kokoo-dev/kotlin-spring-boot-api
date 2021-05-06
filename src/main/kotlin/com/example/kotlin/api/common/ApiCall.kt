package com.example.kotlin.api.common

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL

class ApiCall {
    companion object {
        fun callApi(urlInfo: String): String {
            var url: URL = URL(urlInfo)
            var connection: HttpURLConnection = url.openConnection() as HttpURLConnection

            connection.requestMethod = "GET"
            connection.setRequestProperty("Content-type", "application/json;charset=UTF-8")
            var br: BufferedReader

            if (connection.responseCode == HttpURLConnection.HTTP_OK)
                br = BufferedReader(InputStreamReader(connection.inputStream, "UTF-8"))
            else
                br = BufferedReader(InputStreamReader(connection.errorStream, "UTF-8"))

            var result: StringBuilder = StringBuilder()
            var line: String = ""

            while (true) {
                line = br.readLine() ?: break
                result.append(line)
            }

            br.close()
            connection.disconnect()

            return result.toString()
        }
    }
}