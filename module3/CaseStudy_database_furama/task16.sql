SET SQL_SAFE_UPDATES = 0;
delete from nhan_vien
where ma_nhan_vien not in (select ma_nhan_vien from (select distinct NV.ma_nhan_vien from nhan_vien NV inner join hop_dong D on
NV.ma_nhan_vien = D.ma_nhan_vien
where year(D.ngay_lam_hop_dong) between 2017 and 2020 )as tmp );