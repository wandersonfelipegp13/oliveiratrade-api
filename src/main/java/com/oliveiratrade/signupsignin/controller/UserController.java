package com.oliveiratrade.signupsignin.controller;

import com.oliveiratrade.signupsignin.model.dto.UserCreateForm;
import com.oliveiratrade.signupsignin.model.dto.UserResume;
import com.oliveiratrade.signupsignin.repository.UserRepository;
import com.oliveiratrade.signupsignin.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService,
                          UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<UserResume> create(@RequestBody @Valid UserCreateForm userCreateForm) throws Exception {
        var userResume = this.userService.create(userCreateForm);
        return ResponseEntity.status(CREATED).body(userResume);
    }

    @GetMapping("profile")
    public ResponseEntity<UserResume> profile(Principal principal) {
        System.out.println(principal.getName());
        var user = userRepository.findByUsername(principal.getName());
        if (user.isPresent()) {
            UserResume userResume = new UserResume();
            userResume.setUsername(user.get().getUsername());
            userResume.setFullName(user.get().getFullName());
            userResume.setBirthday(user.get().getBirthday());
            return ResponseEntity.status(OK).body(userResume);
        }
        return ResponseEntity.notFound().build();
    }

}
