package com.juskim.portfolio.domain.repository

import com.juskim.portfolio.domain.entity.Achievement

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {

    fun countAllByCreatedDateTimeBetween(start: LocalDateTime, end: LocalDateTime): Long

}