package com.juskim.portfolio.domain.entity
import jakarta.persistence.*

@Entity
class ExperienceDetail(content: String, isActive: Boolean)  : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id:Long? = null
}