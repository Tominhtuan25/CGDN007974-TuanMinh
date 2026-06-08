create database demo_products;
use demo_products;
create table products (
id int auto_increment primary key,
product_code varchar(50) not null,
product_name varchar(100) not null,
product_price decimal(5,2),
product_amount int,
product_description text,
product_status varchar(100)
);