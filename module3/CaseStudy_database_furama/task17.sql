select KH.ho_ten, LK.ten_loai_khach, sum(DV.chi_phi_thue)
from loai_khach LK inner join khach_hang KH on LK.ma_loai_khach = KH.ma_khach_hang
inner join hop_dong D on KH.ma_khach_hang = D.ma_khach_hang
inner join dich_vu DV on DV.ma_dich_vu = D.ma_dich_vu
where year(ngay_lam_hop_dong) = 2021
group by D.ma_dich_vu;
update khach_hang
set ma_khach_hang = 1
where ma_khach_hang = 2 and (select chi_phi_thue from dich_vu) >= 10000000