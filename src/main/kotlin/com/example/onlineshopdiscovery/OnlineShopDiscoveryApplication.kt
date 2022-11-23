package com.example.onlineshopdiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class OnlineShopDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<OnlineShopDiscoveryApplication>(*args)
}
