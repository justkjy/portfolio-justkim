package com.juskim.portfolio.domain.entity

import jakarta.persistence.Entity

@Entity
class Account(loginId: String, pw: String) : BaseEntity(), UserDetails {
}