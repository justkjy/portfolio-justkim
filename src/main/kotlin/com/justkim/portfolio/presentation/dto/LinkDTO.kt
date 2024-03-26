package com.justkim.portfolio.presentation.dto

import com.justkim.portfolio.domain.entity.Link

data class LinkDTO(
    val name: String,
    val content: String
) {
    constructor(link: Link) : this(
        name = link.name.lowercase(),
        content = link.content
    )
}