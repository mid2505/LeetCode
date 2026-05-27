/* Write your PL/SQL query statement below */
select s.name as "name" from salesperson s where s.sales_id not in (select sales_id from orders o natural join company c where c.name like 'RED');