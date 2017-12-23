# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.6.19)
# Database: greatm_task
# Generation Time: 2017-12-23 06:52:35 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_task_release
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_task_release`;

CREATE TABLE `t_task_release` (
  `task_id` bigint(20) unsigned NOT NULL COMMENT '任务ID',
  `acco_id` bigint(20) unsigned NOT NULL COMMENT '发布人ID',
  `owner_name` varchar(50) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '发布人名称,冗余数据',
  `owner_pic` varchar(300) DEFAULT NULL COMMENT '发布人头像,冗余数据',
  `city_id` bigint(20) DEFAULT NULL COMMENT '城市ID',
  `start_time` datetime NOT NULL COMMENT '任务生效开始时间',
  `end_time` datetime NOT NULL COMMENT '任务截至时间',
  `title` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '标题',
  `content` varchar(500) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '内容',
  `description` varchar(1000) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '说明,非格式化数据预留字段',
  `gender` tinyint(4) NOT NULL DEFAULT '2' COMMENT '性别要求 1：男  2：女',
  `hire_count` int(10) NOT NULL DEFAULT '1' COMMENT '招募数量',
  `payment` decimal(10,0) unsigned NOT NULL DEFAULT '0' COMMENT '应付金额',
  `cate_id` varchar(100) DEFAULT NULL COMMENT '分类ID',
  `cate_tag` varchar(100) DEFAULT NULL COMMENT '分类tag',
  `task_pass` varchar(20) DEFAULT NULL COMMENT '任务密码',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`task_id`),
  KEY `IDX_acco_id` (`acco_id`) USING BTREE,
  FULLTEXT KEY `IDX_cate_id` (`cate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务发布信息表';



# Dump of table t_task_schedule
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_task_schedule`;

CREATE TABLE `t_task_schedule` (
  `task_id` bigint(20) unsigned NOT NULL COMMENT '任务ID',
  `apply_count` int(10) NOT NULL DEFAULT '0' COMMENT '当前报名人数',
  `hired_id` bigint(20) DEFAULT NULL COMMENT '签约人ID',
  `hired_name` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '签约人姓名,冗余数据',
  `hired_time` datetime DEFAULT NULL COMMENT '签约时间',
  `task_status` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '任务状态 1待招募, 3招募结束|待完成, 5交付中, 7完成, 9任务已撤销',
  `pay_status` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '账单状态 1待支付, 3已支付, 5待结算, 7已结算, 9撤销退款中, 11撤销已退款',
  `complain_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '投诉状态 0无投诉 1有投诉',
  `review_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '评价状态 0未评价 1已评价',
  `audi_status` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '审核状态 0未确认, 1未审核, 2审核通过, 3驳回',
  `audi_over_reason` varchar(1000) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '驳回原因',
  `audi_time` datetime DEFAULT NULL COMMENT '审核时间',
  `audi_id` bigint(20) unsigned DEFAULT NULL COMMENT '审核人ID',
  `complete_time` datetime DEFAULT NULL COMMENT '完成时间',
  `complete_accoid` bigint(20) unsigned DEFAULT NULL COMMENT '完成确认人ID',
  `cancel_time` datetime DEFAULT NULL COMMENT '取消时间',
  `cancel_accoid` bigint(20) unsigned DEFAULT NULL COMMENT '取消人ID',
  `cancel_reason` varchar(1000) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '取消原因',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`task_id`),
  KEY `IDX_cele_id` (`hired_id`) USING BTREE,
  KEY `IDX_task_status` (`task_status`) USING BTREE,
  KEY `IDX_pay_status` (`pay_status`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务进度信息表';




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
