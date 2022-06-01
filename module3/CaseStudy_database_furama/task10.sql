select D.ma_hop_dong,D.ngay_lam_hop_dong,D.ngay_ket_thuc,D.tien_dat_coc,sum(CT.so_luong)
from hop_dong D inner join hop_dong_chi_tiet CT on D.ma_hop_dong = CT.ma_hop_dong
inner join dich_vu_di_kem DK on DK.ma_dich_di_kem = CT.ma_dich_vu_di_kem
group by ma_hop_dong;