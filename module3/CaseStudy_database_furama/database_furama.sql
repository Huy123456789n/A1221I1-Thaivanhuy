CREATE DATABASE furama_manager;
use furama_manager;
CREATE TABLE vi_tri(
ma_vi_tri INT primary KEY NOT NULL,
ten_vi_tri VARCHAR(45)
);
create table trinh_do(
ma_trinh_do INT primary key not null,
ten_trinh_do VARCHAR(45)
);
create table bo_phan(
ma_bo_phan INT primary key not null,
ten_bo_phan VARCHAR(45)
);
create table nhan_vien(
ma_nhan_vien INT primary key not null,
ho_ten VARCHAR(45),
ngay_sinh DATE,
so_cmnd VARCHAR(45),
luong DOUBLE,
so_dien_thoai VARCHAR(45),
email VARCHAR(45),
dia_chi VARCHAR(45),
ma_vi_tri INT,
ma_trinh_do INT,
ma_bo_phan INT,
foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key (ma_bo_phan) references bo_phan(ma_bo_phan) 
);
create table loai_khach(
ma_loai_khach INT primary key,
ten_loai_khach VARCHAR(45)
);
create table khach_hang(
ma_khach_hang INT primary key,
ma_loai_khach INT,
ho_ten VARCHAR(45),
ngay_sinh DATE,
gioi_tinh BIT(1),
so_cmnd VARCHAR(45),
so_dien_thoai VARCHAR(45),
email VARCHAR(45),
dia_chi VARCHAR(45),
foreign key (ma_loai_khach) references loai_khach(ma_loai_khach)
);
create table hop_dong(
ma_hop_dong INT primary key,
ngay_lam_hop_dong DATETIME,
ngay_ket_thuc DATETIME,
tien_dat_coc DOUBLE,
ma_nhan_vien INT,
ma_khach_hang INT,
ma_dich_vu INT,
foreign key (ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key (ma_khach_hang) references khach_hang(ma_khach_hang)
);
create table kieu_thue(
ma_kieu_thue INT primary key,
ten_kieu_thue VARCHAR(45)
);
create table loai_dich_vu(
ma_loai_dich_vu INT primary key,
ten_loai_dich_vu VARCHAR(45)
);
create table dich_vu(
ma_dich_vu INT primary key,
ten_dich_vu VARCHAR(45),
dien_tich INT,
chi_phi_thue DOUBLE,
so_nguoi_toi_da INT,
ma_kieu_thue INT,
ma_loai_dich_vu INT,
tieu_chuan_phong VARCHAR(45),
mo_ta_tien_nghi_khac VARCHAR(45),
dien_tich_ho_boi DOUBLE,
so_tang INT,
foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);
create table dich_vu_di_kem(
ma_dich_di_kem INT primary key,
ten_dich_vu_di_kem VARCHAR(45),
gia DOUBLE,
don_vi VARCHAR(10),
trang_thai VARCHAR(45)
);
create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet INT primary key,
ma_hop_dong INT,
ma_dich_vu_di_kem INT,
so_luong INT);
-- Thêm mới thông tin vào table
SET FOREIGN_KEY_CHECKS=0;
insert into nhan_vien
value(1,'HUY','1999-10-01','12345678',1000000,'0765932858','thaihuy@gmail.com','DA NANG',1,1,1);
insert into nhan_vien
value(2,'HOANG','1998-10-01','12345678',1000000,'07659328548','thai@gmail.com','HA NOI',1,2,1),
(3,'THANH','1993-06-01','12845678',2000000,'0369328548','thaithanh@gmail.com','HAI PHONG',2,2,2),
(4,'KHOA','1990-02-01','52545678',3000000,'0869328548','khoa@gmail.com','QUANG TRI',3,2,1);
SET SQL_SAFE_UPDATES = 0;
update nhan_vien
set ngay_sinh = '2003-08-11'
where ho_ten = 'THANH';
insert into khach_hang
value(1,1,'HUNG','1999-10-07','nam','38743622','0983523257','huythai@gmail.com','DA NANG'),
(2,1,'HOANG','2003-10-01','nu','85743622','0523523257','hoangthai@gmail.com','HA NOI'),
(3,2,'TOAN','1991-12-07','nu','133333622','0483523257','toanthai@gmail.com','HCM');
alter table khach_hang
modify column gioi_tinh varchar(20);
insert into loai_khach
value(1,'Diamond'),
(2,'Platinum'),
(3,'Gold');
insert into hop_dong
value(1,'2016-10-01','2017-10-01',500000,1,2,1),
(2,'2018-05-10','2019-05-10',300000,2,1,1);
insert into loai_dich_vu
value(1,'Theo ngày'),
	(2,'Theo năm');
update loai_dich_vu
set ten_loai_dich_vu = '5 sao'
where ma_loai_dich_vu = 1;  
update loai_dich_vu
set ten_loai_dich_vu = '4 sao'
where ma_loai_dich_vu = 2;
insert into dich_vu
value(1,'Villa',100,1000000,4,1,1,'STD','không có',50,3),
	(2,'House',300,4000000,10,2,1,'STD','không có',100,2);
