	package com.homearoundn.homearoundserver

import org.hibernate.dialect.MySQLServerConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

@SpringBootApplication(scanBasePackages = ["com.homearoundn.homearoundserver"])
//@EnableAutoConfiguration(exclude = [MySQLServerConfiguration::class]) //ίσως δεν χριάζεται

class HomeAroundServerApplication
fun main(args: Array<String>) {
	runApplication<HomeAroundServerApplication>(*args)
	println("Hi! successful run")
}
