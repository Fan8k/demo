package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * +TODO
 *
 * @author : lirongfan@bytedance.com
 * @since : 2020/11/25
 */

@RestController
public class TestDocker {

    @GetMapping("/test")
    public String test() {
        return "自动化部署Test，远程docker访问成功！！！";
    }
}