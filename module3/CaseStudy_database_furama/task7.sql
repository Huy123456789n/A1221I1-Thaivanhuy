select DV.ma_dich_vu,DV.ten_dich_vu,DV.dien_tich,DV.chi_phi_thue,LDV.ten_loai_dich_vu, 
DV.chi_phi_thue,DV.so_nguoi_toi_da
from loai_dich_vu LDV inner join dich_vu DV on LDV.ma_loai_dich_vu = DV.ma_loai_dich_vu
inner join hop_dong D on DV.ma_dich_vu = D.ma_dich_vu
where year(D.ngay_lam_hop_dong) = 2020; 