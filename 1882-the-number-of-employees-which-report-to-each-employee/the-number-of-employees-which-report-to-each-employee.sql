# Write your MySQL query statement below
select e.employee_id , e.name , COUNT(t.reports_to) AS reports_count
, ROUND(AVG(t.age)) AS average_Age FROM Employees e 
JOIN Employees t on e.employee_id = t.reports_to
GROUP BY t.reports_to
having count(t.reports_to) > 0
ORDER BY e.employee_id
