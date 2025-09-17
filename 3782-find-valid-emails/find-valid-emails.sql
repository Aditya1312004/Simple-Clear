# Write your MySQL query statement below
select user_id , email from Users
where email RLIKE '^[a-zA-Z0-9]+@[a-zA-Z]+\\.com$'