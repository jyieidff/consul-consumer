package com.zsy.consulconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ConsulConsumerApplication



fun main(args: Array<String>) {
    runApplication<ConsulConsumerApplication>(*args)
}
