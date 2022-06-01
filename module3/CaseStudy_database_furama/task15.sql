select NV.ma_nhan_vien,NV.ho_ten, B.ten_bo_phan, NV.so_dien_thoai,NV.dia_chi,count(H.ma_nhan_vien) as 'SL'
from bo_phan B inner join nhan_vien NV on B.ma_bo_phan = NV.ma_bo_phan
inner join trinh_do T on T.ma_trinh_do = NV.ma_trinh_do
inner join hop_dong H on NV.ma_nhan_vien = H.ma_nhan_vien
where year(H.ngay_lam_hop_dong) between 2020 and 2021
group by H.ma_hop_dong
having SL < 4
