package com.yu.yi.nan.YuEstateMobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform