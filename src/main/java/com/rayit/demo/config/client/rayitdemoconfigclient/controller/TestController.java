package com.rayit.demo.config.client.rayitdemoconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // git配置文件里的key title
    @Value("${title}")
    String title;

    //非对称加密密码
    @Value("${testUser.passwordAsymmetric}")
    String passwordAsymmetric;

    //对称加密密码
    @Value("${testUser.passwordSymmetric}")
    String passwordSymmetric;


    @RequestMapping(value = "/showTitle")
    public String showTitle() {
        return title;
    }

    @RequestMapping(value = "/showPwdA")
    public String showPasswordAsymmetric() {
        return passwordAsymmetric;
    }

    @RequestMapping(value = "/showPwdS")
    public String showPasswordSymmetric() {
        return passwordSymmetric;
    }
}
