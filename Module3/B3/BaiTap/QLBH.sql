use QuanlysanPham;

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
-- select oID, oDate, oTotalPice  from `order`; 

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
-- select customer.`Name`, product.pName from customer
-- inner join `order` on customer.cID= `order`.oID
-- inner join orderdetail on `order`.oID= orderdetail.pID
-- inner join product on product.pID=orderdetail.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
-- select customer.`Name` from customer
-- inner join `order` on customer.cID= `order`.oID
-- where customer.cID <> `order`.cID;



-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
select `order`.oID,`order`.oDate,(odQTY*pPrice) as oTotalPice from `order`
inner join orderdetail on `order`.oID= orderdetail.pID
inner join product on product.pID=orderdetail.pID
