package com.juskim.portfolio.domain.repository

interface AccountRepository : JpaRepository<Account, Long> {

    fun findByLoginId(loginId: String): Optional<Account>

}