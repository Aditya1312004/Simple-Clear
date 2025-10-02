# Write your MySQL query statement below
with temp as (select min(id) as id,email from Person p group by email having 
count(*) > 1)

delete p from Person p INNER JOIN temp t
on t.email = p.email and p.id <> t.id;
