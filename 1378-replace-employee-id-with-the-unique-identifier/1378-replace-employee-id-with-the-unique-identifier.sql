/* Write your PL/SQL query statement below */
select eu.unique_id as "unique_id", e.name as "name" from employees e left outer join employeeuni eu on e.id = eu.id;