package com.cloud.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration;
import org.springframework.cloud.netflix.eureka.config.EurekaClientConfigServerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.config.EurekaDiscoveryClientConfigServiceAutoConfiguration;

@SpringBootApplication
//@EnableDiscoveryClient
public class BaseApplication {

    public static void main(String[] args) {
        //EurekaClientConfigServerAutoConfiguration
        //EurekaDiscoveryClientConfigServiceAutoConfiguration
        //EurekaClientAutoConfiguration
        //EurekaDiscoveryClientConfiguration
        //EurekaDiscoveryClientConfiguration
        //AutoServiceRegistrationConfiguration

        //org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
        org.springframework.cloud.netflix.eureka.config.EurekaClientConfigServerAutoConfiguration,\
        org.springframework.cloud.netflix.eureka.config.EurekaDiscoveryClientConfigServiceAutoConfiguration,\
        org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration,\
        org.springframework.cloud.netflix.ribbon.eureka.RibbonEurekaAutoConfiguration,\
        org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration

        org.springframework.cloud.bootstrap.BootstrapConfiguration=\
        org.springframework.cloud.netflix.eureka.config.EurekaDiscoveryClientConfigServiceBootstrapConfiguration



        SpringApplication.run(BaseApplication.class);
    }
}
