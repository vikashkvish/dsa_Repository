# Write your MySQL query statement below
with RankedSalary AS(
    select departmentId,
    name, salary,
    Rank() over (partition by departmentId  order by salary desc) as rnk
    from Employee
)
Select d.name as "Department", e.name as "Employee", e.salary as "Salary"
from RankedSalary e
join Department d
on e.departmentId = d.id
where rnk = 1;
