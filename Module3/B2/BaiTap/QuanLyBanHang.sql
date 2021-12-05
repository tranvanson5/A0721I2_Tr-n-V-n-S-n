create database QuanLyBanHang;
use QuanLyBanHang;
create table Customer(
cID int auto_increment primary key ,
cName varchar(50),
cAge int 
);

 create table Product (
 pID int auto_increment primary key ,
 pName varchar(50),
 pPrice float
 ); 
 
 create table `Order`(
oID int auto_increment primary key ,
cID int,
oDate date,
oTotalPrice float,
foreign key  (cID) references Customer(cID)
 ); 
 create table OrderDetail(
 oID int ,
 pID int,
 odQTY int,
 primary key (oID,pID),
 foreign key (oID) references `Order`(oID),
 foreign key (pID) references Product(pID)
 )