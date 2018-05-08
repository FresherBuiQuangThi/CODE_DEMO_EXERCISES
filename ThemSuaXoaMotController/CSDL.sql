use quanlysinhvien;
CREATE TABLE ThanhVien (
id VARCHAR(20),
Ho VARCHAR(255) NOT NULL,
Ten VARCHAR(255) NOT NULL,
TaiKhoan VARCHAR(255) NOT NULL,
PRIMARY KEY (id)
);

insert into quanlysinhvien.thanhvien values
('1','Bui Quang','Thi','28 nhat tao'),
('2','Bui Quang','Thi','28 nhat tao'),
('3','Bui Quang','Thi','28 nhat tao'),
('4','Bui Quang','Thi','28 nhat tao'),
('5','Bui Quang','Thi','28 nhat tao'),
('6','Bui Quang','Thi','28 nhat tao'),
('7','Bui Quang','Thi','28 nhat tao'),
('8','Bui Quang','Thi','28 nhat tao'),
('9','Bui Quang','Thi','28 nhat tao'),
('10','Bui Quang','Thi','28 nhat tao'),
('11','Bui Quang','Thi','28 nhat tao');

select * from quanlysinhvien.thanhvien;

