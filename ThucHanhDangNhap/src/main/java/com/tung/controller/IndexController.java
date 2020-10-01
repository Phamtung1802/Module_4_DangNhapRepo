package com.tung.controller;

import com.tung.service.AppRoleService;
import com.tung.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class IndexController {
    @Autowired
    private AppUserService appUserServiceImpl;

    @Autowired
    private AppRoleService appRoleServiceImpl;


//    @GetMapping("/")
//    public ModelAndView index(){
//        ModelAndView modelAndView = new ModelAndView("/index");
//        return modelAndView;
//    }
//    @GetMapping("/home")
//    public ModelAndView homeIndex(){
//        ModelAndView modelAndView = new ModelAndView("/index");
//        return modelAndView;
//    }
}
