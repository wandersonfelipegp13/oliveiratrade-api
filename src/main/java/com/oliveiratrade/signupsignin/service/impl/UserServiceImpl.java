package com.oliveiratrade.signupsignin.service.impl;

import com.oliveiratrade.signupsignin.model.Role;
import com.oliveiratrade.signupsignin.model.User;
import com.oliveiratrade.signupsignin.model.dto.RoleResume;
import com.oliveiratrade.signupsignin.model.dto.UserCreateForm;
import com.oliveiratrade.signupsignin.model.dto.UserResume;
import com.oliveiratrade.signupsignin.repository.UserRepository;
import com.oliveiratrade.signupsignin.service.RoleService;
import com.oliveiratrade.signupsignin.service.UserService;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;

    public UserServiceImpl(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
    }

    @Override
    public UserResume create(UserCreateForm userCreateForm) throws Exception {
        User user = new User();
        user.setUsername(userCreateForm.getUsername());
        user.setPassword(userCreateForm.getPassword());
        user.setFullName(userCreateForm.getFullName());
        user.setCpf(userCreateForm.getCpf());
        user.setBirthday(userCreateForm.getBirthday());

        Set<Role> defaultRoles = new LinkedHashSet<>();
        RoleResume roleResume = this.roleService.findByName("ROLE_USER");
        Role defaultUserRole = new Role(roleResume.getName());
        defaultUserRole.setId(roleResume.getId());
        defaultRoles.add(defaultUserRole);
        user.setRoles(defaultRoles);

        user = this.userRepository.save(user);

        UserResume userResume = new UserResume();
        userResume.setUsername(user.getUsername());
        userResume.setFullName(user.getFullName());
        userResume.setBirthday(user.getBirthday());

        return userResume;
    }
}
