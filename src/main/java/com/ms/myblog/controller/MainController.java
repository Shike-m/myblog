package com.ms.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Main page controller

@Controller
public class MainController {

    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){

        return "login";
    }
    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","Fail to login");
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
