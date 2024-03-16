package com.juskim.portfolio.domain.repository

import com.juskim.portfolio.domain.entity.Achievement

interface AchievementRepository : JpaRepository<Achievement, Long> {

    // select * from achievement where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Achievement>

}