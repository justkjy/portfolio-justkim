package com.juskim.portfolio.domain.entity
import jakarta.persistence.MappedSuperclass

@Entity
class Skill(name: String, type: String, isActive: Boolean) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id:Long? = null
}