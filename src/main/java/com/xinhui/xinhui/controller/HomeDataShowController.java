package com.xinhui.xinhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author DongLiang Wang
 * @CreateTime 2021/1/23 14:51
 */
@Controller
public class HomeDataShowController {
    @GetMapping("/home")
    public String getHomeData(){
        return "home";
    }

    @GetMapping("/about")
    public String getAboutData(){
        return "about";
    }

    @GetMapping("/product")
    public String getProductData(){
        return "product";
    }

    @GetMapping("/news")
    public String getNewsData(){
        return "news";
    }

    @GetMapping("/qualification")
    public String getQualificationData(){
        return "qualification";
    }

    @GetMapping("/contact")
    public String getContactData(){
        return "contact";
    }

}
