package com.huh.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {

    @RequestMapping(value = "/toReg")
    public String toRegisterPage() {
        return "reg";
    }

    @RequestMapping(value = "/doReg")
    public String doRegister(HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(userName + ": " + password);
        return "index";
    }

}
