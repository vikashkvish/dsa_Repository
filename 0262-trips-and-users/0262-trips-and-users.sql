# Write your MySQL query statement below
SELECT request_at as Day,
ROUND(SUM(CASE When status != 'completed' Then 1 ELSE 0 END)/COUNT(id),2) AS "Cancellation Rate"
FROM Trips
Where request_at BETWEEN '2013-10-01' AND '2013-10-03'
AND client_id NOT IN (SELECT users_id FROM Users WHERE banned = 'Yes')
AND driver_id NOT IN (SELECT users_id FROM Users WHERE banned = 'Yes')
GROUP BY request_at;
