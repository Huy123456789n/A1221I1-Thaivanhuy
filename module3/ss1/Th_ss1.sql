create database thuc_hanh;
use thuc_hanh;
create table mon_hoc(
ma_mh int,
ten_mh varchar(100)
);
select * from mon_hoc;
insert into mon_hoc(ma_mh,ten_mh)
value (1,"sinh");
insert into mon_hoc(ma_mh,ten_mh)
value(2,"toán"),
(3,"lý");
SET SQL_SAFE_UPDATES = 0;
update mon_hoc
set ten_mh = "van"
where ma_mh = 2;
delete from mon_hoc
where ma_mh = 2;

