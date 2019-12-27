package com.zhsw.hello;

import com.zhsw.helloWord.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zhengliang
 * @Description: hello
 * @Date: 2019/12/26 19:11
 */
@RestController
public class HelloController {
    @Resource
    private HelloService helloService;
    @GetMapping("/hello")

    public void hello(){
        helloService.sayHello();
    }
}
