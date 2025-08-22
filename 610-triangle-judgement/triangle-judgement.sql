# Write your MySQL query statement below
select x, y, z, 

case 
    when x+ y > z  AND x+ z > y AND z+ y > x then 'Yes'
    Else 'No'
    END AS triangle
FROM
    Triangle;