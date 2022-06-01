select K.ho_ten, LK.ten_loai_khach,K.dia_chi,DK.ma_dich_di_kem,DK.ten_dich_vu_di_kem,DK.gia
from loai_khach LK inner join khach_hang K on LK.ma_loai_khach = 
K.ma_loai_khach inner join hop_dong D on K.ma_khach_hang = D.ma_khach_hang
inner join hop_dong_chi_tiet CT on D.ma_hop_dong = CT.ma_hop_dong
inner join dich_vu_di_kem DK on DK.ma_dich_di_kem = CT.ma_dich_vu_di_kem
where LK.ten_loai_khach = 'Diamond' and K.dia_chi = 'VINH' or 'Quang Ngai';