create database bank2;
-- MySQL dump 10.13  Distrib 5.5.54, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: Bank2
-- ------------------------------------------------------
-- Server version	5.5.54-0ubuntu0.14.04.1

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
-- Table structure for table `Account`
--
use bank2;
DROP TABLE IF EXISTS `Account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Account` (
  `Account_no` int(10) NOT NULL AUTO_INCREMENT,
  `Account_type` varchar(10) NOT NULL,
  `Balance` int(20) NOT NULL,
  `Aadhar_no` varchar(12) NOT NULL,
  PRIMARY KEY (`Account_no`),
  KEY `Aadhar_no` (`Aadhar_no`),
  CONSTRAINT `Account_ibfk_1` FOREIGN KEY (`Aadhar_no`) REFERENCES `Customer` (`Aadhar_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10007 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Account`
--

LOCK TABLES `Account` WRITE;
/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
INSERT INTO `Account` VALUES (10001,'Savings',198800,'111111222222'),(10002,'Savings',10100,'222222111111'),(10003,'Savings',30100,'222222333333'),(10004,'Savings',21000,'333333222222'),(10005,'Savings',10000,'333333444444'),(10006,'Savings',25000,'444444333333');
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customer` (
  `FName` varchar(20) NOT NULL,
  `LName` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Phone_no` varchar(10) NOT NULL,
  `Aadhar_no` varchar(12) NOT NULL,
  `DOB` varchar(10) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Username` varchar(10) NOT NULL,
  PRIMARY KEY (`Aadhar_no`),
  KEY `Username` (`Username`),
  CONSTRAINT `Customer_ibfk_1` FOREIGN KEY (`Username`) REFERENCES `User` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES ('Riddhi','Sanghvi','Shivajinagr, Pune -03','rsanghvi97@gmail.com','7709319760','111111222222','1997-10-31','Female','Riddhi'),('Ruchi','Shinde','Hadapsar,Pune -12','ruchi@gmail.com','8446018873','222222111111','1997-07-13','Female','RuchiS'),('Shikha','Jaiswal','ABC,Pune-14','shikhaJ@yahoo.com','9096761781','333333222222','1996-12-02','Female','Shikh'),('Priyanka','Lokhande','Vishrantwadi,Pune-01','pri97@gmail.com','9762904612','333333444444','1997-10-25','Female','Pri'),('Sharvari','Kulkarni','Vimannagar,Pune-02','sharvari@gmail.com','7709880176','444444333333','1997-03-04','Female','Shar');
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Transactions`
--

DROP TABLE IF EXISTS `Transactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Transactions` (
  `Sr` int(10) NOT NULL AUTO_INCREMENT,
  `Account_no` int(10) NOT NULL,
  `BenificiaryAccount_no` int(10) NOT NULL,
  `Amount` int(20) NOT NULL,
  PRIMARY KEY (`Sr`),
  KEY `Account_no` (`Account_no`),
  KEY `BenificiaryAccount_no` (`BenificiaryAccount_no`),
  CONSTRAINT `Transactions_ibfk_1` FOREIGN KEY (`Account_no`) REFERENCES `Account` (`Account_no`),
  CONSTRAINT `Transactions_ibfk_2` FOREIGN KEY (`BenificiaryAccount_no`) REFERENCES `Account` (`Account_no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Transactions`
--

LOCK TABLES `Transactions` WRITE;
/*!40000 ALTER TABLE `Transactions` DISABLE KEYS */;
INSERT INTO `Transactions` VALUES (1,10001,10004,1000),(2,10001,10002,100),(3,10001,10003,100);
/*!40000 ALTER TABLE `Transactions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(10) NOT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES ('Pri','Pri123'),('Riddhi','sangss'),('RuchiS','ruchi'),('Shar','shar'),('Shikh','shikha');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-06 10:18:47accountcustomer
