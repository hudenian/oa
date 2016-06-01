/*
Navicat MySQL Data Transfer

Source Server         : local_incitodb
Source Server Version : 50535
Source Host           : localhost:3306
Source Database       : huma_oa

Target Server Type    : MYSQL
Target Server Version : 50535
File Encoding         : 65001

Date: 2016-06-01 17:33:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `oa_user`
-- ----------------------------
DROP TABLE IF EXISTS `oa_user`;
CREATE TABLE `oa_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oa_user
-- ----------------------------
INSERT INTO `oa_user` VALUES ('2', 'hudenian', 'hudenian');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员');
INSERT INTO `role` VALUES ('2', '职员');
INSERT INTO `role` VALUES ('4', '出纳');
INSERT INTO `role` VALUES ('7', '333');

-- ----------------------------
-- Table structure for `t_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info` (
  `user_id` varchar(32) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `PASSWORD` varchar(32) NOT NULL,
  `mobile_no` varchar(20) NOT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `user_pic` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_info
-- ----------------------------
INSERT INTO `t_user_info` VALUES ('DA0DF8DFC18BB561E040007F01003AAE', 'zhangsan', '3a5a34d794719471f85084c3f4e4b6c0', '3333', 'zs', 'image001.png,100px,100px,0px,0px', '3333@qq.com', '2013-04-25 18:11:20');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
