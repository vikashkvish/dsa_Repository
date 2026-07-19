# Write your MySQL query statement below
with rankedSalary as(
    select departmentId,
    name, salary,
    Dense_Rank() over (partition by departmentId order by salary desc) as rnk
    from Employee
)
select d.name as "Department", e.name as "Employee", e.salary as "Salary"
from rankedSalary e
join Department d
on e.departmentId = d.id
where rnk = 1 or rnk=2 or rnk = 3;
