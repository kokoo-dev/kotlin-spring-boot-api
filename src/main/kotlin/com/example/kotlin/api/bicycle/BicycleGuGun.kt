package com.example.kotlin.api.bicycle

enum class BicycleGuGun(var guGunCode: String, var guGunName: String) {
    GANGNAM("680","강남구"),
    GANGDONG("740","강동구"),
    GANGBUK("305","강북구"),
    GANGSEO("500","강서구"),
    GWANAK("620","관악구"),
    GWANGJIN("215","광진구"),
    GURO("530","구로구"),
    GEUMCHEON("545","금천구"),
    NOWON("350","노원구"),
    DOBONG("320","도봉구"),
    DONGDAEMOON("230","동대문구"),
    DONGJAK("590","동작구"),
    MAPO("440","마포구"),
    SEODAEMOON("410","서대문구"),
    SEOCHO("650","서초구"),
    SUNGDONG("200","성동구"),
    SUNGBOOK("290","성북구"),
    SONGPHA("710","송파구"),
    YANGCHEON("470","양천구"),
    YEONGDEUNGPO("560","영등포구"),
    YONGSAN("170","용산구"),
    EUNPYUNG("380","은평구"),
    JONGRO("110","종로구"),
    JUNG("140","중구"),
    JUNGRANG("260","중랑구");

    companion object{
        fun getCode(g: BicycleGuGun):String{
            return g.guGunCode
        }

        fun getName(g: BicycleGuGun):String{
            return g.guGunName
        }
    }
}