package com.example.kotlin.api.common

import java.lang.StringBuilder

class Utils {
    companion object {
        fun createUrl(urlMap: HashMap<String, String>, url: String): String {
            var urlBuilder: StringBuilder = StringBuilder(url)
            var set = urlMap.keys
            var link = "?"
            var equal = "="

            for (key in set) {
                urlBuilder.append(link + key + equal + urlMap.get(key))

                if("?".equals(link))
                    link = "&"
            }

            return urlBuilder.toString()
        }
    }
}