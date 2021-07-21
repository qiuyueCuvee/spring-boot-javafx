# spring-boot-javafx
spring-boot-javafx

基于springbooot+mybatis+javafx下的demo

SQL:
/*
 Navicat Premium Data Transfer

 Source Server         : mysql-127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : 127.0.0.1:3306
 Source Schema         : javafx

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 21/07/2021 17:11:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for login_user_info
-- ----------------------------
DROP TABLE IF EXISTS `login_user_info`;
CREATE TABLE `login_user_info`  (
  `userId` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `loginName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '真实姓名',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录密码',
  `accountType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号类型',
  `creatDate` datetime(0) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login_user_info
-- ----------------------------
INSERT INTO `login_user_info` VALUES ('1', 'admin', 'admin', '123', '1', '2021-07-21 14:54:02');

SET FOREIGN_KEY_CHECKS = 1;
