DELIMITER //
create procedure test (in a int)
begin
select * from customers where customerNumber = a;
end //
delimiter ;
call test(112);
select * from customers