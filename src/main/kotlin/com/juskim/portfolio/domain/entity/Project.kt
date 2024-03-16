package com.juskim.portfolio.domain.entity
import jakarta.persistence.MappedSuperclass

@Entity
class Project(name: String,
              description: String,
              startYear: Int,
              startMonth: Int,
              endYear: Int?,
              endMonth: Int?,
              isActive: Boolean) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    var id:Long? = null
}