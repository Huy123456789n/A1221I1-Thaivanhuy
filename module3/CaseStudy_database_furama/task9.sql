select * ,count(ma_hop_dong) as 'so lan booking'
from hop_dong
group by year(ngay_lam_hop_dong),month(ngay_lam_hop_dong)
having year(ngay_lam_hop_dong) = 2021;