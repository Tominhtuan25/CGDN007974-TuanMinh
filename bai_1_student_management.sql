create database student_management;
use student_management;
create table class(
id int auto_increment primary key,
name varchar(50) not null
);
create table teachers(
id int auto_increment primary key,
name varchar(50) not null,
age int,
country varchar(100) not null
);