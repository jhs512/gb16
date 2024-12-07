package com.ll.gb.domain.post.post.controller

import com.ll.gb.domain.post.post.dto.PostDto
import com.ll.gb.domain.post.post.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/posts")
class ApiV1PostController(
    private val postService: PostService
) {
    @GetMapping
    fun getItems(): List<PostDto> {
        return postService
            .findAll()
            .map { PostDto(it) }
    }
}