package com.oliveiratrade.signupsignin;

import com.oliveiratrade.signupsignin.model.Role;
import com.oliveiratrade.signupsignin.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Seed for create default roles in the database.
 */
@Component
public class DefaultRolesSeed  implements CommandLineRunner {

    private final RoleRepository roleRepository;

    public DefaultRolesSeed(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.roleRepository.count() == 0) {
            this.roleRepository.save(new Role("ROLE_USER"));
            this.roleRepository.save(new Role("ROLE_ADMIN"));
        }
    }
}
