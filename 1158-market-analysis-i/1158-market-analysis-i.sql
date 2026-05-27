/* Write your PL/SQL query statement below */


select u.user_id as "buyer_id", TO_CHAR(u.join_date,'YYYY-MM-DD') as "join_date", count(o.order_id) as "orders_in_2019" from users u left join orders o on u.user_id = o.buyer_id and TO_CHAR(o.order_date,'YYYY') like '2019' group by u.user_id,u.join_date;

-- select o.buyer_id as "buyer_id", u.join_date as "join_date", count(*) as "orders_in_2019" from orders o join users u on o.buyer_id = u.user_id where TO_CHAR(o.order_date,'YYYY') like '2019';