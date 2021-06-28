package com.example.mvp.configurations

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import java.{util => ju}
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter

@Configuration
@EnableWebMvc
class WebConfig extends WebMvcConfigurer {
  override def configureMessageConverters(converters: ju.List[HttpMessageConverter[_]]): Unit = {
    val conv = new MappingJackson2HttpMessageConverter()
    conv.setObjectMapper(JacksonConfig.ScalaJsonMapper)
    converters.add(conv)
  }
}

