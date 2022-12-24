package com.oliveiratrade.signupsignin.service;

import com.oliveiratrade.signupsignin.model.dto.RoleCreateForm;
import com.oliveiratrade.signupsignin.model.dto.RoleResume;

public interface RoleService {

    /**
     * Creates a new Role in the database.
     * @param roleCreateForm Form for Role creation.
     * @return Resume of the Role created.
     */
    public RoleResume create(RoleCreateForm roleCreateForm);

    /**
     * Find a Role by the name.
     * @param name Role name.
     * @return Resume of the Role.
     */
    public RoleResume findByName(String name) throws Exception;


}
