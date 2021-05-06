package com.example.kotlin

import com.example.kotlin.api.accident.AccidentDeath
import com.example.kotlin.api.accident.AccidentGuGun
import com.example.kotlin.api.accident.AccidentSiDo
import com.example.kotlin.api.bicycle.FrequentZoneBicycleCall
import com.example.kotlin.api.bicycle.BicycleGuGun
import com.example.kotlin.api.bicycle.BicycleSiDo
import com.example.kotlin.api.common.Utils
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinSpringBootApiApplicationTests {

	@Test
	fun testFrequentZoneBicycleCall() {
		var urlMap: HashMap<String,String> = HashMap<String,String>()
		urlMap.put("ServiceKey", FrequentZoneBicycleCall.SERVICE_KEY) //인증키
		urlMap.put("searchYearCd", "2015") //연도코드
		urlMap.put("siDo", BicycleSiDo.getCode(BicycleSiDo.SEOUL)) //시도코드
		urlMap.put("guGun", BicycleGuGun.getCode(BicycleGuGun.YEONGDEUNGPO)) //시군구코드
		urlMap.put("type", "json") //데이터유형
		urlMap.put("numOfRows", "10") //검색건수
		urlMap.put("pageNo", "1") //페이지 번호

		var url = Utils.createUrl(urlMap, FrequentZoneBicycleCall.REQUEST_URL)

		println("url:: $url")
		println(FrequentZoneBicycleCall.call(url))
	}

	@Test
	fun testAccidentDeath(){
		var urlMap: HashMap<String,String> = HashMap<String,String>()
		urlMap.put("serviceKey", AccidentDeath.SERVICE_KEY) //인증키
		urlMap.put("searchYear", "2014") //연도코드
		urlMap.put("siDo", AccidentSiDo.getCode(AccidentSiDo.SEOUL)) //시도코드
		urlMap.put("guGun", AccidentGuGun.getCode(AccidentGuGun.GANGDONG)) //시군구코드
		urlMap.put("type", "json") //데이터유형
		urlMap.put("numOfRows", "10") //검색건수
		urlMap.put("pageNo", "1") //페이지 번호

		var url = Utils.createUrl(urlMap, AccidentDeath.REQUEST_URL)

		println("url:: $url")
		println(FrequentZoneBicycleCall.call(url))
	}
}
