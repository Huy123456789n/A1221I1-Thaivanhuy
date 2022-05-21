USE quanlysinhvien;
SELECT * FROM student
WHERE status = true;
SELECT * FROM subject1
WHERE credit <10;
SELECT S.student_id,S.student_name,C.class_id
FROM student S join class C on S.class_id = C.class_id
WHERE C.class_name = "A12";
SELECT S.student_id,S.student_name,sub.sub_name,m.mark
FROM student S join mark m on S.student_id = m.student_id join subject1 sub on m.sub_id = sub.sub_id
WHERE sub_name = "CF";
