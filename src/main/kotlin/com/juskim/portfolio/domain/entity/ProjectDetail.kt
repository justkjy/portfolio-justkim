package com.juskim.portfolio.domain.entity
import jakarta.persistence.MappedSuperclass

@Entity
class ProjectDetail(content: String, url: String?, isActive: Boolean) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    var id:Long? = null
}