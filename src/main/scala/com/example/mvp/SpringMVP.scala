package com.example.mvp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
@RestController
class SpringMVP extends SpringBootServletInitializer:

  override def configure(app: SpringApplicationBuilder): SpringApplicationBuilder =
    app.sources(classOf[SpringMVP])

  @GetMapping
  def userName: String = "Gus"

object SpringMVP:

  @main def main(args: String*): Unit =
    SpringApplication.run(classOf[SpringMVP], args: _*)