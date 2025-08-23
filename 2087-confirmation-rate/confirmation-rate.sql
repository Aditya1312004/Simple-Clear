/* Write your PL/SQL query statement below */
select s.user_id  , 
   ROUND(

   NVL(
    SUM(CASE WHEN c.action = 'confirmed' THEN 1 ELSE 0 END) / 
    NULLIF(COUNT(c.user_id) , 0),0),2) AS confirmation_rate
    FROM Signups s
    LEFT JOIN CONFIRMATIONS c
    on s.user_id = c.user_id
    GROUP BY s.user_id 
    
    
