insert into user (id, email, name, password) values (1, 'ihudson', 'isaac', 'passw0rd');
insert into user (id, email, name, password) values (2, 'joe', 'smith', 'password');

insert into role (id, role) values (1, 'ADMIN');
insert into role (id, role) values (2, 'USER');

insert into users_roles (user_id, role_id) values (1, 1);
insert into users_roles (user_id, role_id) values (2, 2);
