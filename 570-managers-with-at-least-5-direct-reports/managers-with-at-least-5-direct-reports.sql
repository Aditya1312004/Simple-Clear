/* Write your PL/SQL query statement below */
select m.name from Employee e
JOIN Employee m on e.managerId = m.id
GROUP BY m.id , m.name
having  COUNT(e.id) >=5