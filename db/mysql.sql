DROP DATABASE IF EXISTS ssm51710;

CREATE DATABASE ssm51710 default character set utf8mb4 collate utf8mb4_general_ci;

USE ssm51710;


DROP TABLE IF EXISTS `config`;

CREATE TABLE `config`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`name` varchar(100) NOT NULL COMMENT '配置参数名称',
	`value` varchar(100) COMMENT '配置参数值',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置文件';

DROP TABLE IF EXISTS `yezhu`;

CREATE TABLE `yezhu` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`yonghuming` varchar(200) NOT NULL UNIQUE   COMMENT '用户名',
	`mima` varchar(200) NOT NULL   COMMENT '密码',
	`xingming` varchar(200)    COMMENT '姓名',
	`xingbie` varchar(200)    COMMENT '性别',
	`touxiang` varchar(200)    COMMENT '头像',
	`danyuanhao` varchar(200)    COMMENT '单元号',
	`fanghao` varchar(200)    COMMENT '房号',
	`shenfenzheng` varchar(200)    COMMENT '身份证',
	`shouji` varchar(200)    COMMENT '手机',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业主';

INSERT INTO yezhu(yonghuming,mima,xingming,xingbie,touxiang,danyuanhao,fanghao,shenfenzheng,shouji) VALUES('业主1','123456','姓名1','男','http://localhost:8080/ssm51710/upload/yezhu_touxiang1.jpg','单元号1','房号1','440300199101010001','13823888881');
INSERT INTO yezhu(yonghuming,mima,xingming,xingbie,touxiang,danyuanhao,fanghao,shenfenzheng,shouji) VALUES('业主2','123456','姓名2','男','http://localhost:8080/ssm51710/upload/yezhu_touxiang2.jpg','单元号2','房号2','440300199202020002','13823888882');
INSERT INTO yezhu(yonghuming,mima,xingming,xingbie,touxiang,danyuanhao,fanghao,shenfenzheng,shouji) VALUES('业主3','123456','姓名3','男','http://localhost:8080/ssm51710/upload/yezhu_touxiang3.jpg','单元号3','房号3','440300199303030003','13823888883');


DROP TABLE IF EXISTS `cheweixinxi`;

CREATE TABLE `cheweixinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`yuancheweihao` varchar(200)    COMMENT '原车位号',
	`chepai` varchar(200)    COMMENT '车牌',
	`yonghuming` varchar(200)    COMMENT '用户名',
	`xingming` varchar(200)    COMMENT '姓名',
	`huancheweihao` varchar(200)    COMMENT '换车位号',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车位信息';

INSERT INTO cheweixinxi(mingcheng,yuancheweihao,chepai,yonghuming,xingming,huancheweihao,sfsh,shhf) VALUES('名称1','原车位号1','车牌1','用户名1','姓名1','换车位号1','否','');
INSERT INTO cheweixinxi(mingcheng,yuancheweihao,chepai,yonghuming,xingming,huancheweihao,sfsh,shhf) VALUES('名称2','原车位号2','车牌2','用户名2','姓名2','换车位号2','否','');
INSERT INTO cheweixinxi(mingcheng,yuancheweihao,chepai,yonghuming,xingming,huancheweihao,sfsh,shhf) VALUES('名称3','原车位号3','车牌3','用户名3','姓名3','换车位号3','否','');


DROP TABLE IF EXISTS `feiyongxinxi`;

CREATE TABLE `feiyongxinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`riqi` date    COMMENT '日期',
	`shuifei` int    COMMENT '水费',
	`dianfei` int    COMMENT '电费',
	`wuyefei` int    COMMENT '物业费',
	`cheweifei` int    COMMENT '车位费',
	`qitafeiyong` int    COMMENT '其他费用',
	`zongfeiyong` int    COMMENT '总费用',
	`yonghuming` varchar(200)    COMMENT '用户名',
	`xingming` varchar(200)    COMMENT '姓名',
	`ispay` varchar(200)   default '未支付' COMMENT '是否支付',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='费用信息';

INSERT INTO feiyongxinxi(mingcheng,riqi,shuifei,dianfei,wuyefei,cheweifei,qitafeiyong,zongfeiyong,yonghuming,xingming,ispay) VALUES('名称1',CURRENT_TIMESTAMP,1,1,1,1,1,1,'用户名1','姓名1','未支付');
INSERT INTO feiyongxinxi(mingcheng,riqi,shuifei,dianfei,wuyefei,cheweifei,qitafeiyong,zongfeiyong,yonghuming,xingming,ispay) VALUES('名称2',CURRENT_TIMESTAMP,2,2,2,2,2,2,'用户名2','姓名2','未支付');
INSERT INTO feiyongxinxi(mingcheng,riqi,shuifei,dianfei,wuyefei,cheweifei,qitafeiyong,zongfeiyong,yonghuming,xingming,ispay) VALUES('名称3',CURRENT_TIMESTAMP,3,3,3,3,3,3,'用户名3','姓名3','未支付');


DROP TABLE IF EXISTS `baogaoxinxi`;

CREATE TABLE `baogaoxinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`riqi` date    COMMENT '日期',
	`baogaoneirong` longtext    COMMENT '报告内容',
	`yonghuming` varchar(200)    COMMENT '用户名',
	`xingming` varchar(200)    COMMENT '姓名',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='报告信息';

INSERT INTO baogaoxinxi(mingcheng,riqi,baogaoneirong,yonghuming,xingming,sfsh,shhf) VALUES('名称1',CURRENT_TIMESTAMP,'报告内容1','用户名1','姓名1','否','');
INSERT INTO baogaoxinxi(mingcheng,riqi,baogaoneirong,yonghuming,xingming,sfsh,shhf) VALUES('名称2',CURRENT_TIMESTAMP,'报告内容2','用户名2','姓名2','否','');
INSERT INTO baogaoxinxi(mingcheng,riqi,baogaoneirong,yonghuming,xingming,sfsh,shhf) VALUES('名称3',CURRENT_TIMESTAMP,'报告内容3','用户名3','姓名3','否','');


DROP TABLE IF EXISTS `hesuanjiance`;

CREATE TABLE `hesuanjiance` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`jianceriqi` date    COMMENT '检测日期',
	`jianceqingkuang` longtext    COMMENT '检测情况',
	`jiancebaogao` varchar(200)    COMMENT '检测报告',
	`jiancewendu` varchar(200)    COMMENT '检测温度',
	`yonghuming` varchar(200)    COMMENT '用户名',
	`xingming` varchar(200)    COMMENT '姓名',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='核酸检测';

INSERT INTO hesuanjiance(mingcheng,jianceriqi,jianceqingkuang,jiancebaogao,jiancewendu,yonghuming,xingming,sfsh,shhf) VALUES('名称1',CURRENT_TIMESTAMP,'检测情况1','检测报告1','检测温度1','用户名1','姓名1','否','');
INSERT INTO hesuanjiance(mingcheng,jianceriqi,jianceqingkuang,jiancebaogao,jiancewendu,yonghuming,xingming,sfsh,shhf) VALUES('名称2',CURRENT_TIMESTAMP,'检测情况2','检测报告2','检测温度2','用户名2','姓名2','否','');
INSERT INTO hesuanjiance(mingcheng,jianceriqi,jianceqingkuang,jiancebaogao,jiancewendu,yonghuming,xingming,sfsh,shhf) VALUES('名称3',CURRENT_TIMESTAMP,'检测情况3','检测报告3','检测温度3','用户名3','姓名3','否','');


DROP TABLE IF EXISTS `fangkedengji`;

CREATE TABLE `fangkedengji` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`riqi` date    COMMENT '日期',
	`fangkexingming` varchar(200)    COMMENT '访客姓名',
	`xingbie` varchar(200)    COMMENT '性别',
	`nianling` varchar(200)    COMMENT '年龄',
	`zhiye` varchar(200)    COMMENT '职业',
	`zhuzhi` varchar(200)    COMMENT '住址',
	`wendu` varchar(200)    COMMENT '温度',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='访客登记';

INSERT INTO fangkedengji(mingcheng,riqi,fangkexingming,xingbie,nianling,zhiye,zhuzhi,wendu) VALUES('名称1',CURRENT_TIMESTAMP,'访客姓名1','男','年龄1','职业1','住址1','温度1');
INSERT INTO fangkedengji(mingcheng,riqi,fangkexingming,xingbie,nianling,zhiye,zhuzhi,wendu) VALUES('名称2',CURRENT_TIMESTAMP,'访客姓名2','男','年龄2','职业2','住址2','温度2');
INSERT INTO fangkedengji(mingcheng,riqi,fangkexingming,xingbie,nianling,zhiye,zhuzhi,wendu) VALUES('名称3',CURRENT_TIMESTAMP,'访客姓名3','男','年龄3','职业3','住址3','温度3');


DROP TABLE IF EXISTS `tousuxinxi`;

CREATE TABLE `tousuxinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`riqi` date    COMMENT '日期',
	`tousuneirong` longtext    COMMENT '投诉内容',
	`yonghuming` varchar(200)    COMMENT '用户名',
	`xingming` varchar(200)    COMMENT '姓名',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='投诉信息';

INSERT INTO tousuxinxi(mingcheng,riqi,tousuneirong,yonghuming,xingming,sfsh,shhf) VALUES('名称1',CURRENT_TIMESTAMP,'投诉内容1','用户名1','姓名1','否','');
INSERT INTO tousuxinxi(mingcheng,riqi,tousuneirong,yonghuming,xingming,sfsh,shhf) VALUES('名称2',CURRENT_TIMESTAMP,'投诉内容2','用户名2','姓名2','否','');
INSERT INTO tousuxinxi(mingcheng,riqi,tousuneirong,yonghuming,xingming,sfsh,shhf) VALUES('名称3',CURRENT_TIMESTAMP,'投诉内容3','用户名3','姓名3','否','');


DROP TABLE IF EXISTS `gonggaoxinxi`;

CREATE TABLE `gonggaoxinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`biaoti` varchar(200) NOT NULL   COMMENT '标题',
	`gonggaoneirong` longtext    COMMENT '公告内容',
	`riqi` date    COMMENT '日期',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告信息';

INSERT INTO gonggaoxinxi(biaoti,gonggaoneirong,riqi) VALUES('标题1','公告内容1',CURRENT_TIMESTAMP);
INSERT INTO gonggaoxinxi(biaoti,gonggaoneirong,riqi) VALUES('标题2','公告内容2',CURRENT_TIMESTAMP);
INSERT INTO gonggaoxinxi(biaoti,gonggaoneirong,riqi) VALUES('标题3','公告内容3',CURRENT_TIMESTAMP);


DROP TABLE IF EXISTS `gonggaohuifu`;

CREATE TABLE `gonggaohuifu` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`biaoti` varchar(200) NOT NULL   COMMENT '标题',
	`fabiaoneirong` longtext    COMMENT '发表内容',
	`fabiaoriqi` date    COMMENT '发表日期',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告回复';

INSERT INTO gonggaohuifu(biaoti,fabiaoneirong,fabiaoriqi) VALUES('标题1','发表内容1',CURRENT_TIMESTAMP);
INSERT INTO gonggaohuifu(biaoti,fabiaoneirong,fabiaoriqi) VALUES('标题2','发表内容2',CURRENT_TIMESTAMP);
INSERT INTO gonggaohuifu(biaoti,fabiaoneirong,fabiaoriqi) VALUES('标题3','发表内容3',CURRENT_TIMESTAMP);


DROP TABLE IF EXISTS `gelizhuangtai`;

CREATE TABLE `gelizhuangtai` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`mingcheng` varchar(200) NOT NULL   COMMENT '名称',
	`gelifanghao` varchar(200)    COMMENT '隔离房号',
	`gelishijian` varchar(200)    COMMENT '隔离时间',
	`gelizhuangtai` varchar(200)    COMMENT '隔离状态',
	`kaishiriqi` date    COMMENT '开始日期',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='隔离状态';

INSERT INTO gelizhuangtai(mingcheng,gelifanghao,gelishijian,gelizhuangtai,kaishiriqi) VALUES('名称1','隔离房号1','隔离时间1','未隔离',CURRENT_TIMESTAMP);
INSERT INTO gelizhuangtai(mingcheng,gelifanghao,gelishijian,gelizhuangtai,kaishiriqi) VALUES('名称2','隔离房号2','隔离时间2','未隔离',CURRENT_TIMESTAMP);
INSERT INTO gelizhuangtai(mingcheng,gelifanghao,gelishijian,gelizhuangtai,kaishiriqi) VALUES('名称3','隔离房号3','隔离时间3','未隔离',CURRENT_TIMESTAMP);


DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`name` varchar(200) NOT NULL   COMMENT '名称',
	`value` varchar(200)    COMMENT '值',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='轮播图管理';

INSERT INTO config(name,value) VALUES('名称1','http://localhost:8080/ssm51710/upload/config_value1.jpg');
INSERT INTO config(name,value) VALUES('名称2','http://localhost:8080/ssm51710/upload/config_value2.jpg');
INSERT INTO config(name,value) VALUES('名称3','http://localhost:8080/ssm51710/upload/config_value3.jpg');



truncate table config;
insert into config(id,name,value) values(1,'picture1','http://localhost:8080/ssm51710/upload/picture1.jpg');
insert into config(id,name,value) values(2,'picture2','http://localhost:8080/ssm51710/upload/picture2.jpg');
insert into config(id,name,value) values(3,'picture3','http://localhost:8080/ssm51710/upload/picture3.jpg');
insert into config(id,name,value) values(4,'picture4','http://localhost:8080/ssm51710/upload/picture4.jpg');
insert into config(id,name,value) values(5,'picture5','http://localhost:8080/ssm51710/upload/picture5.jpg');
insert into config(id,name) values(6,'homepage');


DROP TABLE IF EXISTS `users`;

CREATE TABLE `users`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`password` varchar(100) NOT NULL COMMENT '密码',
	`role` varchar(100) default '管理员' COMMENT '角色',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

insert into users(id,username, password) values(1,'abo','abo');

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`userid` bigint NOT NULL COMMENT '用户id',
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`tablename` varchar(100) COMMENT '表名',
	`role` varchar(100) COMMENT '角色',
	`token` varchar(200) NOT NULL COMMENT '密码',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	`expiratedtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '过期时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';

