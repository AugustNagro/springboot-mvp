package com.example.mvp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
@RestController
class SpringMVP:

  @GetMapping
  def userName: String = "Gus"

object SpringMVP:

  @main def main(args: String*): Unit =
    SpringApplication.run(classOf[SpringMVP], args: _*)