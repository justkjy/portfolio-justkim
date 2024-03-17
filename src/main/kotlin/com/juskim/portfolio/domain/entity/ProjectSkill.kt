package com.juskim.portfolio.domain.entity
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.intellij.lang.annotations.Identifier
import org.springframework.data.annotation.Id

@Entity
class ProjectSkill(project: Project, skill: Skill) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_skill_id")
    var id:Long? = null
}