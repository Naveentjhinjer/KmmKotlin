package com.example.kmmkotlin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform