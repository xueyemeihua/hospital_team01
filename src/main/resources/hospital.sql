/*
Navicat MySQL Data Transfer

Source Server         : 李阳
Source Server Version : 50736
Source Host           : 127.0.0.1:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2023-02-01 19:02:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for caseinfo
-- ----------------------------
DROP TABLE IF EXISTS `caseinfo`;
CREATE TABLE `caseinfo` (
  `caseid` int(4) NOT NULL AUTO_INCREMENT COMMENT '病例编号',
  `diagnosis` varchar(500) NOT NULL COMMENT '诊断结果',
  `curescheme` varchar(500) NOT NULL COMMENT '治疗方案',
  `curetime` datetime NOT NULL,
  `sickid` int(4) NOT NULL COMMENT '病人编号',
  `casestate` int(1) NOT NULL COMMENT '病例状态(0未接诊，1已接诊)',
  PRIMARY KEY (`caseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of caseinfo
-- ----------------------------

-- ----------------------------
-- Table structure for deptinfo
-- ----------------------------
DROP TABLE IF EXISTS `deptinfo`;
CREATE TABLE `deptinfo` (
  `deptid` int(4) NOT NULL AUTO_INCREMENT,
  `deptname` varchar(40) NOT NULL,
  PRIMARY KEY (`deptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of deptinfo
-- ----------------------------

-- ----------------------------
-- Table structure for druginfo
-- ----------------------------
DROP TABLE IF EXISTS `druginfo`;
CREATE TABLE `druginfo` (
  `drugid` int(4) NOT NULL AUTO_INCREMENT COMMENT '药品编号',
  `drugname` varchar(40) NOT NULL COMMENT '药品名称',
  `druginven` int(8) NOT NULL COMMENT '药品库存',
  `drugprice` decimal(8,0) NOT NULL COMMENT '药品价格',
  `drugindate` int(4) NOT NULL COMMENT '药品有效期',
  `drugprodate` datetime NOT NULL COMMENT '药品出产日期',
  `drugfac` varchar(20) NOT NULL COMMENT '药品生产厂家',
  `facphone` varchar(11) NOT NULL COMMENT '药品厂家电话',
  `drugfunc` varchar(255) NOT NULL COMMENT '药品功能',
  `drugspeci` varchar(100) NOT NULL COMMENT '药品规格',
  PRIMARY KEY (`drugid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of druginfo
-- ----------------------------

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(10) NOT NULL,
  `job` varchar(20) DEFAULT NULL,
  `salary` int(10) DEFAULT NULL,
  `mgr` int(10) DEFAULT NULL,
  `bonus` int(10) DEFAULT NULL,
  `hiredate` varchar(10) DEFAULT NULL,
  `deptno` int(10) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', 'mary', 'sales', '20000', '6', '1000', '2014-01-01', '10');
INSERT INTO `emp` VALUES ('2', 'lily', 'sales', '6000', '1', '800', '2014-05-01', '10');
INSERT INTO `emp` VALUES ('3', 'tom', 'sales', '13000', '1', '4000', '2014-03-01', '10');
INSERT INTO `emp` VALUES ('4', 'james', 'account', '8000', '6', null, '2014-02-01', '20');
INSERT INTO `emp` VALUES ('5', 'scott', 'teaching', '8000', '6', '3000', '2014-01-20', '30');
INSERT INTO `emp` VALUES ('6', 'tom', 'BOSS', '38000', null, null, '2013-01-20', '30');
INSERT INTO `emp` VALUES ('7', 'kitty', 'teaching', '7000', '5', '700', '2014-05-20', '30');
INSERT INTO `emp` VALUES ('8', 'kitty', 'teaching', '6000', '5', '500', '2014-06-20', '30');
INSERT INTO `emp` VALUES ('9', 'green', 'analyst', '15000', '6', '1000', '2014-02-20', '40');
INSERT INTO `emp` VALUES ('10', 'brown', 'analyst', '12000', '9', '7000', '2014-04-20', '40');
INSERT INTO `emp` VALUES ('11', 'danis', 'department', '3000', '6', '800', '2014-03-04', '50');
INSERT INTO `emp` VALUES ('12', 'brown', 'department', '1800', '11', '600', '2014-04-20', '50');
INSERT INTO `emp` VALUES ('13', 'smith', 'department', '1200', '11', '500', '2014-05-20', '50');

-- ----------------------------
-- Table structure for postinfo
-- ----------------------------
DROP TABLE IF EXISTS `postinfo`;
CREATE TABLE `postinfo` (
  `postid` int(4) NOT NULL AUTO_INCREMENT COMMENT '岗位编号',
  `postname` varchar(10) NOT NULL COMMENT '岗位名称',
  PRIMARY KEY (`postid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of postinfo
-- ----------------------------

-- ----------------------------
-- Table structure for prescinfo
-- ----------------------------
DROP TABLE IF EXISTS `prescinfo`;
CREATE TABLE `prescinfo` (
  `prescid` int(4) NOT NULL AUTO_INCREMENT COMMENT '处方单编号',
  `drugid` int(4) NOT NULL COMMENT '药品编号',
  `caseid` int(4) NOT NULL COMMENT '病例编号',
  `drugcount` int(4) NOT NULL COMMENT '药品数量',
  `prescstate` int(1) NOT NULL COMMENT '抓药状态(0未抓药,1已抓药)',
  PRIMARY KEY (`prescid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prescinfo
-- ----------------------------

-- ----------------------------
-- Table structure for rankinfo
-- ----------------------------
DROP TABLE IF EXISTS `rankinfo`;
CREATE TABLE `rankinfo` (
  `rankid` int(4) NOT NULL AUTO_INCREMENT COMMENT '职称编号',
  `rankname` varchar(10) NOT NULL COMMENT '职称名',
  PRIMARY KEY (`rankid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rankinfo
-- ----------------------------

-- ----------------------------
-- Table structure for reganddoc
-- ----------------------------
DROP TABLE IF EXISTS `reganddoc`;
CREATE TABLE `reganddoc` (
  `rdno` int(4) NOT NULL AUTO_INCREMENT COMMENT '挂号单与医生关联编号',
  `regid` int(4) unsigned NOT NULL COMMENT '挂号单编号',
  `stafid` int(4) NOT NULL COMMENT '医生编号',
  PRIMARY KEY (`rdno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reganddoc
-- ----------------------------

-- ----------------------------
-- Table structure for reggeestander
-- ----------------------------
DROP TABLE IF EXISTS `reggeestander`;
CREATE TABLE `reggeestander` (
  `regfeeid` int(4) NOT NULL AUTO_INCREMENT COMMENT '挂号费标准编号',
  `regdesc` varchar(255) NOT NULL COMMENT '挂号费标准说明',
  `regfee` decimal(6,0) NOT NULL COMMENT '挂号费',
  PRIMARY KEY (`regfeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reggeestander
-- ----------------------------

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
  `regstate` int(1) NOT NULL COMMENT '挂号单状态(0失效,1有效)',
  PRIMARY KEY (`regid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reginfo
-- ----------------------------

-- ----------------------------
-- Table structure for sickerinfo
-- ----------------------------
DROP TABLE IF EXISTS `sickerinfo`;
CREATE TABLE `sickerinfo` (
  `sickid` int(4) NOT NULL AUTO_INCREMENT COMMENT '病人编号',
  `cardid` varchar(18) NOT NULL COMMENT '病人身份证',
  `sickname` varchar(20) NOT NULL COMMENT '病人姓名',
  PRIMARY KEY (`sickid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sickerinfo
-- ----------------------------

-- ----------------------------
-- Table structure for stafinfo
-- ----------------------------
DROP TABLE IF EXISTS `stafinfo`;
CREATE TABLE `stafinfo` (
  `stafid` int(4) NOT NULL AUTO_INCREMENT COMMENT '医院工作人员编号',
  `postid` int(4) NOT NULL COMMENT '岗位编号',
  `mgr` int(4) NOT NULL COMMENT '领导编号',
  `deptid` int(4) NOT NULL COMMENT '科室编号',
  `stafcard` varchar(18) NOT NULL COMMENT '身份证',
  `stafname` varchar(20) NOT NULL COMMENT '姓名',
  `rankid` int(2) NOT NULL COMMENT '职称编号',
  `stafintro` varchar(500) NOT NULL COMMENT '个人简介',
  `stafstate` int(1) NOT NULL COMMENT '职员状态(0离职,1在职)',
  PRIMARY KEY (`stafid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stafinfo
-- ----------------------------
