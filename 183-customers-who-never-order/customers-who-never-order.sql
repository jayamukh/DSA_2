# Write your MySQL query statement below
/*select name as Customers from Customers where id in(Select id from Customers
Except 
select customerId from Orders);*/

SELECT Name AS 'Customers'
FROM Customers c
LEFT JOIN Orders o
ON c.Id = o.CustomerId
WHERE o.CustomerId IS NULL