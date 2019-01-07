package com.client.client_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/hey")
    public String login() {
        return "login";
    }

    @RequestMapping(value="/Send",params="text")
    @ResponseBody
    public String send(HttpServletRequest request) {
        String State = request.getParameter("data");
        System.out.println(State);
        return "成功";
    }
}
