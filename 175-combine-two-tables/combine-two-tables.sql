# Write your MySQL query statement below
Select firstname, lastname, city, state from person p 
left outer join Address a on p.personId = a.personId