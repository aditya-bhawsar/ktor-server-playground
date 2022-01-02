package com.aditya.model

import kotlinx.serialization.Serializable

@Serializable
data class BodyData(
    val password: String,
    val name: String
)