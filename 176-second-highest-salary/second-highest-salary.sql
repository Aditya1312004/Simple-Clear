# Write your MySQL query statement below
with cte as (
    select salary , dense_rank() over(order by salary desc) AS "SecondRank" from Employee
)
select COALESCE((select salary from cte where SecondRank = 2 limit 1), null) as SecondHighestSalary