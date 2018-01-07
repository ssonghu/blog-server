/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2017-11-26 16:42:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog_aritcle
-- ----------------------------
DROP TABLE IF EXISTS `blog_aritcle`;
CREATE TABLE `blog_aritcle` (
  `id` varchar(32) NOT NULL,
  `title` varchar(64) DEFAULT NULL,
  `content` blob,
  `author` varbinary(32) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `descripition` text,
  `praise` int(11) DEFAULT NULL,
  `show_role` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_friendly_link
-- ----------------------------
DROP TABLE IF EXISTS `blog_friendly_link`;
CREATE TABLE `blog_friendly_link` (
  `id` varchar(32) NOT NULL,
  `logo_path` text,
  `descripition` varchar(32) DEFAULT NULL,
  `valid` tinyint(4) DEFAULT NULL,
  `create_teime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_pictrue
-- ----------------------------
DROP TABLE IF EXISTS `blog_pictrue`;
CREATE TABLE `blog_pictrue` (
  `id` varchar(32) NOT NULL,
  `picture_path` text,
  `create_time` date DEFAULT NULL,
  `valid` tinyint(4) DEFAULT NULL,
  `descripition` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_tags
-- ----------------------------
DROP TABLE IF EXISTS `blog_tags`;
CREATE TABLE `blog_tags` (
  `id` varchar(32) NOT NULL,
  `tag_name` varchar(32) DEFAULT NULL,
  `tag_desc` varchar(64) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `valid` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_tags_relationship
-- ----------------------------
DROP TABLE IF EXISTS `blog_tags_relationship`;
CREATE TABLE `blog_tags_relationship` (
  `id` varchar(32) NOT NULL,
  `aritcle_id` varchar(32) DEFAULT NULL,
  `tag_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_1` (`aritcle_id`),
  KEY `FK_Reference_2` (`tag_id`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`tag_id`) REFERENCES `blog_tags` (`id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`aritcle_id`) REFERENCES `blog_aritcle` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_users
-- ----------------------------
DROP TABLE IF EXISTS `blog_users`;
CREATE TABLE `blog_users` (
  `id` varchar(32) NOT NULL,
  `nick_name` varbinary(16) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `last_comment_time` date DEFAULT NULL,
  `last_login_time` date DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `role` char(1) DEFAULT NULL,
  `valid` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
