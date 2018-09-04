/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-09-04 14:52:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for days_user
-- ----------------------------
DROP TABLE IF EXISTS `days_user`;
CREATE TABLE `days_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `state` int(10) DEFAULT NULL,
  `nickname` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of days_user
-- ----------------------------
INSERT INTO `days_user` VALUES ('1', '2', 'name');
INSERT INTO `days_user` VALUES ('3', '2', '2313141');
INSERT INTO `days_user` VALUES ('4', '22312', '   nameccccaaaa');
