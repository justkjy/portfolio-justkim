package com.juskim.portfolio.domain.entity
import jakarta.persistence.MappedSuperclass

@Entity
class Link(name: String, content: String, isActive: Boolean) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    var id:Long? = null
}