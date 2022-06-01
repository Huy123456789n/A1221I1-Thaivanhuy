select D.ma_hop_dong,L.ten_loai_dich_vu,DK.ten_dich_vu_di_kem,count(CT.ma_dich_vu_di_kem) as 'SL use DV di kem'
from loai_dich_vu L inner join dich_vu DV on L.ma_loai_dich_vu= DV.ma_loai_dich_vu 
inner join hop_dong D on DV.ma_dich_vu = D.ma_dich_vu
inner join hop_dong_chi_tiet CT on D.ma_hop_dong = CT.ma_hop_dong
inner join dich_vu_di_kem DK on DK.ma_dich_di_kem = CT.ma_dich_vu_di_kem
group by CT.ma_dich_vu_di_kem
having count(CT.ma_dich_vu_di_kem) = 1;