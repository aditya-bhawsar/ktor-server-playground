package com.aditya.plugins

import com.aditya.model.BodyData
import  io.ktor.routing.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
                call.respondText("Hello World!")
                println("URI: ${call.request.uri}") // '/'
                println("Headers: ${call.request.headers.names()}")
                println("User-Agent: ${call.request.headers["User-Agent"]}")
                println("Accept: ${call.request.headers["Accept"]}")
                println("Cache-Control: ${call.request.headers["Cache-Control"]}")
                println("Postman-Token: ${call.request.headers["Postman-Token"]}")
                println("Host: ${call.request.headers["Host"]}")
                println("Accept-Encoding: ${call.request.headers["Accept-Encoding"]}")
                println("Connection: ${call.request.headers["Connection"]}")
                println("Query params: ${call.request.queryParameters.names()}")
                println("Name: ${call.request.queryParameters["name"]}")
                println("Mail: ${call.request.queryParameters["email"]}")
            }

        get("/pager/{page}"){

            val pageNumber = call.parameters["page"]
            call.respondText("Your page number is: $pageNumber")
        }

        get("/pager/{page}/something"){

            val pageNumber = call.parameters["page"]
            call.respondText("Your page number is this: $pageNumber")
        }

        post("/login") {
            val userInfo = call.receive<BodyData>()
            call.respondText("Everything works. ${userInfo.name}  ${userInfo.password}")
        }
    }
}
