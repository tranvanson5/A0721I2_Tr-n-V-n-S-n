use case_study;
/*2. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là
một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.

select * from employee
where (substring_index( employee_name,' ',-1) like 'h%' or substring_index( employee_name,' ',-1) like'k%' or substring_index( employee_name,' ',-1) like 't%')
and length( employee_name)<=15;*/

/*3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select * from customer where 
(substring_index(customer_address,',',-1) in (' Đà Nẵng', ' Quảng Trị'))
 and 
 ( timestampdiff(year,customer_birthday,curdate()) between 15 and 50);*/
 
 /*4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu
lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là
“Diamond”.
 
 select customer.customer_id as CustomerId , customer.customer_name as CustomerName , count(contract.customer_id) as NumberOfBooking
from customer
inner join customer_type
on customer_type.customer_type_id = customer.customer_type_id
inner join contract
on contract.customer_id = customer.customer_id
where customer.customer_type_id = 1
group by CustomerId
order by NumberOfBooking asc; */

/*5. Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong,
ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với
tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng *
Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những
khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select customer.customer_id as CustomerId , customer.customer_name as CustomerName , contract.contract_id as ContractId , service.service_name as ServiceName 
, contract.contract_start_date as StartDate , 'contract_end_ date' as EndDate , (service.service_cost + contract_detail.quantit8/y * attach_service.attach_service_cost) as Total
from customer
inner join customer_type 
on customer.customer_type_id = customer_type.customer_type_id
inner join contract
on customer.customer_id = contract.customer_id
inner join service
on service.service_id = contract.service_id
inner join contract_detail
on contract_detail.contract_id = contract.contract_id
inner join attach_service
on contract_detail.attach_service_id = attach_service.attach_service_id
group by CustomerId 
order by CustomerId asc;*/

/*6. Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue,
ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng
thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3). */ 

-- 7

/*8. Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu
ho_ten không trùng nhau.*/
-- select distinct customer_name from customer;

-- 9 

/*10 Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu
dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong,
ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc,
so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở
dich_vu_di_kem).
select contract.contract_id , contract.contract_start_date , contract.`contract_end_ date` , contract_deposit, sum(contract_detail.attach_service_id) as `sum Attachment Service`
from attach_service 
inner join contract_detail 
on attach_service.attach_service_id = contract_detail.attach_service_id
inner join contract
on contract.contract_id = contract_detail.contract_id
group by contract.contract_id
order by contract_id asc;
*/

/*11. Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách
hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc
“Quảng Ngãi”.*/
select attach_service_id, attach_service_name from contract_detail
inner join attach_service on contract_detail.contract_id = contract.contract_id
inner join contract on contract.contract_id= customer.contract_id
inner join customer on customer.customer_id= customer_id
inner join customer_type on customer.customer_type_id= customer_type.customer_type_id
where (contract_type.contract_type_id=1) and (substring_index(customer_address,',',-1) in (' Vinh', ' Quảng Ngãi '))