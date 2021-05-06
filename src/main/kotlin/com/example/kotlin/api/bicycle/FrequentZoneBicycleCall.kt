package com.example.kotlin.api.bicycle

import com.example.kotlin.api.common.ApiCall
import com.example.kotlin.api.common.Utils
import java.lang.StringBuilder
import java.net.URLEncoder

class FrequentZoneBicycleCall {
    companion object {
        val SERVICE_KEY = "C4rnXJWVOStq31jzYHd0zNOtqwJ4%2Bi43PPuTrLPS1tApT954%2BHPsa0hyjPyWoaejiztEyMWeHhUpIQqUS59Dlg%3D%3D"
        val REQUEST_URL = "http://apis.data.go.kr/B552061/frequentzoneBicycle/getRestFrequentzoneBicycle"

        fun call(url: String): String {
            return ApiCall.callApi(url)
        }
    }
}