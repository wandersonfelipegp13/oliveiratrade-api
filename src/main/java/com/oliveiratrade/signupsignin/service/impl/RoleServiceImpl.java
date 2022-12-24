package com.oliveiratrade.signupsignin.service.impl;

import com.oliveiratrade.signupsignin.model.Role;
import com.oliveiratrade.signupsignin.model.dto.RoleCreateForm;
import com.oliveiratrade.signupsignin.model.dto.RoleResume;
import com.oliveiratrade.signupsignin.repository.RoleRepository;
import com.oliveiratrade.signupsignin.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleResume create(RoleCreateForm roleCreateForm) {
        Role role = new Role(roleCreateForm.getName());
        role = this.roleRepository.save(role);

        return new RoleResume(role.getId(), role.getName());
    }

    @Override
    public RoleResume findByName(String name) throws Exception {
        Role role = this.roleRepository.findByName(name)
                .orElseThrow(() -> new Exception("Role not found"));
        return new RoleResume(role.getId(), role.getName());
    }

}
