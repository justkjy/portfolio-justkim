package com.juskim.portfolio.domain.entity

import jakarta.annotation.Generated
import org.intellij.lang.annotations.Identifier
import java.time.LocalDate


@Entity
class Achievement(title: String, description: String, achievedDate: LocalDate?, host: String, isActive: Boolean) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null

    var title: String = title

    var description: String = description

    var achievedDate: LocalDate? = achievedDate

    var host: String = host

    var isActive: Boolean = isActive
}