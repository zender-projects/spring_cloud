package com.cloud.fd.config;

import com.cloud.fd.lb.FdLoadBalanceRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootConfiguration
public class FdConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule loadBalanceRule() {
        List<Integer> excludePorts = new ArrayList<>();
        excludePorts.add(8081);
        return new FdLoadBalanceRule(excludePorts);
    }
}
