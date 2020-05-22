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
-- Table structure for table `meniu`
--

DROP TABLE IF EXISTS `meniu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meniu` (
  `id` int(11) NOT NULL,
  `denumire` varchar(100) NOT NULL,
  `gramaj` varchar(45) NOT NULL,
  `informati` varchar(200) NOT NULL,
  `pret` int(11) NOT NULL,
  `image_path` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meniu`
--

LOCK TABLES `meniu` WRITE;
/*!40000 ALTER TABLE `meniu` DISABLE KEYS */;
INSERT INTO `meniu` VALUES (1,'Spaghete panna speck e rucola','250 gr','Spaghete cu smantana vegetala , branza, speck si rucola fresh.',28,'SpaghetePanna.jpg'),(2,'Spaghete carbonara','250 gr','Spaghete cu bacon, smantana, ou si parmezan.',26,'carbonara.jpg'),(3,'Penne quattro formagi','250 gr','Pene cu 4 tipuri de branza : parmesan, gorgonzola,mozarela si chedar.',30,'formagi.jpg'),(4,'Pennette cu ton si rosii cherry','250gr','Pennette cu ton in ulei, usturoi, rozmarin si rosii cherry',40,'tono.jpg'),(5,'Muschi de vita cu sos si cartofi','200gr/200gr','Muschi de vita cu sos la alegere : de gorgonzola, hribi sau sos de piper verde si garnitura de cartofi la cuptor.',50,'beef.jpg'),(6,'Dorada la gratar cu legume','200gr/200gr','Dorada la gratar acompaniata de legume la gratar(gogosari, vinete, rosii si dovlecel)',45,'dorada.jpg'),(7,'Pizza crudo e gorogonzola','350 gr','Aluat de pizza, mozzarella, sos de rosii, gorgonzola, prosciutto crudo',28,'crudo.jpg'),(8,'Pizza Salami','400 gr','Aluat de pizza, mozzarella, sos de rosii, salam.',24,'salami.jpg'),(9,'Pizza Napoletana','300 gr','Aluat de pizza, mozzarella, sos de rosii, ansoa, capere, masline, oregano',24,'napoletana.jpg'),(10,'Pizza Hawaii','380 gr','Aluat de pizza, mozzarella, sos de rosii, sunca, bacon, ananas, porumb.',30,'hawai.jpg'),(11,'Pizza vegetariana','400 gr','Aluat de pizza, mozzarella, sos de rosii, vinete, dovlecel, rosii, ardei, porumb.',20,'vegetariana.jpg'),(12,'Prajitura Tiramisu','100','Mascarpone, piscoturi savoiardi, galbenus ou pasteurizat, frisca, vin Marsala, ciocolata neagra, cacao, esenta de vanilie, zahar si cafea',15,'tiramisu.jpg'),(13,'Prajitura Cheesecake','150 gr','Cheesecake cu sos de ciocolata sau de fructe.',17,'cheescake.jpg'),(14,'Lava Cake','150','Lava cake',13,'lava.jpg');
/*!40000 ALTER TABLE `meniu` ENABLE KEYS */;
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
