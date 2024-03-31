package com.justkim.portfolio.presentation.service

import com.justkim.portfolio.domain.entity.Introduction
import com.justkim.portfolio.presentation.repository.PresentationRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class PresentationServiceTest {
    @InjectMocks
    lateinit var presentationService: PresentationService

    @Mock
    lateinit var presentationRepository: PresentationRepository

    val DATA_SIZE = 9

    @Test
    fun testGetIntroductions() {
        val introductions = mutableListOf<Introduction>()
        for(i in 1..DATA_SIZE) {
            val introduction = Introduction(content = "${i}", isActive = i % 2 == 0)
            introductions.add(introduction)
        }

        val actiIntroductions = introductions.filter { introduction ->
            introduction.isActive
        }

        Mockito.`when`(presentationRepository.getActiveIntroductions())
            .thenReturn(actiIntroductions)

        // when
       // val introductionDTOs = presentationService.get
    }
}