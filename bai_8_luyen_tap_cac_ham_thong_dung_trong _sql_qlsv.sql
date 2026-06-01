use quan_li_sinh_vien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from subjects where credit = (select max(credit) from subjects);
-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select sub.*, m.mark from subjects sub
join marks m on sub.sub_id = m.sub_id
where m.mark = (select max(mark) from marks);
-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần.
select s.*, avg(m.mark) as 'điểm trung bình'
from students s
join marks m on s.student_id = m.student_id
group by s.student_id
order by 'điểm trung bình' desc;