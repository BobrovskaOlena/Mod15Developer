CREATE TABLE note (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(250) NOT NULL CHECK (LENGTH(title) >= 3 AND LENGTH(title) <= 250),
    content VARCHAR NOT NULL
);
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN NOT NULL,
    email VARCHAR(255)
);
CREATE TABLE authorities (
    username VARCHAR(255) NOT NULL,
    authority VARCHAR(255) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users(username)
);