package com.ll.gb.domain.post.post.service

import com.ll.gb.domain.post.post.entity.Post
import com.ll.gb.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PostService(
    private val postRepository: PostRepository
) {
    @Transactional
    fun write(title: String): Post {
        val post = Post(title = title)

        return postRepository.save(post)
    }

    fun count(): Long {
        return postRepository.count()
    }

    fun findAll(): List<Post> {
        return postRepository.findAll()
    }
}