package com.rapidark.os.web.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author Lion Li
 */
@RequiredArgsConstructor
@RestController
public class IndexController {


    /**
     * 访问首页，提示语
     */
    @GetMapping("/")
    public String index() {
        return "欢迎使用{}后台管理框架，当前版本：v{}，请通过前端地址访问。";
    }
}
