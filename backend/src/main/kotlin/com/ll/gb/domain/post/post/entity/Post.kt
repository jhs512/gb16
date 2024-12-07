package com.ll.gb.domain.post.post.entity

import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.domain.Persistable
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@EntityListeners(AuditingEntityListener::class)
class Post(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    var id: Long = 0,
    var title: String = ""
) : Persistable<Long> {
    @CreatedDate
    lateinit var createdAt: LocalDateTime

    @LastModifiedDate
    lateinit var modifiedAt: LocalDateTime

    override fun getId(): Long = id

    override fun isNew(): Boolean = id == 0L
}