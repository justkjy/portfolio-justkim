package com.juskim.portfolio.domain.repository

import com.juskim.portfolio.domain.entity.Project

interface ProjectRepository : JpaRepository<Project, Long> {

    @Query("select p from Project p left join fetch p.skills s left join fetch s.skill where p.isActive = :isActive")
    fun findAllByIsActive(isActive: Boolean): List<Project>

    @Query("select p from Project p left join fetch p.details where p.id = :id")
    override fun findById(id: Long): Optional<Project>
}