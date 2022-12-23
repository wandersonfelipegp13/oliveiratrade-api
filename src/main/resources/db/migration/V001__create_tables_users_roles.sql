CREATE TABLE roles (
    id CHAR(36) PRIMARY KEY,
    name VARCHAR(30) UNIQUE NOT NULL
);

CREATE TABLE users (
    id CHAR(36) PRIMARY KEY,
    username VARCHAR(30) UNIQUE NOT NULL,
    password VARCHAR(72) NOT NULL,
    full_name VARCHAR(100) NOT NULL,
    -- TODO fix define size
    cpf VARCHAR(14) UNIQUE NOT NULL,
    birthday CHAR(10) NOT NULL
);

CREATE TABLE users_roles (
    user_id char(36),
    roles_id char(36),

    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT fk_role FOREIGN KEY (roles_id) REFERENCES roles(id)
);
