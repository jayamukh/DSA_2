# Write your MySQL query statement below
Update salary
set sex = case sex

WHEN 'f' THEN 'm'
    Else 'f'
    end;
