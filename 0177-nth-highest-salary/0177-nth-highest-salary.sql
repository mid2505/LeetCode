CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
    select salary into result from (select distinct salary, dense_rank() over (order by salary desc) as r from employee) tab where r = N;
    RETURN result;
    exception
        when NO_DATA_FOUND then
            return null;
END;