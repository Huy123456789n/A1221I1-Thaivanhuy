use quanlysinhvien;
select * from quanlysinhvien.subject1
group by credit
having avg(credit) >= all (select avg(credit) from subject1);
select S.sub_id,S.sub_name,M.mark ,avg(mark)
from subject1 S join mark M on S.sub_id = M.sub_id
group by S.sub_id,S.sub_name,M.mark
having avg(mark) >= all(select avg(mark) from mark);
select S.student_id,S.student_name,S.address,M.mark , avg(mark)
from student S join mark M on S.student_id = M.student_id
group by S.student_id,S.student_name,S.address,M.mark
order by avg(mark) desc;

