package com.ll.gb

import com.ll.gb.domain.post.post.entity.Post
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class BackendApplication

fun main(args: Array<String>) {
    runApplication<BackendApplication>(*args)
}
