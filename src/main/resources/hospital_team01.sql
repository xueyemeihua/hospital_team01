/*
Navicat MySQL Data Transfer

Source Server         : team01
Source Server Version : 50736
Source Host           : 127.0.0.1:3306
Source Database       : hospital_team01

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2023-02-03 19:41:28
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
  `curetime` datetime NOT NULL COMMENT '治疗时间',
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
  `deptid` int(4) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `deptname` varchar(40) NOT NULL COMMENT '部门名称',
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rankinfo
-- ----------------------------
INSERT INTO `rankinfo` VALUES ('1', '超级管理员');
INSERT INTO `rankinfo` VALUES ('2', '工作人员');

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
  `sickcard` varchar(18) NOT NULL COMMENT '病人身份证',
  `sickname` varchar(20) NOT NULL COMMENT '病人姓名',
  `sickphone` varchar(11) DEFAULT NULL COMMENT '病人手机号',
  `sickpwd` varchar(18) NOT NULL COMMENT '病人用户登录密码',
  `sickuname` varchar(18) NOT NULL COMMENT '病人用户登录名 ',
  `sickemail` varchar(20) DEFAULT NULL COMMENT '病人邮箱',
  PRIMARY KEY (`sickid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sickerinfo
-- ----------------------------
INSERT INTO `sickerinfo` VALUES ('1', '340881198607023459', '张三', '13188889999', '111', 'zs', '2889999245@qq.com');

-- ----------------------------
-- Table structure for stafinfo
-- ----------------------------
DROP TABLE IF EXISTS `stafinfo`;
CREATE TABLE `stafinfo` (
  `stafid` int(4) NOT NULL AUTO_INCREMENT COMMENT '医院工作人员编号',
  `postid` int(4) NOT NULL COMMENT '岗位编号',
  `mgr` int(4) DEFAULT NULL COMMENT '领导编号',
  `deptid` int(4) NOT NULL COMMENT '科室编号',
  `stafcard` varchar(18) NOT NULL COMMENT '身份证',
  `stafname` varchar(20) NOT NULL COMMENT '姓名',
  `rankid` int(2) DEFAULT NULL COMMENT '职称编号',
  `stafintro` varchar(500) DEFAULT NULL COMMENT '个人简介',
  `stafstate` int(1) DEFAULT '1' COMMENT '职员状态(0离职,1在职)',
  `stafphone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `username` varchar(16) NOT NULL COMMENT '登录名',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(18) NOT NULL COMMENT '密码',
  PRIMARY KEY (`stafid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stafinfo
-- ----------------------------
INSERT INTO `stafinfo` VALUES ('1', '1', null, '1', '340881199509082457', '赵云', '1', null, '1', '13078542345', 'zy', 'zy@qq.com', '111');
INSERT INTO `stafinfo` VALUES ('2', '1', null, '1', '340881199806093355', '张飞', '2', null, '1', '13123452345', 'zf', 'zf@qq.com', '111');
