# Write your MySQL query statement below
select p.product_name , Sum(o.unit) AS unit from Products p  LEFT JOIN Orders o on 
p.product_id = o.product_id
where MONTH(o.order_date) = 2 AND YEAR(o.order_date) = 2020 group by p.product_id 
having SUM(unit) >= 100  ;