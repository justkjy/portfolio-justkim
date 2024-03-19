package com.juskim.portfolio.domain.repository

import com.juskim.portfolio.domain.constant.SkillType
import com.juskim.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SkillRepository : JpaRepository<Skill, Long> {

    // select * from skill where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Skill>

    // select * from skill where lower(name) = lower(:name) and skill_type = :type
    // 대소문자 가려서 비교 하지 않음
    fun findByNameIgnoreCaseAndType(name: String, type: SkillType): Optional<Skill>

}