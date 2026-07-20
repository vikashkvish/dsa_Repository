# Write your MySQL query statement below
-- with tempTable(
--     select id, email,
--     Row_number() over (partition by email order by id) as rowN
--     from Person
-- ) 
-- delete * from tempTable
-- where rowN > 1;
delete p1
from Person p1
Join Person p2
on p1.email = p2.email
And p1.id > p2.id;