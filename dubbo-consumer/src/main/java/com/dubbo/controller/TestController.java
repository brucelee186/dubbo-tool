package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    // 他们订阅zookeeper在注册中心查找服务
    @Reference
    private TestService testService;

    @RequestMapping("/sayHi")
    @ResponseBody
    public String sayHi(String name){
        return testService.sayHi(name);
    }
}
