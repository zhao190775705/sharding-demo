CREATE TABLE `test1` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
 `name` varchar(255) DEFAULT NULL COMMENT 'name',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='test';
CREATE TABLE `user1_0` (
   `id` bigint(8) NOT NULL,
   `city` varchar(20) CHARACTER SET utf8 NOT NULL,
   `name` varchar(20) CHARACTER SET utf8 NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COMMENT='分表测试1';
CREATE TABLE `user1_1` (
   `id` bigint(8) NOT NULL,
   `city` varchar(20) CHARACTER SET utf8 NOT NULL,
   `name` varchar(20) CHARACTER SET utf8 NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COMMENT='分表测试2';
CREATE TABLE `user1_2` (
   `id` bigint(8) NOT NULL,
   `city` varchar(20) CHARACTER SET utf8 NOT NULL,
   `name` varchar(20) CHARACTER SET utf8 NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COMMENT='分表测试3';
CREATE TABLE `user1_3` (
   `id` bigint(8) NOT NULL,
   `city` varchar(20) CHARACTER SET utf8 NOT NULL,
   `name` varchar(20) CHARACTER SET utf8 NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COMMENT='分表测试3';
