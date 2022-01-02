package com.aditya

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.aditya.plugins.*
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        install(ContentNegotiation){
            json()
        }

        configureRouting()
        contactUs()
    }.start(wait = true)
}
