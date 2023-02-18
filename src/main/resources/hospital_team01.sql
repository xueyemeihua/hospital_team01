/*
Navicat MySQL Data Transfer

Source Server         : team01
Source Server Version : 50736
Source Host           : 127.0.0.1:3306
Source Database       : hospital_team01

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2023-02-18 21:31:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for caseinfo
-- ----------------------------
DROP TABLE IF EXISTS `caseinfo`;
CREATE TABLE `caseinfo` (
  `caseid` int(4) NOT NULL AUTO_INCREMENT COMMENT '病例编号',
  `diagnosis` varchar(500) DEFAULT NULL COMMENT '诊断结果',
  `curescheme` varchar(500) DEFAULT NULL COMMENT '治疗方案',
  `curetime` datetime DEFAULT NULL COMMENT '治疗时间',
  `sickid` int(4) NOT NULL COMMENT '病人编号',
  `stafid` int(4) NOT NULL COMMENT '医生编号',
  `casestate` int(1) NOT NULL COMMENT '病例状态(0未接诊，1已接诊)',
  `regid` int(4) NOT NULL COMMENT '挂号单编号',
  PRIMARY KEY (`caseid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of caseinfo
-- ----------------------------
INSERT INTO `caseinfo` VALUES ('1', '阑尾炎', '手术', '2023-02-09 16:54:57', '23', '3', '1', '4');
INSERT INTO `caseinfo` VALUES ('2', '骨折', 'B超,保守治疗', '2023-02-12 13:10:26', '23', '2', '1', '5');
INSERT INTO `caseinfo` VALUES ('3', null, null, null, '23', '3', '0', '8');

-- ----------------------------
-- Table structure for deptinfo
-- ----------------------------
DROP TABLE IF EXISTS `deptinfo`;
CREATE TABLE `deptinfo` (
  `deptid` int(4) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `deptname` varchar(40) NOT NULL COMMENT '部门名称',
  PRIMARY KEY (`deptid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deptinfo
-- ----------------------------
INSERT INTO `deptinfo` VALUES ('1', '心脏科');
INSERT INTO `deptinfo` VALUES ('2', '神经科');
INSERT INTO `deptinfo` VALUES ('3', '骨科');
INSERT INTO `deptinfo` VALUES ('4', '血液科');
INSERT INTO `deptinfo` VALUES ('5', '麻醉科');
INSERT INTO `deptinfo` VALUES ('6', '妇科');
INSERT INTO `deptinfo` VALUES ('7', '儿科');
INSERT INTO `deptinfo` VALUES ('8', '普外科');
INSERT INTO `deptinfo` VALUES ('9', '普内科');
INSERT INTO `deptinfo` VALUES ('10', '医技科室');
INSERT INTO `deptinfo` VALUES ('11', '传统中医科');
INSERT INTO `deptinfo` VALUES ('12', '管理员');

-- ----------------------------
-- Table structure for druginfo
-- ----------------------------
DROP TABLE IF EXISTS `druginfo`;
CREATE TABLE `druginfo` (
  `drugid` int(4) NOT NULL AUTO_INCREMENT COMMENT '药品编号',
  `drugname` varchar(40) NOT NULL COMMENT '药品名称',
  `druginven` int(8) NOT NULL COMMENT '药品库存',
  `drugprice` decimal(8,0) NOT NULL COMMENT '药品价格',
  `drugindate` datetime NOT NULL COMMENT '药品过效期',
  `drugprodate` datetime NOT NULL COMMENT '药品出产日期',
  `drugfac` int(4) NOT NULL COMMENT '药品生产厂家',
  `facphone` varchar(11) NOT NULL COMMENT '药品厂家电话',
  `drugfunc` varchar(255) NOT NULL COMMENT '药品功能',
  `drugspeci` varchar(100) NOT NULL COMMENT '药品规格',
  PRIMARY KEY (`drugid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of druginfo
-- ----------------------------
INSERT INTO `druginfo` VALUES ('1', '阿莫西林', '2221', '32', '2023-02-08 00:00:00', '2023-02-01 00:00:00', '3', '13123234545', '消炎', '0.125g*12粒*2板*盒');
INSERT INTO `druginfo` VALUES ('2', '板蓝根', '2221', '18', '2023-02-16 00:00:00', '2023-02-14 00:00:00', '3', '12124246767', '增强免疫力', '80g*20袋*盒');
INSERT INTO `druginfo` VALUES ('3', '达克宁', '2221', '17', '2023-02-26 00:00:00', '2023-02-16 00:00:00', '1', '18935358989', '治脚气', '150g*支');
INSERT INTO `druginfo` VALUES ('4', '布诺芬', '2233', '30', '2023-02-18 00:00:00', '2023-02-01 00:00:00', '4', '19835356767', '退烧止痛', '0.125g*12粒*1板*盒');
INSERT INTO `druginfo` VALUES ('5', '三九胃泰', '2221', '40', '2023-02-02 00:00:00', '2023-02-16 00:00:00', '2', '13837894567', '养胃', '80g*20袋*盒');
INSERT INTO `druginfo` VALUES ('13', '六味地黄丸', '2000', '35', '2025-02-17 00:00:00', '2023-02-17 00:00:00', '1', '18935358989', '补肾亏', '0.25g*360粒*瓶');

-- ----------------------------
-- Table structure for fac
-- ----------------------------
DROP TABLE IF EXISTS `fac`;
CREATE TABLE `fac` (
  `drugfac` int(11) NOT NULL AUTO_INCREMENT COMMENT '厂家编号',
  `drugfacname` varchar(255) DEFAULT NULL COMMENT '生产厂家',
  PRIMARY KEY (`drugfac`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of fac
-- ----------------------------
INSERT INTO `fac` VALUES ('1', '云南白药');
INSERT INTO `fac` VALUES ('2', '恒瑞医药');
INSERT INTO `fac` VALUES ('3', '复星医药');
INSERT INTO `fac` VALUES ('4', '科伦药业');

-- ----------------------------
-- Table structure for leaveword
-- ----------------------------
DROP TABLE IF EXISTS `leaveword`;
CREATE TABLE `leaveword` (
  `lwid` int(4) NOT NULL AUTO_INCREMENT COMMENT '留言编号',
  `lwname` varchar(18) NOT NULL COMMENT '留言人姓名',
  `lwphone` varchar(11) NOT NULL COMMENT '留言人电话',
  `lwemail` varchar(20) NOT NULL COMMENT '留言人邮箱',
  `leaveword` varchar(800) NOT NULL,
  `caseid` int(4) NOT NULL COMMENT '病例编号',
  PRIMARY KEY (`lwid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leaveword
-- ----------------------------
INSERT INTO `leaveword` VALUES ('12', '张三', '13178374567', 'zs@kgc.com', '你笑起来真好看', '0');
INSERT INTO `leaveword` VALUES ('13', '张三', '13178374567', 'zs@kgc.com', '111', '0');
INSERT INTO `leaveword` VALUES ('14', '张三', '13178374567', 'zs@kgc.com', '222', '1');

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  ` newsid` int(4) NOT NULL AUTO_INCREMENT COMMENT '新闻编号',
  `newstitle` varchar(50) NOT NULL COMMENT '新闻标题',
  `newsdate` date NOT NULL COMMENT '新闻日期',
  `newscont` varchar(1000) NOT NULL COMMENT '新闻内容',
  `newsstate` int(1) NOT NULL DEFAULT '1' COMMENT '新闻状态(0过时,1适时可以被管理员放到网页)',
  PRIMARY KEY (` newsid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for paiban
-- ----------------------------
DROP TABLE IF EXISTS `paiban`;
CREATE TABLE `paiban` (
  `paibanid` int(4) NOT NULL AUTO_INCREMENT COMMENT '排班编号',
  `stafid` int(4) DEFAULT NULL COMMENT '医生编号',
  `date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`paibanid`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paiban
-- ----------------------------
INSERT INTO `paiban` VALUES ('1', '1', '2023-02-17');
INSERT INTO `paiban` VALUES ('3', '1', '2023-02-20');
INSERT INTO `paiban` VALUES ('5', '2', '2023-02-17');
INSERT INTO `paiban` VALUES ('7', '2', '2023-02-19');
INSERT INTO `paiban` VALUES ('14', '1', '2023-02-19');
INSERT INTO `paiban` VALUES ('15', '3', '2023-02-19');
INSERT INTO `paiban` VALUES ('16', '1', '2023-02-19');
INSERT INTO `paiban` VALUES ('40', '6', '2023-02-18');
INSERT INTO `paiban` VALUES ('41', '7', '2023-02-18');

-- ----------------------------
-- Table structure for postinfo
-- ----------------------------
DROP TABLE IF EXISTS `postinfo`;
CREATE TABLE `postinfo` (
  `postid` int(4) NOT NULL AUTO_INCREMENT COMMENT '岗位编号',
  `postname` varchar(10) NOT NULL COMMENT '岗位名称',
  `deptid` int(11) NOT NULL,
  PRIMARY KEY (`postid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of postinfo
-- ----------------------------
INSERT INTO `postinfo` VALUES ('1', '妇科主治医师', '6');
INSERT INTO `postinfo` VALUES ('2', '骨关节外科主治医师', '3');
INSERT INTO `postinfo` VALUES ('3', '创面修复科主治医师', '8');
INSERT INTO `postinfo` VALUES ('4', '心血管内科副主任医师', '1');
INSERT INTO `postinfo` VALUES ('5', '心血管内科主治医师', '1');
INSERT INTO `postinfo` VALUES ('6', '心血管内科医师', '1');
INSERT INTO `postinfo` VALUES ('7', '消化内科医师', '9');
INSERT INTO `postinfo` VALUES ('8', '核医学科医师', '10');
INSERT INTO `postinfo` VALUES ('9', '超声科医师', '10');
INSERT INTO `postinfo` VALUES ('10', '新生儿科主治医师', '7');
INSERT INTO `postinfo` VALUES ('11', '中医科医师', '11');
INSERT INTO `postinfo` VALUES ('12', '康复医学科副主任医师', '10');
INSERT INTO `postinfo` VALUES ('13', '麻醉科医师', '5');
INSERT INTO `postinfo` VALUES ('14', '高压氧科主任医师', '10');
INSERT INTO `postinfo` VALUES ('15', '神经科主治医师', '2');
INSERT INTO `postinfo` VALUES ('16', '血液科主治医师', '4');
INSERT INTO `postinfo` VALUES ('17', '超级管理员', '12');
INSERT INTO `postinfo` VALUES ('18', '心理咨询师', '2');

-- ----------------------------
-- Table structure for prescinfo
-- ----------------------------
DROP TABLE IF EXISTS `prescinfo`;
CREATE TABLE `prescinfo` (
  `prescid` int(4) NOT NULL AUTO_INCREMENT COMMENT '处方单编号',
  `drugid` int(4) NOT NULL COMMENT '药品编号',
  `caseid` int(4) NOT NULL COMMENT '病例编号',
  `drugcount` int(4) NOT NULL DEFAULT '0' COMMENT '药品数量',
  `prescstate` int(1) NOT NULL COMMENT '抓药状态(0未抓药,1已抓药)',
  `catchtime` varchar(20) DEFAULT NULL COMMENT '抓药时间',
  PRIMARY KEY (`prescid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prescinfo
-- ----------------------------
INSERT INTO `prescinfo` VALUES ('1', '1', '1', '2', '1', '20230209 16:59:30');
INSERT INTO `prescinfo` VALUES ('2', '1', '2', '5', '1', '20230212 13:56:10');
INSERT INTO `prescinfo` VALUES ('3', '2', '1', '3', '1', '20230212 18:30:58');

-- ----------------------------
-- Table structure for rankinfo
-- ----------------------------
DROP TABLE IF EXISTS `rankinfo`;
CREATE TABLE `rankinfo` (
  `rankid` int(4) NOT NULL AUTO_INCREMENT COMMENT '职称编号',
  `rankname` varchar(10) NOT NULL COMMENT '职称名',
  `regfeeid` int(4) NOT NULL,
  `leavel` int(11) DEFAULT NULL,
  PRIMARY KEY (`rankid`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rankinfo
-- ----------------------------
INSERT INTO `rankinfo` VALUES ('1', '超级管理员', '1', '999');
INSERT INTO `rankinfo` VALUES ('2', '护士', '1', '0');
INSERT INTO `rankinfo` VALUES ('3', '护师', '1', '1');
INSERT INTO `rankinfo` VALUES ('4', '主管护师', '1', '2');
INSERT INTO `rankinfo` VALUES ('5', '副主任护师', '1', '3');
INSERT INTO `rankinfo` VALUES ('6', '主任护师', '1', '4');
INSERT INTO `rankinfo` VALUES ('7', '初级药士', '1', '0');
INSERT INTO `rankinfo` VALUES ('8', '初级药师', '1', '1');
INSERT INTO `rankinfo` VALUES ('9', '中级主管药师', '1', '2');
INSERT INTO `rankinfo` VALUES ('10', '副主任药剂师', '1', '3');
INSERT INTO `rankinfo` VALUES ('11', '主任药剂师', '1', '4');
INSERT INTO `rankinfo` VALUES ('12', '初级中药士', '1', '0');
INSERT INTO `rankinfo` VALUES ('13', '初级中药师', '1', '1');
INSERT INTO `rankinfo` VALUES ('14', '中级主管中药师', '1', '2');
INSERT INTO `rankinfo` VALUES ('15', '初级检验技士', '1', '0');
INSERT INTO `rankinfo` VALUES ('16', '初级检验技师', '1', '1');
INSERT INTO `rankinfo` VALUES ('17', '检验主管技师', '1', '2');
INSERT INTO `rankinfo` VALUES ('18', '副主任检验师', '1', '3');
INSERT INTO `rankinfo` VALUES ('19', '主任检验师', '1', '4');
INSERT INTO `rankinfo` VALUES ('20', '初级放射技士', '1', '0');
INSERT INTO `rankinfo` VALUES ('21', '初级放射技师', '1', '1');
INSERT INTO `rankinfo` VALUES ('22', '放射主管技师', '1', '2');
INSERT INTO `rankinfo` VALUES ('23', '副主任放射技师', '1', '3');
INSERT INTO `rankinfo` VALUES ('24', '主任放射技师', '1', '4');
INSERT INTO `rankinfo` VALUES ('25', '医士', '2', '0');
INSERT INTO `rankinfo` VALUES ('26', '医生', '2', '1');
INSERT INTO `rankinfo` VALUES ('27', '主治医师', '3', '2');
INSERT INTO `rankinfo` VALUES ('28', '副主任医师', '3', '3');
INSERT INTO `rankinfo` VALUES ('29', '主任医师', '3', '4');
INSERT INTO `rankinfo` VALUES ('30', '康复治疗士', '1', '0');
INSERT INTO `rankinfo` VALUES ('31', '初级康复治疗师', '1', '1');
INSERT INTO `rankinfo` VALUES ('32', '中级治疗师', '1', '2');
INSERT INTO `rankinfo` VALUES ('33', '高级治疗师', '1', '3');
INSERT INTO `rankinfo` VALUES ('99', '实习生', '1', '0');

-- ----------------------------
-- Table structure for regfeestander
-- ----------------------------
DROP TABLE IF EXISTS `regfeestander`;
CREATE TABLE `regfeestander` (
  `regfeeid` int(4) NOT NULL AUTO_INCREMENT COMMENT '挂号费标准编号',
  `regdesc` varchar(255) NOT NULL COMMENT '挂号费标准说明',
  `regfee` decimal(6,0) NOT NULL COMMENT '挂号费',
  PRIMARY KEY (`regfeeid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of regfeestander
-- ----------------------------
INSERT INTO `regfeestander` VALUES ('1', '非医生', '0');
INSERT INTO `regfeestander` VALUES ('2', '普通号', '10');
INSERT INTO `regfeestander` VALUES ('3', '专家号', '20');

-- ----------------------------
-- Table structure for reginfo
-- ----------------------------
DROP TABLE IF EXISTS `reginfo`;
CREATE TABLE `reginfo` (
  `regid` int(4) NOT NULL AUTO_INCREMENT COMMENT '挂号编号',
  `deptid` int(4) NOT NULL COMMENT '科室编号',
  `regdate` datetime NOT NULL COMMENT '挂号时间',
  `regfeeid` int(4) NOT NULL COMMENT '挂号费标准编号',
  `sickid` int(4) NOT NULL COMMENT '病人编号',
  `stafid` int(4) NOT NULL COMMENT '医生编号',
  `regstate` int(1) NOT NULL COMMENT '挂号单状态(0失效,1有效)',
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reginfo
-- ----------------------------
INSERT INTO `reginfo` VALUES ('4', '8', '2023-02-07 16:03:15', '3', '23', '3', '1');
INSERT INTO `reginfo` VALUES ('5', '3', '2023-02-11 13:11:29', '3', '23', '2', '1');
INSERT INTO `reginfo` VALUES ('6', '1', '2023-02-15 09:50:32', '3', '26', '1', '1');
INSERT INTO `reginfo` VALUES ('7', '1', '2023-02-15 09:58:05', '3', '27', '1', '1');
INSERT INTO `reginfo` VALUES ('8', '8', '2023-02-14 02:33:57', '3', '23', '3', '1');

-- ----------------------------
-- Table structure for sickerinfo
-- ----------------------------
DROP TABLE IF EXISTS `sickerinfo`;
CREATE TABLE `sickerinfo` (
  `sickid` int(4) NOT NULL AUTO_INCREMENT COMMENT '病人编号',
  `sickcard` varchar(18) DEFAULT NULL COMMENT '病人身份证',
  `sickname` varchar(20) DEFAULT NULL COMMENT '病人姓名',
  `sickphone` varchar(11) DEFAULT NULL COMMENT '病人手机号',
  `sickpwd` varchar(18) NOT NULL COMMENT '病人用户登录密码',
  `sickuname` varchar(18) DEFAULT NULL COMMENT '病人用户登录名 ',
  `sickemail` varchar(20) DEFAULT NULL COMMENT '病人邮箱',
  PRIMARY KEY (`sickid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sickerinfo
-- ----------------------------
INSERT INTO `sickerinfo` VALUES ('1', '320681199807014611', '袁佳峰', '13862989462', '11111111', 'yjf', 'm13093163852@163.com');
INSERT INTO `sickerinfo` VALUES ('23', '340881198008073333', '张三', '13199029715', '111', 'zs', 'zs@163.com');
INSERT INTO `sickerinfo` VALUES ('24', null, null, null, 'lqs', 'lqs', null);

-- ----------------------------
-- Table structure for stafinfo
-- ----------------------------
DROP TABLE IF EXISTS `stafinfo`;
CREATE TABLE `stafinfo` (
  `stafid` int(4) NOT NULL AUTO_INCREMENT COMMENT '医院工作人员编号',
  `postid` int(4) NOT NULL COMMENT '岗位编号',
  `deptid` int(4) NOT NULL COMMENT '科室编号',
  `stafcard` varchar(18) NOT NULL COMMENT '身份证',
  `stafname` varchar(20) NOT NULL COMMENT '姓名',
  `rankid` int(2) DEFAULT NULL COMMENT '职称编号',
  `stafintro` varchar(500) DEFAULT NULL COMMENT '个人简介',
  `stafstate` int(1) NOT NULL COMMENT '职员状态(0离职,1在职)',
  `stafphone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `username` varchar(16) NOT NULL COMMENT '登录名',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(18) NOT NULL COMMENT '密码',
  PRIMARY KEY (`stafid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stafinfo
-- ----------------------------
INSERT INTO `stafinfo` VALUES ('0', '17', '12', '111111111111111111', '超级管理员', '1', 'cccccc', '1', '11111111111', 'sroot', 'sroot@kgc.com', 'sroot');
INSERT INTO `stafinfo` VALUES ('1', '5', '1', '320681199807014612', '华佗', '27', 'asdasdsa', '1', '12345678910', 'ht', 'ht@kgc.com', 'ht');
INSERT INTO `stafinfo` VALUES ('2', '2', '3', '320681199807014613', '扁鹊', '27', 'qweqwe', '1', '11111111111', 'bq', 'bq@kgc.com', 'bq');
INSERT INTO `stafinfo` VALUES ('3', '3', '8', '324554654364364362', '张仲景', '27', 'eeeeee', '0', '12312312312', 'zzj', 'zzz@kgc.com', 'zzj');
INSERT INTO `stafinfo` VALUES ('4', '14', '10', '432714732147247194', '胡涛涛', '27', 'hhhhh', '1', '41451354543', 'htt', 'htt@kgc.com', 'htt');
INSERT INTO `stafinfo` VALUES ('5', '16', '8', '154454312543151353', '钟离昧', '27', 'hhkhlk', '1', '21431421445', 'zlm', 'zlm@kgc.com', 'zlm');
INSERT INTO `stafinfo` VALUES ('6', '1', '6', '340881200101017899', '刘奇', '99', '', '1', '13113142345', 'lq', 'lq@kgc.com', 'lq');
INSERT INTO `stafinfo` VALUES ('7', '1', '6', '340881200101017899', '刘奇', '99', '', '1', '13113142345', 'lq', 'lq@kgc.com', 'lq');
