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
-- Table structure for table `calendar`
--

DROP TABLE IF EXISTS `calendar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendar` (
  `year` int(11) NOT NULL,
  `q1_oct_start_date` date DEFAULT NULL,
  `q1_oct_end_date` date DEFAULT NULL,
  `q1_oct_no_of_hours` int(11) DEFAULT NULL,
  `q1_nov_start_date` date DEFAULT NULL,
  `q1_nov_end_date` date DEFAULT NULL,
  `q1_nov_no_of_hours` int(11) DEFAULT NULL,
  `q1_dec_start_date` date DEFAULT NULL,
  `q1_dec_end_date` date DEFAULT NULL,
  `q1_dec_no_of_hours` int(11) DEFAULT NULL,
  `q2_jan_start_date` date DEFAULT NULL,
  `q2_jan_end_date` date DEFAULT NULL,
  `q2_jan_no_of_hours` int(11) DEFAULT NULL,
  `q2_feb_start_date` date DEFAULT NULL,
  `q2_feb_end_date` date DEFAULT NULL,
  `q2_feb_no_of_hours` int(11) DEFAULT NULL,
  `q2_mar_start_date` date DEFAULT NULL,
  `q2_mar_end_date` date DEFAULT NULL,
  `q2_mar_no_of_hours` int(11) DEFAULT NULL,
  `q3_apr_start_date` date DEFAULT NULL,
  `q3_apr_end_date` date DEFAULT NULL,
  `q3_apr_no_of_hours` int(11) DEFAULT NULL,
  `q3_may_start_date` date DEFAULT NULL,
  `q3_may_end_date` date DEFAULT NULL,
  `q3_may_no_of_hours` int(11) DEFAULT NULL,
  `q3_june_start_date` date DEFAULT NULL,
  `q3_june_end_date` date DEFAULT NULL,
  `q3_june_no_of_hours` int(11) DEFAULT NULL,
  `q4_july_start_date` date DEFAULT NULL,
  `q4_july_end_date` date DEFAULT NULL,
  `q4_july_no_of_hours` int(11) DEFAULT NULL,
  `q4_aug_start_date` date DEFAULT NULL,
  `q4_aug_end_date` date DEFAULT NULL,
  `q4_aug_no_of_hours` int(11) DEFAULT NULL,
  `q4_sep_start_date` date DEFAULT NULL,
  `q4_sep_end_date` date DEFAULT NULL,
  `q4_sep_no_of_hours` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendar`
--

LOCK TABLES `calendar` WRITE;
/*!40000 ALTER TABLE `calendar` DISABLE KEYS */;
INSERT INTO `calendar` VALUES (20142015,'2014-10-06','2014-11-01',200,'2014-01-01','2014-02-02',200,'2014-03-03','2014-04-04',225,'2014-06-06','2014-07-07',225,'2014-06-08','2014-07-09',180,'2014-06-09','2014-07-10',225,'2014-01-01','2014-02-02',225,'2014-02-02','2014-03-03',180,'2014-03-03','2014-04-14',225,'2014-04-04','2014-05-05',180,'2014-05-05','2014-06-06',225,'2014-06-06','2014-07-17',225),(20152016,'2014-01-10','2014-02-11',29,'2014-01-01','2014-02-02',22,'2014-03-03','2014-04-04',26,'2014-06-06','2014-07-07',10,'2014-06-08','2014-07-09',11,'2014-06-09','2014-07-10',12,'2014-01-01','2014-02-02',19,'2014-02-02','2014-03-03',20,'2014-03-03','2014-04-14',21,'2014-04-04','2014-05-05',22,'2014-05-05','2014-06-06',23,'2014-06-06','2014-07-17',24),(20162017,'2014-01-10','2014-02-11',18,'2014-01-01','2014-02-02',17,'2014-03-03','2014-04-04',17,'2014-06-06','2014-07-07',10,'2014-06-08','2014-07-09',11,'2014-06-09','2014-07-10',12,'2014-01-01','2014-02-02',19,'2014-02-02','2014-03-03',20,'2014-03-03','2014-04-14',21,'2014-04-04','2014-05-05',22,'2014-05-05','2014-06-06',23,'2014-06-06','2014-07-17',24);
/*!40000 ALTER TABLE `calendar` ENABLE KEYS */;
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
