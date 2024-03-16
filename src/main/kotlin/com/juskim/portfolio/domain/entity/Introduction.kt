package com.juskim.portfolio.domain.entity
import jakarta.persistence.MappedSuperclass

@Entity
class Introduction(content: String, isActive: Boolean) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Introduction_id")
    var id:Long? = null
}