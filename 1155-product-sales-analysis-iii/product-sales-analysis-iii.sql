/* Write your PL/SQL query statement below */
select s.product_id , s.year as first_year , s.quantity , s.price
from Sales s where s.year = (Select min(p.year) from sales p 
where p.product_id = s.product_id)