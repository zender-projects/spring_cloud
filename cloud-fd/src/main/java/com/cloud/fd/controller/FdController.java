package com.cloud.fd.controller;

import com.cloud.fd.client.CloudApiFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FdController {

    //@Autowired
   // private RestTemplate restTemplate;

    @Autowired
    private CloudApiFeign cloudApi;

    //方法级的降级
    //@HystrixCommand(fallbackMethod = "helloFallback")
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        //return restTemplate.getForEntity("http://cloud-base/base/hello", String.class).getBody();

        //获取zuul中的敏感头
        String token = request.getHeader("token");   //有
        String setCookie = request.getHeader("Set-Cookie"); //没有
        String cookie = request.getHeader("Cookie"); //没有

        //System.out.println("token=" + token);
        //System.out.println("set-cookie=" + setCookie);
        //System.out.println("cookie="+cookie);

        //FeignClient


        return cloudApi.hello();
    }

    public String helloFallback() {
        return "hystrix result";
    }
}
