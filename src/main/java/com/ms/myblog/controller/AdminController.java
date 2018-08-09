package com.ms.myblog.controller;

import com.ms.myblog.domain.User;
import com.ms.myblog.vo.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

// administration controller

@Controller
@RequestMapping("/admins")
public class AdminController {

    @GetMapping
    public ModelAndView listUsers(Model model){
        List<Menu> list=new ArrayList<>();
        list.add(new Menu("Users","/users"));
        list.add(new Menu("roles","/roles"));
        list.add(new Menu("blogs","/blogs"));
        list.add(new Menu("comments","/comments"));
        model.addAttribute("list",list);
        return new ModelAndView("/admins/index","model",model);
    }

}
