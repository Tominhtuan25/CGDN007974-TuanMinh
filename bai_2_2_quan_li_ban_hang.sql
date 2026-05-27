CREATE DATABASE quan_li_ban_hang;
USE quan_li_ban_hang;
CREATE TABLE cutomers (
c_id INT AUTO_INCREMENT PRIMARY KEY,
c_name NVARCHAR(50) NOT NULL,
c_age INT
);
CREATE TABLE products (
p_id INT AUTO_INCREMENT PRIMARY KEY,
p_name NVARCHAR(50) NOT NULL,
p_price DECIMAL(10,2)
);
CREATE TABLE orders (
o_id INT AUTO_INCREMENT PRIMARY KEY,
c_id INT AUTO_INCREMENT,
o_date DATE,
o_total_price DECIMAL(10,2),
FOREIGN KEY (c_id) REFERENCES customers (c_id)
);
CREATE TABLE order_details (
o_id INT,
P_id INT,
od_qty INT,
PRIMARY KEY (o_id,P_id),
FOREIGN KEY (o_id) REFERENCES orders (o_id),
FOREIGN KEY (p_id) REFERENCES product (p_id)
);