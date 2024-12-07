package com.ll.gb.global.initData

import com.ll.gb.domain.post.post.service.PostService
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Base(
    private val postService: PostService
) {
    @Bean
    fun initDataForBase(): ApplicationRunner {
        return ApplicationRunner {
            if (postService.count() > 0) return@ApplicationRunner

            postService.write("Hello, World!")
            postService.write("Hello, Kotlin!")
        }
    }
}