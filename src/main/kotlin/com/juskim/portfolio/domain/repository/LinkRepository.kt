package com.juskim.portfolio.domain.repository

interface LinkRepository : JpaRepository<Link, Long> {

    // select * from link where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Link>

}