USE quanlysinhvien;
INSERT INTO class
VALUE (1,"A12","2020-11-1",1);
INSERT INTO class
VALUE (2,'A13','2021-11-1',1);
INSERT INTO class
VALUE (3,"A14", current_date,0);
SELECT * FROM class;
INSERT INTO student
VALUE(1,"Hung","Ha Noi","0912113113",1,1);
INSERT INTO student
VALUE(2,"Hoa","Hai Phong","",1,1);
INSERT INTO student
VALUE(3,"Manh","HCM","0912113113",0,2);
INSERT INTO subject1
VALUE(1,"CF",5,1);
INSERT INTO subject1
VALUE(2,"C",6,1);
INSERT INTO subject1
VALUE(3,"HDJ",5,1);
INSERT INTO subject1
VALUE(4,"RBDMS",10,1);
INSERT INTO mark(sub_id,student_id,mark)
VALUE(1,1,8),
	(3,2,2),
    (2,3,1);
    SELECT * FROM mark;
    SELECT * FROM student;