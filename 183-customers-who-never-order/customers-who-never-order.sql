# Write your MySQL query statement below
select name as Customers from Customers where id in(Select id from Customers
Except 
select customerId from Orders);