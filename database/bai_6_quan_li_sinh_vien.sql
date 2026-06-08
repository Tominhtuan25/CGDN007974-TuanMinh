create database quan_li_sinh_vien;
use quan_li_sinh_vien;
create table classes(
class_id int auto_increment primary key,
class_name varchar(50) not null,
start_date date not null,
status bit
);
create table students (
student_id int auto_increment primary key,
student_name varchar(50) not null,
address varchar(100),
phone varchar(15),
status bit,
class_id int not null,
foreign key (class_id) references classes (class_id)
);
create table subjects (
sub_id int auto_increment primary key,
sub_name nvarchar(15) not null,
credit tinyint not null default 1 check (credit >= 1),
status bit default 1
);
create table marks (
mark_id int auto_increment primary key,
sub_id int not null,
student_id int not null,
mark decimal(4,2) check (mark >= 0 and mark <= 100),
exam_times tinyint default 1,
unique (sub_id, student_id, exam_times),
foreign key (sub_id) references subjects (sub_id),
foreign key (student_id) references students (student_id)
);
insert into classes (class_name, start_date, status )
values 
   ('A1' , '2008-12-20', 1 ),
   ('A2' , '2008-12-22', 1 ),
   ('B3' , current_date, 0 );
insert into students (student_name, address, phone, status, class_id )
values 
   ('Hung' , 'Ha Noi', '0912113113', 1, 1 ),
   ('Hoa' , 'Hai Phong', null, 1, 1 ),
   ('Manh' , 'HCM', '0123123123', 0, 2 );
   insert into subjects (sub_name, credit, status)
   values
   ('CF', 5, 1),
   ('C', 6, 1),
   ('HDJ', 5, 1),
   ('RDBMS', 10, 1);
insert into marks (sub_id, student_id, mark, exam_times)
values 
   (1, 1, 8, 1 ),
   (1 ,2, 10, 2 ),
   (2 , 1, 12, 1 );
   -- Hiển thị danh sách tất cả học viên.
   select * from students;
   -- Hiển thị danh sách các học viên đang theo học.
   select * from students where status = true;
   -- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
   select * from subjects where credit < 10;
   -- Hiển thị danh sách học viên lớp A1.
   select 
         s.student_id, 
         s.student_name, 
		 c.class_name
   from students s join classes c on s.class_id = c.class_id
   where c.class_name = 'A1';
   -- Hiển thị điểm môn CF của các học viên.
   select
        s.student_id,
        s.student_name,
        sub.sub_name, 
		m.mark
   from students s join marks m on s.student_id = m.student_id
   join subjects sub on m.sub_id = sub.sub_id
   where sub.sub_name = 'CF';
   -- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’.
   select * from students where student_name like 'h%';
   -- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
   select * from classes where month(start_date) = 12;
   -- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
   select * from subjects where credit between 3 and 5;
   -- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
   update students set class_id = 2 where student_name = 'Hung';
   /* Hiển thị các thông tin: StudentName, SubName, Mark. 
   Dữ liệu sắp xếp theo điểm thi (mark) giảm dần.
   Nếu trùng sắp theo tên tăng dần */
   select 
		s.student_name, 
        sub.sub_name,
        m.mark 
   from marks m
   join students s on m.student_id = s.student_id
   join subjects sub on m.sub_id = sub.sub_id
   order by m.mark desc, s.student_name asc;
   drop database if exists quan_li_sinh_vien;