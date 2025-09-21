# Write your MySQL query statement below
select ROUND(SUM(CASE WHEN DATEDIFF(a1.event_date , a2.first_login) = 1 THEN 1 ELSE 0 END) / COUNT(Distinct a1.player_id) ,2) AS fraction
from activity a1 
JOIN (
    select player_id , min(event_date) as first_login 
    from activity 
    group by player_id
)a2 
on a1.player_id = a2.player_id;