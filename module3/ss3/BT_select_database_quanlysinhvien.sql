USE quanlysinhvien;
SELECT * FROM student
WHERE student_name LIKE 'H%';
SELECT * FROM class
WHERE star_date LIKE '%11%';
SELECT * FROM subject1
WHERE credit >3 AND credit < 6;
SET SQL_SAFE_UPDATES = 0;
UPDATE student
SET class_id = 2
WHERE student_name = "Hung";
SELECT S.student_name, sub.sub_name,m.mark
FROM student S join mark m on S.student_id = m.student_id join subject1 sub on m.sub_id = sub.sub_id
ORDER BY mark ASC;