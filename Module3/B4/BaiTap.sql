use quanlysinhvien;
SELECT * FROM `subject`;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select Max(Credit) as 'Max Credit' from `subject`; 

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select SubName,  Max(mark.Mark) as 'Max Mark' from `subject` 
inner join mark on `subject`.SubId= mark.SubId;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select StudentName, avg(mark.Mark) as 'Max Mark' from student 
inner join mark on student.StudentId= mark.StudentId
group by student.StudentName 
order by mark.Mark desc;
