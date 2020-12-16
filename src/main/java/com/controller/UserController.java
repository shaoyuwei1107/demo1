package com.controller;

import com.po.Users;
import com.sun.deploy.net.HttpResponse;
import com.sun.net.httpserver.HttpServer;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
    @RequestMapping(value = "check_Users.do" ,method = RequestMethod.GET )
    public ModelAndView check(HttpServletRequest request, HttpServletResponse response, Users users){
        ModelAndView mv=new ModelAndView();
        if (mv!=null){
            mv.addObject("us", users);
            mv.setViewName("ok.jsp");
            return mv;
        }

mv.setViewName("Error.jsp");
        return mv;

    }
    @RequestMapping(value = "findById_Users.do" ,method = RequestMethod.GET )
    public Users findById(HttpServletRequest request, HttpServletResponse response){


            return new Users("家辉","嘉欣");

    }





}
