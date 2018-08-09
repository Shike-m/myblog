package com.ms.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// administration controller

@Controller
@RequestMapping("/users")
public class UserController {
   // @Autowired
   // private UserRepository userRepository;

    @GetMapping
    public ModelAndView list(Model model){
        return new ModelAndView("admins/index","menuList",model);
    }

}
