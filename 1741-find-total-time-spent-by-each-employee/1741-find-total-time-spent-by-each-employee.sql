/* Write your PL/SQL query statement below */
SELECT TO_CHAR(EVENT_DAY,'YYYY-MM-DD') AS "day", emp_id as "emp_id", SUM(out_time-in_time) as "total_time" FROM employees GROUP BY event_day, emp_id;