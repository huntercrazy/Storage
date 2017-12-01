insert into t_user(id,userId,password,userName,userType) values (1,'100001','123','张无忌','仓库保管员');
insert into t_user(id,userId,password,userName,userType) values (2,'100002','123','谢逊','货物办理员');

insert into t_gongying(id,gyName,gyAddress,gyPhone,content) values (1,'江苏某公司','南京','18988478383','江苏');
insert into t_gongying(id,gyName,gyAddress,gyPhone,content) values (2,'四川某公司','成都','18367893452','四川');

insert into t_kehu(id,khName,khAddress,khPhone,content) values(1,'北京某公司','北京','13579373453','北京');
insert into t_kehu(id,khName,khAddress,khPhone,content) values(2,'上海某公司','上海','13157844325','上海');

insert into t_cangku(id,ckName,userName,ckAddress,content) values (1,'华东仓库','张无忌','上海','一号仓库');
insert into t_cangku(id,ckName,userName,ckAddress,content) values (2,'华北仓库','张无忌','北京','二号仓库');

insert into t_goods(id,goodsName,goodsType,goodsKind,content) values(1,'电脑桌','办公','件','器件');
insert into t_goods(id,goodsName,goodsType,goodsKind,content) values(2,'电脑椅','办公','件','器件');

insert into t_ruku(id,goodsName,userName,inTime,inPrice,inNum,gyName,ckName,status,otherPrice,content) values(1,'电脑桌','谢逊','2017-1-1',800.0,60,'江苏某公司','华东仓库','入库',0.0,'无');
insert into t_ruku(id,goodsName,userName,inTime,inPrice,inNum,gyName,ckName,status,otherPrice,content) values(2,'电脑椅','谢逊','2017-1-1',800.0,60,'四川某公司','华北仓库','入库',0.0,'无');

insert into t_chuku(id,goodsName,userName,outTime,outPrice,outNum,khName,ckName,status,otherPrice,content) values(1,'电脑桌','谢逊','2017-2-1',1000.0,30,'北京某公司','华东仓库','出库',0.0,'无');
insert into t_chuku(id,goodsName,userName,outTime,outPrice,outNum,khName,ckName,status,otherPrice,content) values(2,'电脑椅','谢逊','2017-2-1',1000.0,30,'上海某公司','华北仓库','出库',0.0,'无');

insert into t_shunhuai(id,goodsName,userName,breakNum,ckName,content) values(1,'电脑椅','张无忌',1,'华北仓库','无');

insert into t_kucun(id,goodsName,cunCount,ckName) values(1,'电脑桌',30,'华东仓库');
insert into t_kucun(id,goodsName,cunCount,ckName) values(2,'电脑椅',30,'华北仓库');

commit;