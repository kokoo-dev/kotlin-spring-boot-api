package com.example.kotlin.api.accident

enum class AccidentSiDo(var siDoCode: String, var siDoName: String) {
    SEOUL("1100", "서울특별시"),
    BUSAN("1200","부산광역시"),
    DAEGU("2200","대구광역시"),
    INCHEON("2300","인천광역시"),
    GWANGJU("2400","광주광역시"),
    DAEJEON("2500","대전광역시"),
    ULSAN("2600","울산광역시"),
    SEJONG("2700","세종특별자치시"),
    GYEONGGI("1300","경기도"),
    GANGWON("1400","강원도"),
    CHUNGBUK("1600","충청북도"),
    CHUNGNAM("1500","충청남도"),
    JEONBUK("1700","전라북도"),
    JEONNAM("1800","전라남도"),
    GYEONGBUK("1900","경상북도"),
    GYEONGNAM("2000","경상남도"),
    JEJU("2100","제주특별자치도");

    companion object{
        fun getCode(s: AccidentSiDo):String{
            return s.siDoCode
        }

        fun getName(s: AccidentSiDo):String{
            return s.siDoName
        }
    }
}