insert into mc_user (u_id, u_pw, u_name, u_email, u_phone, u_regdate, u_date) values 
("mgb97","0707", "기버미", "kpmyung@naver.com", "01028765568", "2020-01-01 00:00:01", "1997-07-07");

insert into mc_user (u_id, u_pw, u_name, u_email, u_phone, u_regdate, u_date) values 
("ksi3450", "12345", "한별", "ksi3450@naver.com", "01012345678", "2020-01-12 00:00:00", "1999-11-12");

insert into mc_user (u_id, u_pw, u_name, u_email, u_phone, u_regdate, u_date) values 
("ksi0678", "1234", "강성일", "ksi0678@naver.com", "01040113450", "2019-12-23 08:12:17", "1995-07-08");

insert into mc_user (u_id, u_pw, u_name, u_email, u_phone, u_regdate, u_date) values 
("hyejin","1231","혜진","phj981231@naver.com","01041021253","2019-12-31 05:11:00", "1998-12-31");

insert into mc_user (u_id, u_pw, u_name, u_email, u_phone, u_regdate, u_date) values 
("chloe", "1111", "김나영", "nayeongahhi@gmail.com", "01023787769", "2020-01-10 17:34:00", "1993-12-03");

insert into mc_user (u_id, u_pw, u_name, u_email, u_phone, u_regdate, u_date) values 
("cjh931130", "1111", "최지현", "jihyun931130@gmail.com", "01077470989", "2020-01-14 09:30:00", "1993-11-30");

insert into mc_user (u_id, u_pw, u_name, u_email, u_phone, u_regdate, u_date) values 
("kpmyung", "1234", "범", "kpmyung@gmail.com", "01011112222", "2020-01-04 11:30:00", "1997-11-30");





INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-12-30", "9000", "c1", 1, 1);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2020-1-14", "18000", "a1 a2", 1, 70);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-12-25", "23000", "f1 f2 f3", 1, 40);

INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-10-22", "18000", "d3 d4", 2, 2);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-11-13", "18000", "e6 e7", 2, 60);

INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2020-01-14", "10000", "g3 g4", 3, 40);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-10-22", "18000", "d5 d6", 3, 80);

INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-12-30", "18000", "a3 a4", 4, 10);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2020-01-01", "14000", "c3 c4", 4, 100);

INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-12-12", "27000", "h4 h4 h5", 5, 30);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-10-20", "18000", "e3 e4", 5, 70);

INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-11-27", "36000", "g5 g6 g7 g8", 6, 50);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-12-07", "18000", "f3 f4", 6, 70);

INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-11-13", "14000", "h5 h6", 7, 40);
INSERT INTO reserve (rs_date, rs_price, rs_seat, u_idnum, t_uid) VALUES
("2019-12-31", "14000", "b1 b2", 7, 100);





INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) VALUES
("백두산", "정말 재밌게 봤어요", 9,"mgb97", "2019-12-30", 1);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("시동", "맘껏 웃고 스트레스 풀고 왔어요 ^^", 10, "mgb97", "2020-1-14", 2 );

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("겨울왕국 2", "가족들이 다같이 보기에 너무 좋은 영화였다 ", 8, "mgb97", "2019-12-25", 3);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("해치지 않아", "지금 보러 갑니다 조조로~대학 선후배인 두분의 연기는 깔수가없어서 .. 두분의 조합만으로도 기대되는영화. 지금 들어갑니다", 10, "ksi3450", "2019-10-22", 4);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("포드 V 페라리", "스케일 겁나커서 보는내내 입벌리고 봣네욬ㅋㅋ재밋습니다",7,  "ksi3450","2019-11-13", 5 );

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("닥터 두리틀", "10점 줘도 모자라다 하늘에 있는 별 다 주고 싶다 진심", 10, "ksi0678", "2020-01-14", 6);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("천문-하늘에 묻는다", "시사회때 미리 봤는데 생각보다 재밌었네요 ㅋㅋ 킬링타임용으로 괜찮은듯", 8, "ksi0678","2019-10-22", 7 );

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("미드웨이", "재미있는데 의미도 있어 ㅠㅠ 진짜 띵작 탄생", 9, "hyejin", "2019-12-30", 8);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("스타워즈-라이즈 오브 스카이워커", "감동적이면서도 멋잇네요 ㅋㅋ", 4, "hyejin", "2020-01-01", 9);
INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("시동", "눈빛 하나만으로도 대화가 통하는 사이 ", 6, "chloe", "2019-12-12", 10);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("신비아파트 극장편 하늘도꺠비 대 요르문간드", "너무 재미가 없었어요", 1 , "chloe", "2019-10-20", 11);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("시동", "주연 배우가 명기범닮았어요", 10, "cjh931130", "2019-11-27", 12);

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("천문-하늘에 묻는다", "재밌었다.",7, "cjh931130","2019-12-07", 13);
INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("신비아파트 극장편 하늘도꺠비 대 요르문간드", "아이가 너무 좋아해요", 8, "kpmyung", "2019-11-13",14 );

INSERT INTO review (rv_title, rv_content, rv_star, rv_id, rv_date, rs_num) values
("나이브스 아웃", "보다가 잤습니다.", 3, "kpmyung", "2019-12-31", 15);

