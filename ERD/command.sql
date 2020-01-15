SET SESSION FOREIGN_KEY_CHECKS=0;
SET SESSION FOREIGN_KEY_CHECKS=1;

show TABLES;

describe board;
describe ticket;
describe theater;
describe mc_user;
select * from theater;
select * from hall;
select * from ticket;
select * from mc_user mu;
select * from mc_admin ma;
select * from board b;
insert into mc_admin (a_id, a_pw) values ("admin", 1111);
select * from review;
select * from reserve;
select * from reserve where u_idnum = 1;
delete from theater where theaterCode = 1;
delete from hall where h_uid =1;
TRUNCATE table mc_user;
TRUNCATE table theater;
TRUNCATE table hall;
TRUNCATE table ticket;
TRUNCATE table review;
SELECT u_pw FROM mc_user WHERE u_id = "ksi0678";
SELECT u_pw FROM mc_user WHERE u_id = "kpmyung";
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




