USE quanlybanhang;
INSERT INTO customer
VALUE (1,"MINH QUAN",10),
		(2,"NGOC OANH",20),
		(3,"HONG HA",50);
INSERT INTO orders
VALUE(1,1,"2006-3-21",NULL),
(2,2,"2006-3-23",NULL),
(3,1,"2006-3-16",NULL);
INSERT INTO product
VALUE(1,"MAY GIAT",3),
(2,"TU LANH",5),
(3,"DIEU HOA",7),
(4,"QUAT",1),
(5,"BEP DIEN",2);
SET foreign_key_checks = 0;
INSERT INTO orderdetail
VALUE(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
SELECT o_id,c_id,o_date FROM orders;
SELECT C.c_name, P.p_name
FROM customer C join orders O on C.c_id 
= O.c_id join orderdetail D on O.o_id 
= D.o_id join product P on P.p_id 
= P.p_id;
SELECT C.c_name
FROM customer C left join orders O on C.c_id = O.c_id
WHERE O.c_id IS NULL;
SELECT O.o_id,O.o_date,P.p_price *D.od_qty
FROM orders O join orderdetail D on O.o_id = D.o_id join product P on P.p_id = P.p_id;
