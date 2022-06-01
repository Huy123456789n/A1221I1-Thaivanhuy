select Dk.ma_dich_di_kem,Dk.ten_dich_vu_di_kem,Dk.gia, max(CT.so_luong)
from dich_vu_di_kem Dk inner join hop_dong_chi_tiet CT on Dk.ma_dich_di_kem= CT.ma_dich_vu_di_kem
group by CT.ma_hop_dong_chi_tiet
having max(CT.so_luong) = all(select max(so_luong) from hop_dong_chi_tiet)
