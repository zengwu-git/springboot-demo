/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2021-05-14 13:55:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_account
-- ----------------------------
DROP TABLE IF EXISTS `tb_account`;
CREATE TABLE `tb_account` (
  `id` varchar(100) DEFAULT NULL,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `employee_number` varchar(100) DEFAULT NULL,
  `employee_email` varchar(255) DEFAULT NULL,
  `birth_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_account
-- ----------------------------
INSERT INTO `tb_account` VALUES ('1', '2', null, '2570134037@qq.com', '2021-05-28 00:00:00');
INSERT INTO `tb_account` VALUES ('2', '曾武', null, '2570134037@qq.com', '2021-05-12 00:00:00');
INSERT INTO `tb_account` VALUES ('3', '蔺豪杰', null, '', '2019-05-12 00:00:00');
INSERT INTO `tb_account` VALUES ('6b6da8c7-343f-47c2-9192-0da9e322b1dc', '曾小无', '110', '2570134037@qq.com', '2021-05-21 00:00:00');
INSERT INTO `tb_account` VALUES ('adc00df3-5f32-4278-acb4-c59bdc7a5f76', '1', '124', '2570134037@qq.com', '2021-05-19 00:00:00');
INSERT INTO `tb_account` VALUES ('7b39219c-9d48-4edd-a5f1-f0aa35d4b6a1', '1', '124', '2570134037@qq.com', '2021-05-19 00:00:00');
INSERT INTO `tb_account` VALUES ('ac3abf6c-babe-4645-91e1-ac6dc1c5e938', '程建军', '1', 'chenjianjun198910@163.com', '1991-05-13 00:00:00');
INSERT INTO `tb_account` VALUES ('4da25057-2860-4202-9eab-fabfafe53691', '1', '1', '1', '2021-05-13 00:00:00');
INSERT INTO `tb_account` VALUES ('9ce45043-7583-41ba-89dc-f01a796b15c2', '1', '1', '1', '2021-05-12 00:00:00');
INSERT INTO `tb_account` VALUES ('465ffa76-0ca4-46af-9357-4d84199b4c44', '1', '1', '1', '2021-05-18 00:00:00');
INSERT INTO `tb_account` VALUES ('1d90172b-e86c-4e39-8a00-f9728340c334', '1', '1', '1', '2021-05-12 00:00:00');
INSERT INTO `tb_account` VALUES ('4b67a499-921b-4fa0-a066-60dcb7005e85', '1', '1', '1', '2021-05-12 00:00:00');
INSERT INTO `tb_account` VALUES ('5c7f45c8-8e32-4021-8a24-6b996c0d2410', '1', '1', '1', '2021-05-20 00:00:00');
INSERT INTO `tb_account` VALUES ('3c71bf65-b41c-4b79-97bc-ea4fbe715f36', '1', '1', '1', '2021-05-12 00:00:00');
INSERT INTO `tb_account` VALUES ('a4770b21-5d76-4e5c-a959-77f7fde21052', '1', '1', '1', '2021-05-12 00:00:00');
INSERT INTO `tb_account` VALUES ('093a69d5-b3fa-4251-a1cf-1426725825a5', '1', '1', '1', '2021-05-07 00:00:00');
INSERT INTO `tb_account` VALUES ('76ba8c80-fac9-4189-a660-3ab1b91bd662', '翔', '12', '1095134226@qq.com', '2021-05-13 00:00:00');
