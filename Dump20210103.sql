-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlyhocvien
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `course_student`
--

DROP TABLE IF EXISTS `course_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course_student` (
  `idcourse_student` int NOT NULL AUTO_INCREMENT,
  `name_course` varchar(45) NOT NULL,
  `hour_course` varchar(45) NOT NULL,
  `code_student` int NOT NULL,
  PRIMARY KEY (`idcourse_student`),
  KEY `fk_code_students_idx` (`code_student`),
  CONSTRAINT `fk_code_students` FOREIGN KEY (`code_student`) REFERENCES `student_hocvien` (`idstudent_hocvien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_student`
--

LOCK TABLES `course_student` WRITE;
/*!40000 ALTER TABLE `course_student` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register_account_qlhv`
--

DROP TABLE IF EXISTS `register_account_qlhv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `register_account_qlhv` (
  `idRegister` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `confirm_password` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`idRegister`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register_account_qlhv`
--

LOCK TABLES `register_account_qlhv` WRITE;
/*!40000 ALTER TABLE `register_account_qlhv` DISABLE KEYS */;
INSERT INTO `register_account_qlhv` VALUES (1,'thu','thu','123','123','Female','1111','1111','1111'),(2,'thu','thu','123','123','Female','1223','1223','1111'),(3,'anh','thu','1234','1234','Female','123','123','123');
/*!40000 ALTER TABLE `register_account_qlhv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_hocvien`
--

DROP TABLE IF EXISTS `student_hocvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_hocvien` (
  `idstudent_hocvien` int NOT NULL AUTO_INCREMENT,
  `name_student` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `born` varchar(45) NOT NULL,
  `number_phone` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`idstudent_hocvien`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_hocvien`
--

LOCK TABLES `student_hocvien` WRITE;
/*!40000 ALTER TABLE `student_hocvien` DISABLE KEYS */;
INSERT INTO `student_hocvien` VALUES (1,'rrrr','Female','09/12/2020','4444','email@gmail.com','aaaa'),(2,'22','Female','2021-33-02 10:33:48','4444','thu@gmail.com','444'),(3,'22','Female','2021-34-02 10:34:07','4444','thu@gmail.com','444'),(4,'tutu','Female','2021-34-02 10:34:38','4444','thu@gmail.com','444'),(5,'tutu','Female','2021-36-02 10:36:19','4444','thu@gmail.com','444'),(6,'123','Female','2021-49-02 10:49:59','555','@gmail.com','aaaa'),(7,'thuanh','Female','2021-53-02 10:53:55','555','555','777'),(8,'tytutotete','Female','2021-30-02 11:30:48','999','t@gmail.com','4444'),(9,'thuanh','Female','35-03-2021 12:35:58','09999','t@gmail.com','rrr'),(10,'888','Female','38-03-2021 12:38:32','09876444','t@gmail.com','444'),(11,'taty','Female','2021-02-03  01:02:37','0987654322','t@gmail.com','3rr');
/*!40000 ALTER TABLE `student_hocvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_hocvien`
--

DROP TABLE IF EXISTS `subject_hocvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject_hocvien` (
  `idsubject_hocvien` int NOT NULL AUTO_INCREMENT,
  `number_phone` varchar(45) NOT NULL,
  `name_subject_one` varchar(45) NOT NULL,
  `name_subject_two` varchar(45) NOT NULL,
  `name_subject_three` varchar(45) NOT NULL,
  `class_subject_one` varchar(45) NOT NULL,
  `class_subject_two` varchar(45) NOT NULL,
  `class_subject_three` varchar(45) NOT NULL,
  `codeStudent` int NOT NULL,
  PRIMARY KEY (`idsubject_hocvien`),
  KEY `fk_code_student_idx` (`codeStudent`),
  CONSTRAINT `fk_code_subject` FOREIGN KEY (`codeStudent`) REFERENCES `student_hocvien` (`idstudent_hocvien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_hocvien`
--

LOCK TABLES `subject_hocvien` WRITE;
/*!40000 ALTER TABLE `subject_hocvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject_hocvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'quanlyhocvien'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-03  6:54:35
