use student_manager;
select * from class;
insert into class (idClass,name)
value(1,"a1");
insert into class (idClass,name)
value(2,"a2"),
(3,"a3");
select * from student;
insert into student(idStudent,name,Age,country)
value (1,"Huy",20,"Đà Nẵng");
insert into student(idStudent,name,Age,country)
value (2,"Anh",23,"Đà Nẵng"),
(3,"Quốc",30,"Đà Nẵng");
update student
set name = "Phương"
where idStudent = 2;
delete from student
where idStudent = 2;
