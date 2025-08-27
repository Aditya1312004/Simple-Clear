/* Write your PL/SQL query statement below */
select teacher_id ,
 COUNT(DISTINCT subject_id) AS cnt
from Teacher 
GROUP BY teacher_id 
ORDER BY teacher_id ASC;