use furama_manager;
select K.ma_khach_hang,K.ho_ten,LK.ten_loai_khach,D.ma_hop_dong,DV.ten_dich_vu,D.ngay_lam_hop_dong,
D.ngay_ket_thuc, DV.chi_phi_thue + CT.so_luong * DK.gia as 'Tong Tien'
from loai_khach LK inner join khach_hang K on LK.ma_loai_khach = K.ma_loai_khach 
left join hop_dong D on K.ma_khach_hang = D.ma_khach_hang 
left join dich_vu DV on DV.ma_dich_vu = D.ma_dich_vu 
left join hop_dong_chi_tiet CT on D.ma_hop_dong = CT.ma_hop_dong
left join dich_vu_di_kem DK on DK.ma_dich_di_kem = CT.ma_dich_vu_di_kem;