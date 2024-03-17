package com.juskim.portfolio.domain.repository

import HttpInterface
import com.juskim.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {

    fun countAllByCreatedDateTimeBetween(start: LocalDateTime, end: LocalDateTime): Long

}