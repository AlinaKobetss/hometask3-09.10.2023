1.Вывести сред/стоимость товаров из категорий 1, 2, 5, у которых название начинается с буквы t

SELECT
AVG(Price) AS avg_price
FROM Products
where
CategoryID in (1,2,5)
and
ProductName like 't%'

2.Посчитать стоимость заказа 10248

SELECT
 SUM(Products.Price) AS total_cost
FROM OrderDetails
JOIN Products ON Products.ProductID = OrderDetails.ProductID
where
OrderDetails.OrderID = 10248

3.Вывести кол-во товаров с ценой от 10 до 250 EUR

SELECT
COUNT(*) AS total_products
FROM Products
where
(Price between 10 and 250)

4.Вывести сумму, на которую было отправлено товаров клиентам в Germany

SELECT
SUM(Products.Price) AS total_cost
FROM Products
Join Suppliers on Products.SupplierID = Suppliers.SupplierID
where
Suppliers.Country = 'Germany'

5.С помощью инструмента онлайн-проектирования опишите схему БД "чат поддержки" (базовые сущности и характеристики)

Table users {
id int
username varchar
email varchar
}

Table chats {
id int
user1_id int
user2_id int
created_at timestamp
}

Table messages {
id int
chat_id int
user_id int
content text
}

Table support_requests {
id int
user_id int
status varchar
created_at timestamp
}



