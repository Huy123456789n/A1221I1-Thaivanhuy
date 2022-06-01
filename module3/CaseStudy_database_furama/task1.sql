-- add new information in sql
use furama_manager;
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
insert into dich_vu_di_kem
value (1,'CF',200000,'VND','new'),
(2,'MT',100000,'VND','new');
insert into hop_dong_chi_tiet
value(1,1,1,2),
(2,2,2,3);    