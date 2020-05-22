-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `rezervare`
--

DROP TABLE IF EXISTS `rezervare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rezervare` (
  `id` int(11) NOT NULL,
  `nume` varchar(45) NOT NULL,
  `prenume` varchar(45) NOT NULL,
  `nrTelefon` varchar(45) NOT NULL,
  `infoRezervare` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rezervare`
--

LOCK TABLES `rezervare` WRITE;
/*!40000 ALTER TABLE `rezervare` DISABLE KEYS */;
INSERT INTO `rezervare` VALUES (1,'Mihai','Trestariu','0745124649','As dori o masa pentru 4 persoane in data de 10.01.2020, la ora 20:00.Mentionez ca vom dori masa sa fie langa semineul restaurantului.Multumesc anticipat!'),(2,'Ion','Avramescu','0722346782','Buna, as dori o masa pentru 10 persoane in data de 12.01.2020, la ora 18:30, mentionez ca va fi o zi de nastere si vom dori ca masa sa fie aranjata in acest sens.Multumesc.'),(3,' Bot','Ioana','0745682190','As dori o rezervare pe data de 18/01/2020 pentru mine si iubitul meu, mentionez ca e aniversarea noastra si am dorisa ne rezervati 2 din deserturile voastre . Multumesc'),(4,'Dumitrescu','Florin','0745234890','In data de 24/01/2020 as dori o masa 4 perosane la ora 18:00.Multumesc'),(5,'Diaconu','Mircea','0733452902','O masa la fereastra pentru 6 persoane, in data de 25/01/2020 la ora 16:00.O zi buna !');
/*!40000 ALTER TABLE `rezervare` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-13 15:57:49
