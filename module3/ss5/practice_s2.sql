DELIMITER //
create PROCEDURE fillAllCustomer()
begin 
select * from customers;
end //
delimiter ; 
call fillAllCustomer();
DELIMITER //
DROP PROCEDURE IF EXISTS `fillAllCustomer`//
create procedure fillAllCustomer()
begin
select * from customer where customerNumber = 1;
end //
delimiter ;