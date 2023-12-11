package com.yu.yi.nan.YuEstateMobile.android.model

data class Employee (
    val firstName: String,
    val lastName: String,
    val employeeID: String,
    val role: String,
    val position: String,

    val phoneNumber: Number,
    val active: Boolean=false,
    //handshake id
    val requestId: String


)