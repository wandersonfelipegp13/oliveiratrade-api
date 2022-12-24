package com.oliveiratrade.signupsignin.controller;

import com.oliveiratrade.signupsignin.model.dto.UserCreateForm;
import com.oliveiratrade.signupsignin.model.dto.UserResume;
import com.oliveiratrade.signupsignin.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResume> create(@RequestBody @Valid UserCreateForm userCreateForm) throws Exception {
        var userResume = this.userService.create(userCreateForm);
        return ResponseEntity.status(CREATED).body(userResume);
    }

}
