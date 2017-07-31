-- MySQL dump 10.13  Distrib 5.6.27, for linux-glibc2.5 (x86_64)
--
-- Host: localhost    Database: pms
-- ------------------------------------------------------
-- Server version	5.6.27

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `employee_no` varchar(30) DEFAULT NULL,
  `employee_name` varchar(30) DEFAULT NULL,
  `position` varchar(30) DEFAULT NULL,
  `index_no_login` int(10) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `index_no_login` (`index_no_login`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`index_no_login`) REFERENCES `login` (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (39,'HMSK/2013/02/0002','Udara','SE',NULL),(40,'HMSK/2010/02/0004','Parinda','SE',NULL),(41,'HMSK/2014/02/0005','Sadupa','SSE',NULL),(42,'HMSK/2015/03/0003','Yasith','ASE',NULL),(43,'HMSK/2011/02/0004','Kusala','SE',NULL),(44,'HMSK/2010/02/0005','john','SE',NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'manager','manager'),(2,'supervisor','supervisor'),(3,'employee','employee');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `project_no` varchar(30) DEFAULT NULL,
  `project_name` varchar(30) DEFAULT NULL,
  `client` varchar(30) DEFAULT NULL,
  `project_type` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`index_no`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (8,'HMSK/2017/0002','Shutter','Unknown','Web application'),(9,'HMSK/2016/0004','Wordpress site','Mobitel','Web site'),(10,'HMSK/2016/0008','Airtel quiz','Airtel pvt LTD','USSD'),(11,'HMSK/2016/0005','quiz','etisalat','ussd'),(12,'yrry','rtyrt','',''),(13,'yrry','rtyrt','','');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task` (
  `index_no` int(10) NOT NULL AUTO_INCREMENT,
  `task_no` varchar(30) DEFAULT NULL,
  `task_name` varchar(30) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `no_of_hours` varchar(30) DEFAULT NULL,
  `index_no_employee` int(10) DEFAULT NULL,
  `index_no_project` int(10) DEFAULT NULL,
  PRIMARY KEY (`index_no`),
  KEY `index_no_employee` (`index_no_employee`),
  KEY `index_no_project` (`index_no_project`),
  CONSTRAINT `task_ibfk_1` FOREIGN KEY (`index_no_employee`) REFERENCES `employee` (`index_no`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `task_ibfk_2` FOREIGN KEY (`index_no_project`) REFERENCES `project` (`index_no`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
INSERT INTO `task` VALUES (8,'0001','Making the SRS ','complete','20',40,8),(9,'0002','Designing the database','Complete','15',NULL,10),(10,'0002','Developping','Beginning','90',NULL,10),(11,'0003','testing','on going','20',44,8);
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-28 14:22:28
