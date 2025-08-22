
select id , movie , description , rating from Cinema WHERE
MOD(id , 2) <>  0 AND description <> 'boring'
ORDER BY rating DESC;