use classicmodels;
alter table customers add index idex_name(customerName);
explain select * 
from customers 
where customerName ='Land of Toys Inc.';
alter table customers add index index_full (contactLastName,contactFirstName);
EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';
ALTER TABLE customers DROP INDEX idx_full_name