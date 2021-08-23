package com.cloud.base.controller;

import com.cloud.api.CloudApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(CloudApi.PREFIX)
public class BaseController implements CloudApi {

    public String hello() {
        //通过request对象拿到 通过RequetInterceptor设置的header
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return "Hello, Cloud-Base-01, token => " + request.getHeader("cloud_token");
    }

    @Override
    public String circuitBreakerOpen() {
        //throw new RuntimeException("circuitBreakerOpen");
        return "circuitBreakerOpen";
    }
}
