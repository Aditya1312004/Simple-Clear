
select p.product_id AS product_id, 
    ROUND(NVL(SUM(p.price * u.units) / SUM(u.units) , 0), 2) AS average_price
    from Prices p 
    LEFT JOIN UnitsSold u 
    on p.product_id = u.product_id AND
    u.purchase_date BETWEEN p.start_date AND p.end_date
    GROUP BY p.product_id