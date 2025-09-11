# Write your MySQL query statement below
Update salary 
set sex = Case sex
        when 'f' THEN 'm'
        when 'm' THEN 'f'
        END;