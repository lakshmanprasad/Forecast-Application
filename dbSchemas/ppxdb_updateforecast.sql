CREATE DATABASE  IF NOT EXISTS `ppxdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ppxdb`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: ppxdb
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `updateforecast`
--

DROP TABLE IF EXISTS `updateforecast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `updateforecast` (
  `psa_id` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `q1_oct_vacation_hours` int(11) DEFAULT NULL,
  `q1_oct_admin_hours` int(11) DEFAULT NULL,
  `q1_nov_vacation_hours` int(11) DEFAULT NULL,
  `q1_nov_admin_hours` int(11) DEFAULT NULL,
  `q1_dec_vacation_hours` int(11) DEFAULT NULL,
  `q1_dec_admin_hours` int(11) DEFAULT NULL,
  `q2_jan_vacation_hours` int(11) DEFAULT NULL,
  `q2_jan_admin_hours` int(11) DEFAULT NULL,
  `q2_feb_vacation_hours` int(11) DEFAULT NULL,
  `q2_feb_admin_hours` int(11) DEFAULT NULL,
  `q2_mar_vacation_hours` int(11) DEFAULT NULL,
  `q2_mar_admin_hours` int(11) DEFAULT NULL,
  `q3_apr_vacation_hours` int(11) DEFAULT NULL,
  `q3_apr_admin_hours` int(11) DEFAULT NULL,
  `q3_may_vacation_hours` int(11) DEFAULT NULL,
  `q3_may_admin_hours` int(11) DEFAULT NULL,
  `q3_june_vacation_hours` int(11) DEFAULT NULL,
  `q3_june_admin_hours` int(11) DEFAULT NULL,
  `q4_july_vacation_hours` int(11) DEFAULT NULL,
  `q4_july_admin_hours` int(11) DEFAULT NULL,
  `q4_aug_vacation_hours` int(11) DEFAULT NULL,
  `q4_aug_admin_hours` int(11) DEFAULT NULL,
  `q4_sep_vacation_hours` int(11) DEFAULT NULL,
  `q4_sep_admin_hours` int(11) DEFAULT NULL,
  PRIMARY KEY (`psa_id`,`year`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `updateforecast`
--

LOCK TABLES `updateforecast` WRITE;
/*!40000 ALTER TABLE `updateforecast` DISABLE KEYS */;
INSERT INTO `updateforecast` VALUES (12345,20152016,13,190,12,191,13,199,22,197,23,199,24,199,26,199,26,195,21,194,22,194,21,192,20,195),(109750,20142015,20,4,21,56,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(123412,20142015,20,198,18,198,18,198,18,199,18,196,18,200,18,199,19,199,19,197,18,197,18,198,22,198),(135827,20142015,18,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),(269307,20142015,15,199,10,199,11,198,12,198,13,198,14,199,15,198,16,198,17,198,18,198,19,198,20,199),(269307,20152016,12,198,11,199,12,198,13,199,14,198,15,199,16,198,17,199,18,198,19,198,20,199,21,198),(543214,20142015,20,198,12,198,13,198,14,199,15,198,16,199,17,198,18,199,20,199,21,199,22,198,23,198),(2676543,20142015,20,28,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `updateforecast` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-27 11:25:46
