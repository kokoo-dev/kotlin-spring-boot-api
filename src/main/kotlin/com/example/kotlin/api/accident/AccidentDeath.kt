package com.example.kotlin.api.accident

import com.example.kotlin.api.common.ApiCall

class AccidentDeath {
    companion object {
        val SERVICE_KEY = "C4rnXJWVOStq31jzYHd0zNOtqwJ4%2Bi43PPuTrLPS1tApT954%2BHPsa0hyjPyWoaejiztEyMWeHhUpIQqUS59Dlg%3D%3D"
        val REQUEST_URL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath"

        fun call(url: String): String {
            return ApiCall.callApi(url)
        }
    }
}