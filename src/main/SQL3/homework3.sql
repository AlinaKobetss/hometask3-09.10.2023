1.Вывести данные о товарах (проекция: названиетовара, цена, названиекатегории, названиекомпаниипоставщика)
SELECT
Products.ProductName,
Products.Price,
Products.CategoryID,
Suppliers.SupplierName
FROM Products
Join Suppliers on Products.SupplierID = Suppliers.SupplierID
---------------------------------------------------
(2) Вывести список стран, которые поставляют морепродукты

SELECT
Country
FROM Suppliers
JOIN Products ON Suppliers.SupplierID = Products.SupplierID
JOIN Categories ON Categories.CategoryID = Products.CategoryID
WHERE Categories.CategoryName = 'Seafood'

--------------------------------------------------------------
(3) Вывести два самых дорогих товара из категории Beverages из USA

SELECT*
FROM Products
JOIN Suppliers ON Suppliers.SupplierID = Products.SupplierID
JOIN Categories ON Categories.CategoryID = Products.CategoryID
WHERE Categories.CategoryName = 'Beverages'
AND
Suppliers.Country = 'USA'
ORDER BY Price DESC
LIMIT 2

-------------------------------------------------
(4) Вывести название и стоимость в USD одного самого дорогого проданного товара

SELECT
ProductName,
Price * 1.09 AS USD
FROM Products
JOIN Suppliers ON Suppliers.SupplierID = Products.SupplierID
WHERE
Suppliers.Country = "USA"
ORDER BY Price DESC
LIMIT 1
-----------------------------------------------------
(5) Дайте короткий ответ на вопрос: в чем отличие БД от СУБД
БД это база данных(организованная коллекция данных), а СУБД это комплекс программ, позволяющих создать и взаимодействовать с базой данных.

