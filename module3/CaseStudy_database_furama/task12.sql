select NV.ho_ten,KH.ho_ten,KH.so_dien_thoai,DV.ten_dich_vu,sum(CT.so_luong)
from nhan_vien NV inner join hop_dong D on NV.ma_nhan_vien = D.ma_nhan_vien
inner join khach_hang KH on KH.ma_khach_hang = D.ma_khach_hang 
inner join dich_vu DV on DV.ma_dich_vu = D.ma_dich_vu
inner join hop_dong_chi_tiet CT on D.ma_hop_dong = CT.ma_hop_dong
inner join dich_vu_di_kem DK on DK.ma_dich_di_kem = CT.ma_dich_vu_di_kem 
group by ngay_lam_hop_dong
having month(ngay_lam_hop_dong) between 9 and 12 and year(ngay_lam_hop_dong) = 2020