package com.example.kotlin.api.accident

enum class AccidentGuGun(var guGunCode: String, var guGunName: String) {
    GANGNAM("1116","강남구"),
    GANGDONG("1117","강동구"),
    GANGBUK("1124","강북구"),
    GANGSEO("1111","강서구"),
    GWANAK("1115","관악구"),
    GWANGJIN("1123","광진구"),
    GURO("1112","구로구"),
    GEUMCHEON("1125","금천구"),
    NOWON("1122","노원구"),
    DOBONG("1107","도봉구"),
    DONGDAEMOON("1105","동대문구"),
    DONGJAK("1114","동작구"),
    MAPO("1110","마포구"),
    SEODAEMOON("1109","서대문구"),
    SEOCHO("1119","서초구"),
    SUNGDONG("1104","성동구"),
    SUNGBOOK("1106","성북구"),
    SONGPHA("1118","송파구"),
    YANGCHEON("1120","양천구"),
    YEONGDEUNGPO("1113","영등포구"),
    YONGSAN("1103","용산구"),
    EUNPYUNG("1108","은평구"),
    JONGRO("1101","종로구"),
    JUNG("1102","중구"),
    JUNGRANG("1121","중랑구");

    companion object{
        fun getCode(g: AccidentGuGun):String{
            return g.guGunCode
        }

        fun getName(g: AccidentGuGun):String{
            return g.guGunName
        }
    }
}