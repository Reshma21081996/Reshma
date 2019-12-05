CREATE DATABASE  IF NOT EXISTS `smart-shop` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `smart-shop`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: smart-shop
-- ------------------------------------------------------
-- Server version	5.7.10-log

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
-- Dumping data for table `bill_history`
--

LOCK TABLES `bill_history` WRITE;
/*!40000 ALTER TABLE `bill_history` DISABLE KEYS */;
INSERT INTO `bill_history` VALUES (1,'2019-08-11',2,'01','Mars97'),(2,'2019-11-30',3,'04','Mars97'),(9,'2019-12-01',3,'08','ad1'),(12,'2019-12-01',1,'04','userr'),(13,'2019-12-01',2,'03','userr'),(14,'2019-12-01',2,'11','ad1'),(15,'2019-12-01',2,'07','ad1'),(18,'2019-12-02',1,'03','Mars97'),(19,'2019-12-02',2,'02','Mars97'),(20,'2019-12-02',2,'06','Mars97'),(21,'2019-12-02',1,'11','Mars97'),(22,'2019-12-02',1,'04','Mars97'),(23,'2019-12-03',2,'09','Mars97'),(24,'2019-12-03',4,'04','ad1');
/*!40000 ALTER TABLE `bill_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (25);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `product_info`
--

LOCK TABLES `product_info` WRITE;
/*!40000 ALTER TABLE `product_info` DISABLE KEYS */;
INSERT INTO `product_info` VALUES ('01','Shoes','Nikes',7999,34,'2018-03-12','A5','S5','2017-03-12','2019-03-12','https://images.unsplash.com/photo-1460353581641-37baddab0fa2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Sports & Fitness',NULL),('02','Dress','H&M',5999,20,'2019-03-12','A3','S3','2017-03-12','2019-03-12','https://images.unsplash.com/photo-1499939667766-4afceb292d05?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Clothing & Accessories',NULL),('03','Mobile phone','Apple',42999,30,'2019-10-30','A4','S4','2017-03-12','2019-03-12','https://images.unsplash.com/photo-1557189750-56d1be9e963a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Electronics',NULL),('04','Sofa','Danube',34999,6,'2018-03-12','A1','S1','2017-03-12','2019-03-12','https://images.unsplash.com/photo-1550581190-9c1c48d21d6c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Home Decor',NULL),('06','Headphones','Beats',5999,23,'2019-05-19','A3','S4','2017-03-12','2019-03-12','https://images.unsplash.com/photo-1549206464-82c129240d11?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Electronics',NULL),('07','Dumbbells','proFit',2500,12,'2019-07-19','A6','S1','2017-03-12','2017-03-12','https://images.unsplash.com/photo-1493690283958-32df2c86326e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Sports & Fitness',NULL),('08','Earrings [Set of 3]','Estelle',999,18,'2018-09-11','A3','S2','2017-03-12','2017-03-12','https://images.unsplash.com/photo-1573227895226-86880bc6ce44?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Clothing & Accessories',NULL),('09','Tshirt','Max',499,43,'2018-10-05','A2','S2','2017-03-12','2017-03-12','https://images.unsplash.com/photo-1491592459486-f04f965504d3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Clothing & Accessories',NULL),('11','Cushion','Color Homes',699,15,'2018-02-21','A4','S2','2017-03-12','2019-03-12','https://images.unsplash.com/photo-1550230426-453a4378ea4e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60','Home Decor',NULL);
/*!40000 ALTER TABLE `product_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'A'),(2,'U'),(3,'superuser');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` VALUES ('11','js','sd',33,'male','1237890765','$2a$10$R9eWCg72KFAlo4isMtCzD.9xSQQL2iYtXuRK885e.nILFX4DEVQ3q','A','A'),('Ad','adm','fds',34,'female','4563217890','$2a$10$CRMGqx0xjsa0NshQ5aj1QOPDD7/CSVqSWu7CXw2Ddzy0mpiilhLsK','A','A'),('ad1','admin','one',30,'female','9566377735','$2a$10$HKVdZj8oVZtmOWW2aT4VEOJDRiTh8BiTayh8eKJrQHxGYbA0rlyYK','U','A'),('admin1','meh','one',31,'male','1234567890','$2a$10$/bZBxmGGFAgtZOPYE1Bwe.Nw76/dBTt3jV7J33S93xr1Mjh0XZLHq','A','A'),('adminn','bdsj','kdvmnks',21,'female','1234567888','$2a$10$551e/RL0OJaQneGVCY1YcOQtbNXS9PUYbopp7meqgBPPLPZJ11q6S','A','A'),('adminnn','efdew','rhtrt',34,'male','1234566540','$2a$10$P8Sp/nstT26pwAIOcgEj8.K8NaHOY3Haq/to2iJbjeZGToV5PluIe','A','A'),('Mars97','Mariyam','Mars',22,'female','1234509876','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','U','A'),('me','meh','one',12,'female','1234567899','$2a$10$TWGdi.dn8hdoEJOQbEJL0.yDTREjYzewsBWvzM7h6Vf.lDNm3eMZ.','A','A'),('Meh15','Mehnaz','Meh',22,'female','1234567890','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','A','A'),('su','super','user',22,'male','1234567898','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK','A','A'),('u2','ads','evrs',56,'male','1236547899','$2a$10$B3aRL0SSlNY5F2hyYoR.2ubMsc0v2Ltoe0ylTSmzCkZg/htDGdCGa','U','A'),('userr','dscdf','kvsdfm',12,'female','9597456322','$2a$10$v/Mby1WtSGEUrbmVo/fGWe2ZdBP/1CnQ.03HnpqLvvwe4fut4Bq0G','U','A');
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'Meh15',1),(2,'Mars97',2),(8,'ad1',2),(10,'su',3),(11,'admin1',1),(12,'me',1),(13,'u2',2),(14,'Ad',1),(15,'11',1),(16,'adminn',1),(17,'userr',2),(18,'adminnn',1);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-04 10:04:35
