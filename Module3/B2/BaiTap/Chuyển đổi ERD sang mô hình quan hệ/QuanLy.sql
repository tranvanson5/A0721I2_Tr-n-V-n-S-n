create database bt_quanhe;
use bt_quanhe;
create table NHACC(
MNCC int auto_increment primary key,
TENCC varchar(50),
DIACHI varchar(200)
);


create table PHIEUXUAT(
SoPX int auto_increment primary key,
NgayXuat date
);

create table PHIEUNHAP(
SoPN int auto_increment primary key,
NgayNhap date
);

create table SDT(
IDSDT int auto_increment primary key,
SDT varchar(20),
foreign key (IDSDT) references NHACC(MNCC)
);

create table DONDH(
SoDH int auto_increment primary key,
NGAYDH date,
foreign key (SoDH) references NHACC(MNCC)
);
create table VATTU(
MaVTU int auto_increment primary key,
TenVTU varchar(50)
);

create table DONDHVTU(
SoDH int ,
MaVTU int,
primary key (SoDH,MaVTU),
foreign key (SoDH) references  DONDH(SoDH),
foreign key (MaVTU) references VATTU(MaVTU)
);


create table PHIEUNHAPVTU(
MaVTU int,
SoPN int,
DGNhap float,
SLNhap int,
foreign key (MaVTU) references VATTU(MaVTU),
foreign key (SoPN) references PHIEUNHAP(SoPN)
);

create table PHIEUXUATVATTU(
MaVTU int,
SoPX int,
DGXuat float,
SLXuat int,
foreign key (MaVTU) references VATTU(MaVTU),
foreign key (SoPX) references PHIEUXUAT(SoPX)
);

