CREATE DATABASE DEMO;
USE DEMO;
create table products(
id int primary key,
product_code int,
product_name varchar(50),
product_price double,
product_among int,
productdescription varchar(20),
product_status varchar(10)
);
insert into products
value (1,01,'iphone',2000000,1,'Hàng usa','new'),
(2,02,'iphone11',3000000,1,'Hàng VN','new'),
(3,03,'samsung',4000000,1,'Hàng iceland','new');
create unique index idx_product on products(product_code);
alter table products add index idx_pr (product_name,product_price);
explain select * from products where product_name = 'iphone11' or product_name = 'samsung';
create view view_all as select product_code, product_name, product_price,product_status
from products;
select * from view_all;
update view_all
set product_name = 'OppO'
where product_code = 1;
drop view view_all;
delimiter // 
create procedure findAll()
begin
select * from products;
end // 
delimiter ;
call findAll();
drop procedure addnew;
delimiter //
create procedure addnew(in id int, code int, name varchar(30),price double, among int, des varchar(30),status varchar(30))
begin 
insert into products (id,product_code,product_name,product_price,product_among,productdescription,product_status)
value (id,code,name,price,among,des,status);
end //
delimiter ;
call addnew(4,04,'huwai',300000,1,'usd','new');
delimiter //
create procedure updatenew(in pid int,codep int,namep varchar(30),pricep double, amongp int, desp varchar(30),statusp varchar(30) )
begin
update products
set product_code = codep, product_name = namep, product_price = pricep, product_among = amongp, productdescription = desp,product_status = statusp
where id = pid;
end //
delimiter ;
call updatenew(2,07,'sámung12',120000,3,'vn','new');
delimiter //
create procedure deletep(in idp int) 
begin
delete from products 
where id = idp;
end //
delimiter ;
call deletep(2);