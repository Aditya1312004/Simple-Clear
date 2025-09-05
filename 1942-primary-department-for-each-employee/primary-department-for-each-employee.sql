/* Write your PL/SQL query statement below */
select DISTINCT employee_id , department_id
from Employee
where primary_flag = 'Y' 
OR employee_id in(select employee_id 
    from Employee GROUP BY employee_id
    having COUNT(*) = 1
)