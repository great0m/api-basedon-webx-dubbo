# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.6.19)
# Database: greatm_api
# Generation Time: 2017-12-23 06:50:19 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_account_generator_cfg
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_account_generator_cfg`;

CREATE TABLE `t_account_generator_cfg` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `tag` varchar(8) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tag` (`tag`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='通行证账号生产表';



# Dump of table t_account_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_account_info`;

CREATE TABLE `t_account_info` (
  `acco_id` bigint(20) unsigned NOT NULL COMMENT '通行证ID',
  `biz_role` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '商户身份 0：未开通 1：开通 2：禁用',
  `star_role` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '网红身份 0：未开通 1：开通 2：禁用',
  `user_role` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '用户身份 0：未开通 1：开通 2：禁用',
  `first_log` datetime DEFAULT NULL COMMENT '首次登录时间',
  `last_log` datetime DEFAULT NULL COMMENT '最后登录时间',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `wechat` varchar(50) DEFAULT NULL COMMENT '第三方账号-微信',
  `weibo` varchar(50) DEFAULT NULL COMMENT '第三方账号-微博',
  `qq` varchar(50) DEFAULT NULL COMMENT '第三方账号-QQ',
  `status` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '状态 1：有效 0：无效',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`acco_id`),
  KEY `IDX_bus_ser` (`biz_role`) USING BTREE,
  KEY `IDX_net_ser` (`star_role`) USING BTREE,
  KEY `IDX_cust_ser` (`user_role`) USING BTREE,
  KEY `IDX_status` (`status`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通行证信息表';




--
-- Dumping routines (PROCEDURE) for database 'greatm_api'
--
DELIMITER ;;

# Dump of PROCEDURE p_account_generator
# ------------------------------------------------------------

/*!50003 DROP PROCEDURE IF EXISTS `p_account_generator` */;;
/*!50003 SET SESSION SQL_MODE="NO_ENGINE_SUBSTITUTION"*/;;
/*!50003 CREATE*/ /*!50020 DEFINER=`root`@`localhost`*/ /*!50003 PROCEDURE `p_account_generator`()
BEGIN
start transaction;
REPLACE INTO t_account_generator_cfg (tag) VALUES ('tag'); 
commit;
SELECT LAST_INSERT_ID(); 
END */;;

/*!50003 SET SESSION SQL_MODE=@OLD_SQL_MODE */;;
DELIMITER ;

/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
