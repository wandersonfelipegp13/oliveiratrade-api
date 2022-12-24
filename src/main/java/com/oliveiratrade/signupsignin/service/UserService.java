package com.oliveiratrade.signupsignin.service;

import com.oliveiratrade.signupsignin.model.dto.UserCreateForm;
import com.oliveiratrade.signupsignin.model.dto.UserResume;

public interface UserService {


    /**
     * Creates a new User in the database.
     * @param userCreateForm Form for user creation.
     * @return Resume of the created User.
     */
    public UserResume create(UserCreateForm userCreateForm) throws Exception;

}
