package com.homearoundn.homearoundserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.sql.DriverManager.println

@SpringBootApplication
class HomeAroundServerApplication

fun main(args: Array<String>) {
	runApplication<HomeAroundServerApplication>(*args)
	println("Hi! Successful build!")
}


