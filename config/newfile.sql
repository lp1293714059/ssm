drop database if exists ssm;
create database ssm default character set utf8;

<!-- 创建管理员信息表user -->
use ssm;
drop table if exists user;
create table user
(
   user_id                  int not null auto_increment,
   user_name               varchar(20),
   user_pass                varchar(20),
   primary key (user_id)
);
insert into user (user_name,user_pass) values ('admin','123');
insert into user (user_name,user_pass) values ('Jekin','123');
select * from user;

<!-- 创建学生信息表info -->
use ssm;
drop table if exists info;
create table info
(
   stuid                 varchar(30) not null,
   stuname               varchar(10) not null,
   stusex                varchar(2) not null,
   speciality            varchar(30) not null,
   academe               varchar(30) not null,
   grade                varchar(30) not null,
   primary key (stuid)
);

<!--创建课程信息表-->
use ssm;
drop table if exists course;
create table course
(
	courseid             varchar(30) not null,
	coursename           varchar(30) not null,
	primary key (courseid)
);

<!--创建教师信息表-->
use ssm;
drop table if exists techerinfo;
create table techerinfo
(
	techid             varchar(30) not null,
	techname           varchar(30) not null,
	speciality         varchar(30) not null,
	title              varchar(30) not null,
	techcourse         varchar(30) not null,
	primary key (techid)
);

<!--创建选课表 -->
use ssm;
drop table if exists selectcourse;
create table selectcourse
(
	id                int not null AUTO_INCREMENT,
	stuid             varchar(30) not null,
	courseid          varchar(30) not null,
	key idx_fk_stuid (stuid),
    constraint fk_selectcourse_info Foreign Key(stuid) References info(stuid) on DELETE restrict ON update cascade ON Delete cascade,
	key idx_fk_courseid (courseid),
    constraint fk_selectcourse_course Foreign Key(courseid) References course(courseid) on DELETE restrict ON update cascade ON Delete cascade,
	primary key(id)
);