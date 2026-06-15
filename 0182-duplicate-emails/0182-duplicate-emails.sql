/* Write your PL/SQL query statement below */
select t.email as "Email" from Person t group by email having count(email) > 1;