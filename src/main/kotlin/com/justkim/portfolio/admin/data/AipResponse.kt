package com.justkim.portfolio.admin.data

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity

class AipResponse<T>(status: HttpStatusCode) : ResponseEntity<T>(status) {
    companion object{
        fun successCreater(): ResponseEntity<Any> {
            return ResponseEntity.ok("데이터가 저장되었습니다. ")
        }

        fun successUpdate(): ResponseEntity<Any> {
            return ResponseEntity.ok("데이터가 수정되었습니다. ")
        }

        fun successDelete(): ResponseEntity<Any> {
            return ResponseEntity.ok("데이터가 삭제되었습니다. ")
        }
    }

}