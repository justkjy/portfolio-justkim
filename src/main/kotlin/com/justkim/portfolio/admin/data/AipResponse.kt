package com.justkim.portfolio.admin.data

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class AipResponse<T>(status: HttpStatus) : ResponseEntity<T>(status) {

}