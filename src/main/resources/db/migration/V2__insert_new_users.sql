--pasword = passadmin
INSERT INTO users (username, password, enabled, email)
VALUES ('admin', '$2a$12$fYpR4ylib8GfcWQmTnZ7vOMgtfwSOOvj5RHwLmNV/mOMhL7u9GVyq', true, 'admin@test.com');
--password = jdbcDefault
INSERT INTO users (username, password, enabled, email)
VALUES ('user', '$2a$12$ogvWkmcvfFBcI1HhlpeSfe1RNg4o4Tj0JslE5pHZs0hl6W5Zo0J5K', true, 'user@test.com');
--password = passuser1
INSERT INTO users (username, password, enabled, email)
VALUES ('user1', '$2a$12$j6L0.0qxATq70AK4yeZ/veaMxjw084xuLXW99wUDyDZU.n7wJlKrG', true, 'user1@test.com');

-- Insert authorities
INSERT INTO authorities (username, authority)
VALUES ('admin', 'ADMIN');

INSERT INTO authorities (username, authority)
VALUES ('user', 'USER');

INSERT INTO authorities (username, authority)
VALUES ('user1', 'USER');