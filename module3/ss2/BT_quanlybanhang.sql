CREATE DATABASE quanlybanhang;
USE quanlybanhang;
CREATE TABLE customer(
c_id INT PRIMARY KEY NOT NULL,
c_name VARCHAR(50) NOT NULL,
c_age INT NOT NULL
);
CREATE TABLE orders(
o_id INT PRIMARY KEY NOT NULL,
c_id INT,
o_date DATETIME,
o_totalprice INT,
FOREIGN KEY (c_id) REFERENCES customer(c_id)
);
CREATE TABLE product(
p_id INT PRIMARY KEY NOT NULL,
p_name VARCHAR(50),
p_price INT
);
CREATE TABLE orderDetail(
o_id INT ,
c_id INT ,
od_qty VARCHAR(50),
FOREIGN KEY (o_id) REFERENCES orders(o_id),
FOREIGN KEY (c_id) REFERENCES customer(c_id)
);