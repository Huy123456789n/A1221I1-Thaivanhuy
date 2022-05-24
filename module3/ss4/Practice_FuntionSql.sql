USE quanlysinhvien;
select address
from student;
insert into student
value (4,'hai','Ha Noi','0123456',1,1);
SELECT address, count(student_id) as 'Sl hoc vien'
from student
group by address;
select S.student_id,S.student_name, avg(mark)
from student S join mark M on S.student_id = M.student_id
group by S.student_id, S.student_name
having avg(mark) >5;
select S.student_id,S.student_name, avg(mark)
from student S join mark M on S.student_id = M.student_id
group by S.student_id, S.student_name
HAVING AVG(mark) >= ALL (SELECT AVG(mark) FROM mark GROUP BY mark.student_id);