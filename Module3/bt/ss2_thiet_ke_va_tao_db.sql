create database demo_a07;
use demo_a07;
create table `tai_khoan` (
username varchar(15) primary key,
`password` varchar(100) not null -- là bắt buộc nhập thông tin khi thêm mới hoặc sửa 
);

create table lop_hoc(
ma_lop_hoc int primary key auto_increment,
ten_lop_hoc varchar(100)
);

create table giang_vien(
ma_giang_vien int primary key auto_increment,
ten_giang_vien varchar(100),
ngay_sinh date
);

create table hoc_vien (
-- auto_increment : tự động tăng, áp dụng cho số
ma_hoc_vien int primary key auto_increment,
ten_hoc_vien varchar(100),
ngay_sinh date,
email varchar(100),
-- unique : không trùng lặp
username varchar(15) unique,
ma_lop_hoc int,
foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
foreign key(username) references tai_khoan(username)
);

create table dia_chi(
ma_dia_chi int primary key auto_increment,
dia_chi varchar (255),
ma_hoc_vien int,
foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);

create table giang_vien_day_lop_hoc(
ma_giang_vien int,
ma_lop_hoc int,
primary key(ma_giang_vien,ma_lop_hoc), -- khóa phức hợp
foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
foreign key(ma_lop_hoc) references  lop_hoc(ma_lop_hoc)
);

insert `tai_khoan`(username,`password`) value 
('tranvanson1','123456'),
('tranvanson2','123456'),
('tranvanson3','123456'),
('tranvanson4','123456'),
('tranvanson5','123456'),
('tranvanson6','123456'),
('tranvanson7','123456');

insert into lop_hoc(ten_lop_hoc) value
('a0721i1'),
('a0721i2'),
('a0721i3'),
('a0721i4'),
('a0721i5'),
('a0721i6'),
('a0721i7');

insert into giang_vien(ten_giang_vien,ngay_sinh) value
('haitt1','1990-01-01'),
('haitt2','1990-01-01'),
('haitt3','1990-01-01'),
('haitt4','1990-01-01'),
('haitt5','1990-01-01'),
('haitt6','1990-01-01'),
('haitt7','1990-01-01');

insert into hoc_vien(ten_hoc_vien,ngay_sinh,email,username,ma_lop_hoc ) value
('tranvanson1','2001-03-17','tranvanson231099@gmail.com','tranvanson1',1),
('tranvanson2','2001-03-17','tranvanson231099@gmail.com','tranvanson2',2),
('tranvanson3','2001-03-17','tranvanson231099@gmail.com','tranvanson3',3),
('tranvanson4','2001-03-17','tranvanson231099@gmail.com','tranvanson4',4),
('tranvanson5','2001-03-17','tranvanson231099@gmail.com','tranvanson5',5),
('tranvanson6','2001-03-17','tranvanson231099@gmail.com','tranvanson6',6),
('tranvanson7','2001-03-17','tranvanson231099@gmail.com','tranvanson7',7);
 
 insert into dia_chi(dia_chi,ma_hoc_vien) value
 ('DN1',1),
 ('QN',2),
 ('DN',3),
 ('DN',4),
 ('DN',5),
 ('HN',6),
 ('HCM',7);
  
  insert into giang_vien_day_lop_hoc(ma_giang_vien,ma_lop_hoc) value
  (1,1),
  (2,2),
  (3,3),
  (4,4),
  (5,5),
  (6,6),
  (7,7);
 