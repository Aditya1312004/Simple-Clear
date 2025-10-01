# Write your MySQL query statement below
select ROUND(SUM(tiv_2016),2) AS tiv_2016 from Insurance i where 

tiv_2015 in(select tiv_2015 from Insurance i2 where 
 i.pid <> i2.pid )

 AND 
 (lat,lon) not in (select lat,lon from Insurance i2 
 where i.pid<> i2.pid)
