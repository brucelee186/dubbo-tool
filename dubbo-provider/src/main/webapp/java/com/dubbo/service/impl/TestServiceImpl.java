package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.TestService;

// 对外发布为服务,必须使用dubbo使用的service注解
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHi(String name) {
        return " hello " + name;
    }
}
