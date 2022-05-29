-- Display All Information customer have 18 to 50 years old and have address 'Da Nang' or 'Quang Tri'
use furama_manager;
select *
from khach_hang
where year(now()) - year(ngay_sinh) between 18 and 50
and dia_chi = 'DA NANG' or 'Quang tri';