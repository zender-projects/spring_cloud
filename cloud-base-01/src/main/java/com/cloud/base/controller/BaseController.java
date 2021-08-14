package com.cloud.base.controller;

import com.cloud.api.CloudApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CloudApi.PREFIX)
public class BaseController implements CloudApi {

    public String hello() {
        return "Hello, Cloud-Base-01";
    }
}
