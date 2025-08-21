# Write your MySQL query statement below
select MAX(num) as NUM
from
(select num
from MyNumbers
group by num
having COUNT(num) = 1 ) as t