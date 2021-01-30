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

    @GetMapping("/one")
    public String getOneData(){
        return "one";
    }

    @GetMapping("/two")
    public String getTwoData(){
        return "two";
    }

    @GetMapping("/three")
    public String getThreeData(){
        return "three";
    }

    @GetMapping("/four")
    public String getFourData(){
        return "four";
    }

    @GetMapping("/five")
    public String getFiveData(){
        return "five";
    }

    @GetMapping("/six")
    public String getSixData(){
        return "six";
    }

    @GetMapping("/seven")
    public String getSevenData(){
        return "seven";
    }

    @GetMapping("/eight")
    public String getEightData(){
        return "eight";
    }

    @GetMapping("/mortar")
    public String getMortarData(){
        return "mortar";
    }

    @GetMapping("/mixture")
    public String getMixtureData(){
        return "mixture";
    }

    @GetMapping("/material")
    public String getMaterialData(){
        return "material";
    }

    @GetMapping("/mechanized")
    public String getMechanizedData(){
        return "mechanized";
    }

}
