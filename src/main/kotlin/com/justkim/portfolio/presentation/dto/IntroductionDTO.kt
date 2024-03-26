package com.justkim.portfolio.presentation.dto

import com.justkim.portfolio.domain.entity.Introduction

class IntroductionDTO (
    val content: String
){
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}