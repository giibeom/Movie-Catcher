SET SESSION FOREIGN_KEY_CHECKS=0;
SET SESSION FOREIGN_KEY_CHECKS=1;

/* Drop Tables */

DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS reserve;
DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS hall;
DROP TABLE IF EXISTS mc_admin;
DROP TABLE IF EXISTS mc_user;
DROP TABLE IF EXISTS review;
DROP TABLE IF EXISTS theater;




/* Create Tables */

CREATE TABLE board
(
	b_num int NOT NULL AUTO_INCREMENT,
	b_title varchar(30) NOT NULL,
	b_content text NOT NULL,
	b_regdate datetime DEFAULT now(),
	a_uid int NOT NULL,
	PRIMARY KEY (b_num)
);


CREATE TABLE hall
(
	h_uid int NOT NULL AUTO_INCREMENT,
	hallType varchar(30) NOT NULL,
	hallLocation varchar(40) NOT NULL,
	hallSize varchar(40) NOT NULL,
	theaterCode varchar(10) NOT NULL,
	h_movie varchar(30) NOT NULL,
	h_grade varchar(30) NOT NULL,
	PRIMARY KEY (h_uid)
);


CREATE TABLE mc_admin
(
	a_uid int NOT NULL AUTO_INCREMENT,
	a_id varchar(25) NOT NULL,
	a_pw varchar(30) NOT NULL,
	a_regdate datetime DEFAULT now(),
	PRIMARY KEY (a_uid),
	UNIQUE (a_id)
);


CREATE TABLE mc_user
(
	u_idnum int NOT NULL AUTO_INCREMENT,
	u_id varchar(20) NOT NULL,
	u_pw varchar(20) NOT NULL,
	u_name varchar(20) NOT NULL,
	u_email varchar(50),
	u_phone varchar(25) NOT NULL,
	u_regdate datetime DEFAULT now(),
	u_date date NOT NULL,
	PRIMARY KEY (u_idnum),
	UNIQUE (u_id)
);


CREATE TABLE reserve
(
	rs_num int NOT NULL AUTO_INCREMENT,
	rs_date datetime DEFAULT now(),
	rs_price int NOT NULL,
	rs_seat varchar(40) NOT NULL,
	u_idnum int NOT NULL,
	t_uid int NOT NULL,
	PRIMARY KEY (rs_num)
);


CREATE TABLE review
(
	rv_num int NOT NULL AUTO_INCREMENT,
	rv_title varchar(25) NOT NULL,
	rv_content text,
	rv_star double NOT NULL,
	rv_id varchar(30) NOT NULL,
	rv_date date default now(),
	rs_num int,
	PRIMARY KEY (rv_num)
);


CREATE TABLE theater
(
	theaterCode varchar(10) NOT NULL,
	theaterName varchar(40) NOT NULL,
	AreaCode varchar(30) NOT NULL,
	theaterAddress text,
	PRIMARY KEY (theaterCode)
);


CREATE TABLE ticket
(
	t_uid int NOT NULL AUTO_INCREMENT,
	movietime varchar(30) NOT NULL,
	restSeat int NOT NULL,
	h_uid int NOT NULL,
	PRIMARY KEY (t_uid)
);



/* Create Foreign Keys */

ALTER TABLE ticket
	ADD FOREIGN KEY (h_uid)
	REFERENCES hall (h_uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE board
	ADD FOREIGN KEY (a_uid)
	REFERENCES mc_admin (a_uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reserve
	ADD FOREIGN KEY (u_idnum)
	REFERENCES mc_user (u_idnum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE hall
	ADD FOREIGN KEY (theaterCode)
	REFERENCES theater (theaterCode)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE reserve
	ADD FOREIGN KEY (t_uid)
	REFERENCES ticket (t_uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



show TABLES;

describe board;
describe ticket;
describe theater;
describe mc_user;
select * from theater;
select * from hall;
select * from ticket;
select * from mc_user mu;
select * from review;
select * from reserve;
select * from reserve where u_idnum = 1;
delete from theater where theaterCode = 1;
delete from hall where h_uid =1;
TRUNCATE table theater;
TRUNCATE table hall;
TRUNCATE table ticket;
TRUNCATE table review;
SELECT u_pw FROM mc_user WHERE u_id = "ksi0678";
select count(*) from hall;
select count(*) from ticket;
select count(*) from review;
select * from hall h, ticket t where h.h_uid = t.h_uid;
select * from hall h, ticket t where h.h_uid = t.h_uid and h.`theaterCode` = "0001"; 
select * from hall h, ticket t where h.h_uid = t.h_uid and t.t_uid = 1; 
select * from review where rv_title like '%스타워즈%';
SELECT * FROM review where rv_title LIKE '시동' ORDER BY rv_num DESC LIMIT 0, 8 ;
show databases;

create database movie_catcher;
use movie_catcher;
grant all privileges on movie_catcher.* to 'myuser'@'localhost';
flush privileges;

show grants for 'myuser'@'localhost';

select * from theater;


