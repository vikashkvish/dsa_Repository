# Write your MySQL query statement below
-- select Max(salary) as SecondHighestSalary
-- from Employee
-- where salary < (select max(salary) from Employee);

With RankedSalaries as(
    select salary,
    Dense_Rank() over (order by salary desc) as salary_rank
    from Employee
)
select Max(salary) as SecondHighestSalary from RankedSalaries
where salary_rank = 2;
