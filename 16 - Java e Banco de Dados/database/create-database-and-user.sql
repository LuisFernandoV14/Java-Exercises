create user if not exists 'Luis Fernando'@'localhost' identified by ; -- Got rid of the password for security reasons | Tirei a senha daqui por questão de segurança

create database if not exists projetoJDBC;

grant all privileges on projetoJDBC.* to 'Luis Fernando'@'localhost';
grant all privileges on projetoJDBC.department to 'Luis Fernando'@'localhost';
grant all privileges on projetoJDBC.seller to 'Luis Fernando'@'localhost';

create user if not exists 'team07'@'localhost' identified by "L0614S";

create database if not exists testedb;

grant all privileges on testedb.* to 'team07'@'localhost';
grant all privileges on testedb.department to 'Luis Fernando'@'localhost';
grant all privileges on testedb.seller to 'Luis Fernando'@'localhost';
tb_accountidcliente