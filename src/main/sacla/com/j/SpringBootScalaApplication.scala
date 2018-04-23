package com.j

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.{ComponentScan, Configuration}

/**
  * Created by jufeng on 2018/4/23.
  */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
class Config
object SpringBootScalaApplication {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Config])
  }
}
