package com.aditya.plugins

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.contactUs() {
    routing {
        get("/contactUs"){
            call.respondText("Contact Us")
        }

        get("/aboutUs"){
            call.respondText("About Us")
        }
    }
}