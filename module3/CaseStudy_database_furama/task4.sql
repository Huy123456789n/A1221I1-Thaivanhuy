-- 
use furama_manager;
SET FOREIGN_KEY_CHECKS=0;
select K.ho_ten, LK.ten_loai_khach, count(D.ma_hop_dong) as 'so lan booking'
from loai_khach LK inner join khach_hang K on LK.ma_loai_khach = K.ma_loai_khach 
inner join hop_dong D on K.ma_khach_hang = D.ma_khach_hang 
where LK.ten_loai_khach = 'Diamond'
group by K.ma_khach_hang;