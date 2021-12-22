package com.aditya

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.aditya.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
