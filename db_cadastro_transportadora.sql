-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: db_cadastro
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `transportadora`
--

DROP TABLE IF EXISTS `transportadora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transportadora` (
  `id_transportadora` int NOT NULL AUTO_INCREMENT,
  `transp_cnpj` varchar(45) DEFAULT NULL,
  `transp_razaoS` varchar(45) DEFAULT NULL,
  `transp_apelido` varchar(45) DEFAULT NULL,
  `transp_iE` varchar(45) DEFAULT NULL,
  `transp_status` int DEFAULT NULL,
  `transp_codIbge` int DEFAULT NULL,
  `transp_plat` varchar(45) DEFAULT NULL,
  `transp_empi` varchar(45) DEFAULT NULL,
  `transp_cep` varchar(45) DEFAULT NULL,
  `transp_rua` varchar(45) DEFAULT NULL,
  `transp_num` int DEFAULT NULL,
  `transp_bairro` varchar(45) DEFAULT NULL,
  `transp_cidade` varchar(45) DEFAULT NULL,
  `transp_uf` varchar(45) DEFAULT NULL,
  `transp_compl` varchar(45) DEFAULT NULL,
  `transp_telFixo` varchar(45) DEFAULT NULL,
  `transp_telCel` varchar(45) DEFAULT NULL,
  `transp_telW` varchar(45) DEFAULT NULL,
  `transp_mailC` varchar(45) DEFAULT NULL,
  `transp_endWeb` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_transportadora`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transportadora`
--

LOCK TABLES `transportadora` WRITE;
/*!40000 ALTER TABLE `transportadora` DISABLE KEYS */;
/*!40000 ALTER TABLE `transportadora` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-27 17:34:01
