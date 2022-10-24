SELECT name AS customers 
FROM Customers c
WHERE NOT EXISTS (
    SELECT customerId 
    FROM Orders o 
    WHERE c.id = o.customerId);