package com.zsy.consulconsumer

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.web.client.RestTemplate
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient
import org.springframework.context.annotation.Bean

/**
 ** @author Jayloong
 ** @date 2018/9/18
 ** 功能说明：
 */
@RestController
class DcController {
    @Bean
    @LoadBalanced
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }

    @Autowired
    var loadBalancerClient: LoadBalancerClient? = null
    @Autowired
    var restTemplate: RestTemplate? = null

    @GetMapping()
    fun dc(): String {
        return restTemplate?.getForObject("http://consul-client", String::class.java)!!
    }
}