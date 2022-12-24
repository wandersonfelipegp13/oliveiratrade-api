package com.oliveiratrade.signupsignin.controller;

import com.oliveiratrade.signupsignin.service.JwtService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("token")
public class JwtController {

    private final JwtService jwtService;

    public JwtController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping
    public String generateToken(Authentication authentication) {
        return jwtService.generateToken(authentication);
    }

}
