package com.juskim.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Account(loginId: String, pw: String) : BaseEntity(), UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    var id: Long? = null

    var loginId: String = loginId

    @Column(name = "password")
    var pw: String = pw

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> = mutableListOf(SimpleGrantedAuthority("ADMIN"))

    override fun getPassword(): String = pw

    override fun getUsername(): String = loginId

    override fun isAccountNonExpired(): Boolean = true

    override fun isAccountNonLocked(): Boolean = true

    override fun isCredentialsNonExpired(): Boolean = true

    override fun isEnabled(): Boolean = true

}