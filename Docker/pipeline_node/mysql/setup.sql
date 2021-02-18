DROP DATABASE IF EXISTS `tnpdemo`;
CREATE DATABASE IF NOT EXISTS `tnpdemo` /*!40100 DEFAULT CHARACTER SET armscii8 COLLATE armscii8_bin */;
CREATE USER 'tnproot'@'localhost' IDENTIFIED BY 'tnproot';
GRANT CREATE, ALTER, INDEX, LOCK TABLES, REFERENCES, UPDATE, DELETE, DROP, SELECT, INSERT ON `tnpdemo`.* TO 'tnproot'@'localhost';
FLUSH PRIVILEGES;
USE `tnpdemo`;
DROP TABLE IF EXISTS `SequelizeMeta`;
CREATE TABLE IF NOT EXISTS `SequelizeMeta` (
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`name`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
DROP TABLE IF EXISTS `voiture`;
CREATE TABLE IF NOT EXISTS `voiture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isDeleted` tinyint(1) NOT NULL DEFAULT '0',
  `description` varchar(255) COLLATE armscii8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=armscii8 COLLATE=armscii8_bin;