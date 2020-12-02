package com.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.service.IHelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = IHelloService.class,protocol = "dubbo")
@Transactional
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "8083 hello "+name;
    }

}
