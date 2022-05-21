create database quanlydiemthi;
USE quanlydiemthi;
CREATE TABLE hoc_sinh(
ma_hs VARCHAR(20) PRIMARY KEY,
ten_hs VARCHAR(45),
ngay_sinh DATETIME,
lop VARCHAR(10),
GT VARCHAR(50)
);
CREATE TABLE mon_hoc(
ma_mh VARCHAR(20) PRIMARY KEY,
ten_mh VARCHAR(20)
);
CREATE TABLE bang_diem(
ma_hs VARCHAR(20),
ma_mh VARCHAR(20),
diem_thi INT,
ngay_thi DATETIME,
PRIMARY KEY(ma_hs,ma_mh),
foreign key (ma_hs) references hoc_sinh(ma_hs),
foreign key(ma_mh) references mon_hoc(ma_mh)
);
SELECT * FROM bang_diem;
CREATE TABLE giao_vien(
ma_gv VARCHAR(20) PRIMARY KEY,
ten_gv VARCHAR(20),
sdt INT
);
ALTER TABLE mon_hoc ADD ma_GV VARCHAR(20);
ALTER TABLE mon_hoc ADD constraint FK_ma_gv foreign key(ma_GV)references giao_vien(ma_gv);