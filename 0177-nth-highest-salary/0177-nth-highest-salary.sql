CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      WITH RankedSalaries AS(
        SELECT salary,
        DENSE_RANK() over (ORDER BY salary DESC) as salary_rank
        from Employee
      )
      SELECT Max(salary) from RankedSalaries
      where salary_rank = N

  );
END