CREATE DATABASE quanlysinhvien;
USE quanlysinhvien;
CREATE TABLE class(
class_id INT PRIMARY KEY NOT NULL,
class_name VARCHAR(60) NOT NULL,
star_date DATETIME NOT NULL,
status BIT
);
CREATE TABLE student(
student_id INT PRIMARY KEY NOT NULL auto_increment,
student_name VARCHAR(30) NOT NULL,
address VARCHAR(50),
phone VARCHAR(30),
status BIT,
class_id INT NOT NULL,
FOREIGN KEY (class_id) REFERENCES class(class_id)
);
	CREATE TABLE subject1(
    sub_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sub_name VARCHAR(30) NOT NULL,
    credit TINYINT NOT NULL DEFAULT 1 CHECK(credit >=1),
    status BIT DEFAULT 1
    );
    CREATE TABLE mark(
    mark_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sub_id INT NOT NULL UNIQUE,
    student_id INT NOT NULL UNIQUE,
     mark FLOAT DEFAULT 0 CHECK (mark BETWEEN 0 AND 100),
     FOREIGN KEY (sub_id) REFERENCES subject1(sub_id),
     FOREIGN KEY (student_id) REFERENCES student(student_id)
    );