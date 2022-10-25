select name as Employee
from Employee a
where a.Salary > (
    select b.Salary
    from Employee b
    where a.ManagerId = b.Id);