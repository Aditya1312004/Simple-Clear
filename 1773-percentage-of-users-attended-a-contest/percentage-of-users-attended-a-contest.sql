/* Write your PL/SQL query statement below */
select r.contest_id  , 
ROUND(COUNT(DISTINCT r.user_id)* 100 / (select COUNT(*) from Users) , 2) AS percentage
FROM Register r
GROUP BY r.contest_id 
ORDER BY percentage DESC,r.contest_id ASC  