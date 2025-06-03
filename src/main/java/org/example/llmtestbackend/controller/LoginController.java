package org.example.llmtestbackend.controller;

import org.example.llmtestbackend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        boolean result = loginService.login(email, password);
        return result ? "로그인 성공" : "로그인 실패";
    }
}
