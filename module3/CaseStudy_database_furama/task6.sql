select DV.ma_dich_vu,DV.ten_dich_vu,DV.dien_tich,DV.chi_phi_thue,LDV.ten_loai_dich_vu
from loai_dich_vu LDV inner join dich_vu DV on LDV.ma_loai_dich_vu = DV.ma_loai_dich_vu
inner join hop_dong D on DV.ma_dich_vu = D.ma_dich_vu
where  month(D.ngay_lam_hop_dong) >3 and month(D.ngay_ket_thuc) <=12;
