package com.ll.gb.domain.post.post.entity

import com.ll.gb.global.jpa.entity.BaseTime
import jakarta.persistence.Entity
import org.springframework.data.domain.Persistable

@Entity
class Post(
    var title: String = ""
) : BaseTime(), Persistable<Long> {
    override fun getId(): Long = id

    override fun isNew(): Boolean = id == 0L
}