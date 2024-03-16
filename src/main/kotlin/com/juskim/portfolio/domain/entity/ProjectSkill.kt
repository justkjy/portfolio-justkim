package com.juskim.portfolio.domain.entity
import jakarta.persistence.MappedSuperclass

@Entity
class ProjectSkill(project: Project, skill: Skill) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_skill_id")
    var id:Long? = null
}