drop table if exists t_ruku;
drop table if exists t_chuku;
drop table if exists t_cangku;
drop table if exists t_kucun;
drop table if exists t_diaobo;
drop table if exists t_shunhuai;
drop table if exists t_goods;
drop table if exists t_user;
drop table if exists t_gongying;
drop table if exists t_kehu;
drop table if exists t_worktime;

create table t_ruku(
id int primary key auto_increment,
goodsName varchar(32),
userName varchar(32),
inTime datetime,
inPrice Double,
inNum Integer,
gyName varchar(32),
ckName varchar(32),
status varchar(32),
otherPrice Double,
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_chuku(
id int primary key auto_increment,
goodsName varchar(32),
userName varchar(32),
outTime datetime,
outPrice Double,
outNum Integer,
khName varchar(32),
ckName varchar(32),
status varchar(32),
otherPrice Double,
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_cangku(
id int primary key auto_increment,
ckName varchar(32),
userName varchar(32),
ckAddress varchar(32),
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_kucun(
id int primary key auto_increment,
goodsName varchar(32),
cunCount Integer,
ckName varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_diaobo(
id int primary key auto_increment,
goodsName varchar(32),
userName varchar(32),
dbTime datetime,
dbNum Integer,
oldCkName varchar(32),
newCkName varchar(32),
otherPrice Double,
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_shunhuai(
id int primary key auto_increment,
goodsName varchar(32),
userName varchar(32),
breakNum Integer,
ckName varchar(32),
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_goods(
id int primary key auto_increment,
goodsName varchar(32),
goodsType varchar(32),
goodsKind varchar(32),
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_user(
id int primary key auto_increment,
userId varchar(32),
password varchar(32),
userName varchar(32),
userType varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_gongying(
id int primary key auto_increment,
gyName varchar(32),
gyAddress varchar(32),
gyPhone varchar(32),
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_kehu(
id int primary key auto_increment,
khName varchar(32),
khAddress varchar(32),
khPhone varchar(32),
content varchar(32)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_worktime(
id int primary key auto_increment,
userName varchar(32),
userId varchar(32),
userType varchar(32),
workTime datetime
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

