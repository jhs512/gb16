package com.ll.gb.domain.post.post.dto

import com.ll.gb.domain.post.post.entity.Post
import java.time.LocalDateTime

data class PostDto(
    val id: Long,
    val createdAt: LocalDateTime,
    val modifiedAt: LocalDateTime,
    val title: String,
) {
    constructor(post: Post) : this(
        id = post.id,
        createdAt = post.createdAt,
        modifiedAt = post.modifiedAt,
        title = post.title,
    )
}