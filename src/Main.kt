package com.daelim.springtest

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitExchange
import org.springframework.http.MediaType
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
//
@SpringBootTest
class SpringTestApplicationTests {
    private val webClient = WebClient.builder()
        .baseUrl("https://lotto.minq.work") // API의 베이스 URL
        .build()

    @Test
    fun MainDisplay() {
        //xml을 사용해 버튼을 3개 만들고 맨밑에는 가입 이라는 글씨를 누르면 SignUp로 넘어가게 합니다
        //랜덤번호생성 버튼은 randomNumberMake 으로 넘어가고
        //랜덤번호보관함 버튼은 NumberChest 로 넘어갑니다
        // Login 버튼은 Login으로 넘어가게 합니다
    }
}