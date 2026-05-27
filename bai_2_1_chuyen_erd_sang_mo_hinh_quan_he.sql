CREATE DATABASE chuyen_doi_erd_sang_mo_hinh_quan_he;
USE chuyen_doi_ERD_sang_mo_hinh_quan_he;
CREATE TABLE vattu (
ma_vtu INT PRIMARY KEY,
ten_vtu VARCHAR(100) NOT NULL
);
CREATE TABLE dondh (
so_dh INT PRIMARY KEY,
ngay_dh DATE,
ma_ncc INT,
FOREIGN KEY (ma_ncc) REFERENCES nhacc(ma_ncc)
);
CREATE TABLE nhacc (
ma_ncc INT PRIMARY KEY,
ten_ncc NVARCHAR(50) NOT NULL,
dia_chi NVARCHAR(150),
sdt VARCHAR(20)
);
CREATE TABLE phieu_xuat (
so_px INT PRIMARY KEY,
ngay_xuat DATE
);
CREATE TABLE phieu_nhap (
so_pn INT PRIMARY KEY,
ngay_nhap DATE
);
CREATE TABLE chi_tiet_phieu_xuat (
so_px INT,
ma_vtu int,
dg_xuat DECIMAL(10,2),
sl_xuat INT,
PRIMARY KEY (so_px, ma_vtu),
FOREIGN KEY (so_px) REFERENCES phieu_xuat (so_px),
FOREIGN KEY (ma_vt) REFERENCES vattu (ma_vt)
);
CREATE TABLE chi_tiet_phieu_nhap (
so_pn INT,
ma_vtu int,
dg_nhap DECIMAL(10,2),
sl_nhap INT,
PRIMARY KEY (so_pn, ma_vtu),
FOREIGN KEY (so_pn) REFERENCES phieu_nhap (so_pn),
FOREIGN KEY (ma_vt) REFERENCES vattu (ma_vt)
);
CREATE TABLE chi_tiet_don_dh (
so_dh INT,
ma_vtu int,
PRIMARY KEY (so_dh, ma_vtu),
FOREIGN KEY (so_dh) REFERENCES dondh (so_dh),
FOREIGN KEY (ma_vt) REFERENCES vattu (ma_vt)
);