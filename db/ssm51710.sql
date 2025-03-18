-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm51710
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baogaoxinxi`
--

DROP TABLE IF EXISTS `baogaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baogaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `baogaoneirong` longtext COMMENT '报告内容',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='报告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baogaoxinxi`
--

LOCK TABLES `baogaoxinxi` WRITE;
/*!40000 ALTER TABLE `baogaoxinxi` DISABLE KEYS */;
INSERT INTO `baogaoxinxi` VALUES (1,'2020-11-13 08:23:06','名称1','2020-11-13','报告内容1','用户名1','姓名1','否',''),(2,'2020-11-13 08:23:06','名称2','2020-11-13','报告内容2','用户名2','姓名2','否',''),(3,'2020-11-13 08:23:06','名称3','2020-11-13','报告内容3','用户名3','姓名3','否','');
/*!40000 ALTER TABLE `baogaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cheweixinxi`
--

DROP TABLE IF EXISTS `cheweixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cheweixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `yuancheweihao` varchar(200) DEFAULT NULL COMMENT '原车位号',
  `chepai` varchar(200) DEFAULT NULL COMMENT '车牌',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `huancheweihao` varchar(200) DEFAULT NULL COMMENT '换车位号',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='车位信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cheweixinxi`
--

LOCK TABLES `cheweixinxi` WRITE;
/*!40000 ALTER TABLE `cheweixinxi` DISABLE KEYS */;
INSERT INTO `cheweixinxi` VALUES (1,'2020-11-13 08:23:06','名称1','原车位号1','车牌1','用户名1','姓名1','换车位号1','否',''),(2,'2020-11-13 08:23:06','名称2','原车位号2','车牌2','用户名2','姓名2','换车位号2','否',''),(3,'2020-11-13 08:23:06','名称3','原车位号3','车牌3','用户名3','姓名3','换车位号3','否','');
/*!40000 ALTER TABLE `cheweixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `name` varchar(200) NOT NULL COMMENT '名称',
  `value` varchar(200) DEFAULT NULL COMMENT '值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='轮播图管理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'2020-11-13 08:23:06','picture1','http://localhost:8080/ssm51710/upload/picture1.jpg'),(2,'2020-11-13 08:23:06','picture2','http://localhost:8080/ssm51710/upload/picture2.jpg'),(3,'2020-11-13 08:23:06','picture3','http://localhost:8080/ssm51710/upload/picture3.jpg'),(4,'2020-11-13 08:23:06','picture4','http://localhost:8080/ssm51710/upload/picture4.jpg'),(5,'2020-11-13 08:23:06','picture5','http://localhost:8080/ssm51710/upload/picture5.jpg'),(6,'2020-11-13 08:23:06','homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fangkedengji`
--

DROP TABLE IF EXISTS `fangkedengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fangkedengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `fangkexingming` varchar(200) DEFAULT NULL COMMENT '访客姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `zhiye` varchar(200) DEFAULT NULL COMMENT '职业',
  `zhuzhi` varchar(200) DEFAULT NULL COMMENT '住址',
  `wendu` varchar(200) DEFAULT NULL COMMENT '温度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='访客登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fangkedengji`
--

LOCK TABLES `fangkedengji` WRITE;
/*!40000 ALTER TABLE `fangkedengji` DISABLE KEYS */;
INSERT INTO `fangkedengji` VALUES (1,'2020-11-13 08:23:06','名称1','2020-11-13','访客姓名1','男','年龄1','职业1','住址1','温度1'),(2,'2020-11-13 08:23:06','名称2','2020-11-13','访客姓名2','男','年龄2','职业2','住址2','温度2'),(3,'2020-11-13 08:23:06','名称3','2020-11-13','访客姓名3','男','年龄3','职业3','住址3','温度3');
/*!40000 ALTER TABLE `fangkedengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feiyongxinxi`
--

DROP TABLE IF EXISTS `feiyongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feiyongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `shuifei` int(11) DEFAULT NULL COMMENT '水费',
  `dianfei` int(11) DEFAULT NULL COMMENT '电费',
  `wuyefei` int(11) DEFAULT NULL COMMENT '物业费',
  `cheweifei` int(11) DEFAULT NULL COMMENT '车位费',
  `qitafeiyong` int(11) DEFAULT NULL COMMENT '其他费用',
  `zongfeiyong` int(11) DEFAULT NULL COMMENT '总费用',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='费用信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feiyongxinxi`
--

LOCK TABLES `feiyongxinxi` WRITE;
/*!40000 ALTER TABLE `feiyongxinxi` DISABLE KEYS */;
INSERT INTO `feiyongxinxi` VALUES (1,'2020-11-13 08:23:06','名称1','2020-11-13',1,1,1,1,1,1,'用户名1','姓名1','未支付'),(2,'2020-11-13 08:23:06','名称2','2020-11-13',2,2,2,2,2,2,'用户名2','姓名2','未支付'),(3,'2020-11-13 08:23:06','名称3','2020-11-13',3,3,3,3,3,3,'用户名3','姓名3','未支付');
/*!40000 ALTER TABLE `feiyongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gelizhuangtai`
--

DROP TABLE IF EXISTS `gelizhuangtai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gelizhuangtai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `gelifanghao` varchar(200) DEFAULT NULL COMMENT '隔离房号',
  `gelishijian` varchar(200) DEFAULT NULL COMMENT '隔离时间',
  `gelizhuangtai` varchar(200) DEFAULT NULL COMMENT '隔离状态',
  `kaishiriqi` date DEFAULT NULL COMMENT '开始日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='隔离状态';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gelizhuangtai`
--

LOCK TABLES `gelizhuangtai` WRITE;
/*!40000 ALTER TABLE `gelizhuangtai` DISABLE KEYS */;
INSERT INTO `gelizhuangtai` VALUES (1,'2020-11-13 08:23:06','名称1','隔离房号1','隔离时间1','未隔离','2020-11-13'),(2,'2020-11-13 08:23:06','名称2','隔离房号2','隔离时间2','未隔离','2020-11-13'),(3,'2020-11-13 08:23:06','名称3','隔离房号3','隔离时间3','未隔离','2020-11-13');
/*!40000 ALTER TABLE `gelizhuangtai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaohuifu`
--

DROP TABLE IF EXISTS `gonggaohuifu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gonggaohuifu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `fabiaoneirong` longtext COMMENT '发表内容',
  `fabiaoriqi` date DEFAULT NULL COMMENT '发表日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='公告回复';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaohuifu`
--

LOCK TABLES `gonggaohuifu` WRITE;
/*!40000 ALTER TABLE `gonggaohuifu` DISABLE KEYS */;
INSERT INTO `gonggaohuifu` VALUES (1,'2020-11-13 08:23:06','标题1','发表内容1','2020-11-13'),(2,'2020-11-13 08:23:06','标题2','发表内容2','2020-11-13'),(3,'2020-11-13 08:23:06','标题3','发表内容3','2020-11-13');
/*!40000 ALTER TABLE `gonggaohuifu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gonggaoxinxi`
--

DROP TABLE IF EXISTS `gonggaoxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gonggaoxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `gonggaoneirong` longtext COMMENT '公告内容',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gonggaoxinxi`
--

LOCK TABLES `gonggaoxinxi` WRITE;
/*!40000 ALTER TABLE `gonggaoxinxi` DISABLE KEYS */;
INSERT INTO `gonggaoxinxi` VALUES (1,'2020-11-13 08:23:06','标题1','公告内容1','2020-11-13'),(2,'2020-11-13 08:23:06','标题2','公告内容2','2020-11-13'),(3,'2020-11-13 08:23:06','标题3','公告内容3','2020-11-13');
/*!40000 ALTER TABLE `gonggaoxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hesuanjiance`
--

DROP TABLE IF EXISTS `hesuanjiance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hesuanjiance` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `jianceriqi` date DEFAULT NULL COMMENT '检测日期',
  `jianceqingkuang` longtext COMMENT '检测情况',
  `jiancebaogao` varchar(200) DEFAULT NULL COMMENT '检测报告',
  `jiancewendu` varchar(200) DEFAULT NULL COMMENT '检测温度',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='核酸检测';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hesuanjiance`
--

LOCK TABLES `hesuanjiance` WRITE;
/*!40000 ALTER TABLE `hesuanjiance` DISABLE KEYS */;
INSERT INTO `hesuanjiance` VALUES (1,'2020-11-13 08:23:06','名称1','2020-11-13','检测情况1','检测报告1','检测温度1','用户名1','姓名1','否',''),(2,'2020-11-13 08:23:06','名称2','2020-11-13','检测情况2','检测报告2','检测温度2','用户名2','姓名2','否',''),(3,'2020-11-13 08:23:06','名称3','2020-11-13','检测情况3','检测报告3','检测温度3','用户名3','姓名3','否','');
/*!40000 ALTER TABLE `hesuanjiance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tousuxinxi`
--

DROP TABLE IF EXISTS `tousuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tousuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `tousuneirong` longtext COMMENT '投诉内容',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='投诉信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tousuxinxi`
--

LOCK TABLES `tousuxinxi` WRITE;
/*!40000 ALTER TABLE `tousuxinxi` DISABLE KEYS */;
INSERT INTO `tousuxinxi` VALUES (1,'2020-11-13 08:23:06','名称1','2020-11-13','投诉内容1','用户名1','姓名1','否',''),(2,'2020-11-13 08:23:06','名称2','2020-11-13','投诉内容2','用户名2','姓名2','否',''),(3,'2020-11-13 08:23:06','名称3','2020-11-13','投诉内容3','用户名3','姓名3','否','');
/*!40000 ALTER TABLE `tousuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2020-11-13 08:23:06');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yezhu`
--

DROP TABLE IF EXISTS `yezhu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yezhu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `danyuanhao` varchar(200) DEFAULT NULL COMMENT '单元号',
  `fanghao` varchar(200) DEFAULT NULL COMMENT '房号',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='业主';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yezhu`
--

LOCK TABLES `yezhu` WRITE;
/*!40000 ALTER TABLE `yezhu` DISABLE KEYS */;
INSERT INTO `yezhu` VALUES (1,'2020-11-13 08:23:06','业主1','123456','姓名1','男','http://localhost:8080/ssm51710/upload/yezhu_touxiang1.jpg','单元号1','房号1','440300199101010001','13823888881'),(2,'2020-11-13 08:23:06','业主2','123456','姓名2','男','http://localhost:8080/ssm51710/upload/yezhu_touxiang2.jpg','单元号2','房号2','440300199202020002','13823888882'),(3,'2020-11-13 08:23:06','业主3','123456','姓名3','男','http://localhost:8080/ssm51710/upload/yezhu_touxiang3.jpg','单元号3','房号3','440300199303030003','13823888883');
/*!40000 ALTER TABLE `yezhu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-13 16:24:06
