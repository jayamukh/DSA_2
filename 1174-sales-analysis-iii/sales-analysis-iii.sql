# Write your MySQL query statement below
select p.product_id, p.product_name from product p
right join sales s on s.product_id = p.product_id
GROUP BY p.product_id
HAVING MIN(sale_date) >= '2019-01-01' AND MAX(sale_date) <= '2019-03-31';
