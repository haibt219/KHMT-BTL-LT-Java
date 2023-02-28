DROP DATABASE IF EXISTS TuitionFeeManagement;
CREATE DATABASE IF NOT EXISTS TuitionFeeManagement;
USE TuitionFeeManagement;

-- Tạo bảng Khoa (VD: Khoa CNTT) --
DROP TABLE IF EXISTS Faculty;
CREATE TABLE Faculty (
	FacultyID 		INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    FacultyName 	VARCHAR(50) NOT NULL UNIQUE KEY
);

-- Tạo bảng lớp (VD: Lớp KHMT2020IT69)
DROP TABLE IF EXISTS ClassOfStudent;
CREATE TABLE ClassOfStudent (
	ClassID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ClassName		CHAR(50) NOT NULL UNIQUE KEY
);

-- Tạo bảng sinh viên --
DROP TABLE IF EXISTS Users;
CREATE TABLE Users (
	UserID 				INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	Fullname			VARCHAR(50) NOT NULL,
	Gender				ENUM('MALE', 'FEMALE', 'UNKNOWN') NOT NULL,
	Birthday			DATE NOT NULL,
	Address				VARCHAR(200) NOT NULL,
    NumberPhone			CHAR(10) NOT NULL,
	Email				CHAR(50) NOT NULL UNIQUE KEY,
	Username			CHAR(50) NOT NULL UNIQUE KEY,
	`Password`			CHAR(24) NOT NULL,
	`Role`				ENUM('ADMIN', 'STUDENT'),
	FacultyID			INT UNSIGNED NOT NULL,
    TotalMoneyAvailable	DOUBLE DEFAULT 0,
    TotalDebt			DOUBLE DEFAULT 0,
    YearOfExperience	INT DEFAULT 0,
    CreateDate			DATETIME DEFAULT NOW(),
    FOREIGN KEY (FacultyID) REFERENCES Faculty(FacultyID)
);

-- Tạo bảng học phần --
DROP TABLE IF EXISTS `Subject`;
CREATE TABLE `Subject` (
	SubjectID		INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    SubjectName		VARCHAR(50) NOT NULL UNIQUE KEY,
    SignalNumber	INT UNSIGNED NOT NULL,
	AmountOfMoney	DOUBLE NOT NULL
);

-- Tạo bảng hóa đơn --
DROP TABLE IF EXISTS Bill;
CREATE TABLE Bill (
	BillID			INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    UserID			INT UNSIGNED NOT NULL,
    SubjectID		INT UNSIGNED NOT NULL,
    TotalMoney		DOUBLE NOT NULL,
    Note			VARCHAR(200),
    `Status`		ENUM('0', '1'),
    CreateDate		DATETIME DEFAULT NOW(),
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
    FOREIGN KEY (SubjectID) REFERENCES `Subject`(SubjectID)
);


-- ====================================================== INSERT VALUES ======================================================== --

-- ============================================= Faculty ============================================= --
INSERT INTO Faculty(FacultyName) VALUES
('IT');
-- ================================================================================================ --

-- ============================================= ClassOfStudent ============================================= --
INSERT INTO ClassOfStudent(ClassName) VALUES
('KHMT2020IT69');

INSERT INTO Users(Fullname, Gender, Birthday, Address, NumberPhone, Email, Username, `Password`, `Role`, FacultyID, TotalMoneyAvailable, TotalDebt, YearOfExperience) VALUES
('Bui Thanh Hai', 'MALE', '1999-10-20', 'Ha Noi', '0123456789', 'haibt219@gmail.com', 'haibt', 123456, 'ADMIN', 1, NULL, NULL, 3),
('Vu Tue', 'MALE', '1999-10-21', 'Ha Noi', '0123456789', 'vutue@gmail.com', 'vutue', 123456, 'ADMIN', 1, NULL, NULL, 3),
('Xuan Quang', 'MALE', '1999-10-22', 'Ha Noi', '0123456789', 'xuanquanguser@gmail.com', 'xuanquang', 123456, 'STUDENT', 1, 1000000, 500000, NULL);

INSERT INTO `Subject`(SubjectName, SignalNumber, AmountOfMoney) VALUES
('LT Java', '3', 750000);

INSERT INTO Bill( UserID, SubjectID, TotalMoney, Note, `Status`) VALUES
(1, 1, 1000000, "", '0');
