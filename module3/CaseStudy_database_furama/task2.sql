-- Display All information Employee whose name star with H, K, or T and maximum 15 character
use furama_manager;
select *
from nhan_vien
where ho_ten like 'H%' or 'k%' or'T%' and length(ho_ten) <= 15;