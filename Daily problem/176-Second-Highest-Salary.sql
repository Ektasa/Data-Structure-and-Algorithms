# Write your MySQL query statement below
Select Max(salary) as SecondHighestSalary from Employee 
where salary<(select Max(salary) from employee);

#order By salary limit 1 offset 1 ;