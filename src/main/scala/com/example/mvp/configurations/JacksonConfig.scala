package com.example.mvp.configurations

import org.springframework.context.annotation.Configuration
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Bean
import com.fasterxml.jackson.databind.ObjectMapper

@Configuration
class JacksonConfig {
  @Bean
  @Primary
  def jsonMapper: ObjectMapper = JacksonConfig.ScalaJsonMapper
}

object JacksonConfig {
  val ScalaJsonMapper = new ObjectMapper()
    .registerModule(DefaultScalaModule)
}
