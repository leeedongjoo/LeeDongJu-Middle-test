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
    @Test
    fun Login() = runBlocking {
        //이건 이메일 패스워드를 받아 로그인 하는겁니다.
        println("Enter your email:")
        val email = readLine() ?: ""
        println("Enter your password:")
        val password = readLine() ?: ""

        val response = webClient.post() // POST 요청
            .uri("/api/auth/login") // 로그인 API 경로
            .contentType(MediaType.APPLICATION_JSON) // 컨텐트 타입 설정
            .bodyValue(mapOf("email" to email, "password" to password)) // 로그인 정보
            .awaitExchange {
                it.bodyToMono(String::class.java) // 응답을 String으로 받음
            }

        println("Response: $response") // 콘솔에 응답 출력
        //Login버튼을 만들어 각 이메일과 패스워드를 비교해 일치하는지 확인한 다음 일치하면 로그인이 되고 불일치면 틀렸으니 다시
        //입력하라는 팝업메세지를 출력하면 됩니당.
    }
}