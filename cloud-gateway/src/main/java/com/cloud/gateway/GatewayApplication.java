package com.cloud.gateway;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class GatewayApplication {
    public static void main(String[] args) {
        //ZuulProperties
        SpringApplication.run(GatewayApplication.class);
    }

    //zuul 对 consumer设置全局负载均衡策略
    @Bean
    public IRule loadbalancer() {
        return new RandomRule();
    }
}
