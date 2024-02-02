-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.36 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para buscador
CREATE DATABASE IF NOT EXISTS `buscador` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `buscador`;

-- Volcando estructura para tabla buscador.items
CREATE TABLE IF NOT EXISTS `items` (
  `idItem` int NOT NULL AUTO_INCREMENT,
  `url` varchar(100) DEFAULT NULL,
  `tematica` varchar(45) DEFAULT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idItem`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla buscador.items: ~11 rows (aproximadamente)
INSERT INTO `items` (`idItem`, `url`, `tematica`, `descripcion`) VALUES
	(1, 'http://www.amazon.es', 'libros', 'web de libros y más cosas'),
	(2, 'http://www.fnac.es', 'libros', 'libreria completa'),
	(3, 'http://www.travel.es', 'viajes', 'viajes por el mundo'),
	(4, 'http://www.game.es', 'juegos', 'el mundo del juego'),
	(5, 'http://www.fly.com', 'viajes', 'vuelos a todos los destinos'),
	(6, 'http://www.techbooks.com', 'libros', 'libros técnicos'),
	(7, 'http://thgame.es', 'juegos', 'juegos retro'),
	(8, 'www.thebook.es', 'libros', 'libros antiguos'),
	(9, 'http://mygames.es', 'juegos', 'alquiler de juegos'),
	(10, 'http://www.spacebooks.es', 'libros', 'libros de astronomía'),
	(11, 'https://www.youtube.com/watch?v=j9cuTIPNMbY', 'juegos', 'juegos completos');


-- Volcando estructura de base de datos para escuela
CREATE DATABASE IF NOT EXISTS `escuela` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `escuela`;

-- Volcando estructura para tabla escuela.cursos
CREATE TABLE IF NOT EXISTS `cursos` (
  `idCurso` int NOT NULL AUTO_INCREMENT,
  `denominacion` varchar(45) DEFAULT NULL,
  `duracion` int DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla escuela.cursos: ~3 rows (aproximadamente)
INSERT INTO `cursos` (`idCurso`, `denominacion`, `duracion`, `precio`) VALUES
	(1, 'Java', 120, 250),
	(2, 'Python', 60, 120),
	(4, 'Java b�sico', 35, 30);

-- Volcando estructura para tabla escuela.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `usuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla escuela.usuarios: ~4 rows (aproximadamente)
INSERT INTO `usuarios` (`usuario`, `password`) VALUES
	('user1', 'pwd1'),
	('user2', 'pwd2'),
	('user3', 'pwd3'),
	('user4', 'pwd4');


-- Volcando estructura de base de datos para libros
CREATE DATABASE IF NOT EXISTS `libros` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `libros`;

-- Volcando estructura para tabla libros.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `idCliente` int unsigned NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `telefono` int unsigned NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla libros.clientes: ~15 rows (aproximadamente)
INSERT INTO `clientes` (`idCliente`, `usuario`, `password`, `email`, `telefono`) VALUES
	(1, 'test1', 'test1', 'test1@gmail.com', 22222),
	(2, 'test2', 'test2', 'test2@gmail.com', 3333),
	(3, 'test3', 'test3', 'afas', 444),
	(4, 'profe', 'profe', 'sadasd', 234),
	(5, 'ere', 'ff', 'aseea', 23),
	(7, 'fulano', 'mipassword', 'dfsfs@.es', 343434),
	(8, 'usuario_ejemplo', 'password_ejemplo', 'email@email.com', 33333),
	(9, 'miuser', 'mipass1', 'faddfs', 3434),
	(14, 'persiste', 'persiste', 'ddd', 34),
	(16, 'pepito', 'grillo', 'jajajaj', 777777),
	(17, 'mvc1', 'mvc1', 'sadas', 1111),
	(18, 'p1', 'p1', 'wwww', 1111),
	(50, 'mitienda', 'mitienda', 'mitienda@gmail.com', 555),
	(51, 'a', 'a', 'ajms66@gmail.com', 333),
	(52, 'asdas', 'q', 'servlet@gmail.com', 333);

-- Volcando estructura para tabla libros.libros
CREATE TABLE IF NOT EXISTS `libros` (
  `isbn` int unsigned NOT NULL,
  `titulo` varchar(200) NOT NULL,
  `autor` varchar(45) DEFAULT NULL,
  `precio` double NOT NULL,
  `paginas` int unsigned DEFAULT NULL,
  `idTema` int unsigned NOT NULL,
  PRIMARY KEY (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla libros.libros: ~22 rows (aproximadamente)
INSERT INTO `libros` (`isbn`, `titulo`, `autor`, `precio`, `paginas`, `idTema`) VALUES
	(888, 'Java 8', 'Gomez', 26.62, 300, 1),
	(900, 'Java 11', 'hilton', 41.14, 300, 1),
	(987, 'docker', 'sa', 23, 245, 7),
	(6723, 'Windows 20103', 'pears', 19, 170, 2),
	(8767, 'word', 'roberts', 14, 123, 4),
	(9009, 'excel', 'anónimo', 27, 300, 4),
	(9999, 'administración linux', 'angel lopez', 30, 370, 2),
	(13667, 'Machine Learning', 'Nelson', 31, 370, 3),
	(26003, 'docker', 'dfs', 44, 343, 5),
	(27883, 'Hadoop', 'Bryan', 30, 260, 3),
	(30303, 'Microservices', 'otro', 54.45, 600, 1),
	(34215, 'cisco', 'Martín', 30, 450, 6),
	(40004, 'diseño de página Web', 'alumnos', 15, 0, 5),
	(43944, 'programación python', 'engels', 33.88, 240, 1),
	(60006, 'JQuery', 'curso de Java', 45, 0, 5),
	(70990, 'docker', 'sa', 66.55, 22, 1),
	(78011, 'Java 15', 'Martín', 36.3, 450, 1),
	(78080, 'Angular xx', NULL, 0, 0, 1),
	(93345, 'Angular', 'pears', 24, 345, 5),
	(123345, 'Java 19', 'AA', 26.62, 300, 1),
	(987654, 'spring security', 'l2', 24.2, 0, 1),
	(54654654, 'fe', 'few', 44, 0, 5);

-- Volcando estructura para tabla libros.temas
CREATE TABLE IF NOT EXISTS `temas` (
  `idTema` int unsigned NOT NULL AUTO_INCREMENT,
  `tema` varchar(45) NOT NULL,
  PRIMARY KEY (`idTema`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla libros.temas: ~7 rows (aproximadamente)
INSERT INTO `temas` (`idTema`, `tema`) VALUES
	(1, 'programación'),
	(2, 'sistemas operativos'),
	(3, 'big data'),
	(4, 'ofimatica'),
	(5, 'web'),
	(6, 'redes'),
	(7, 'devops');

-- Volcando estructura para tabla libros.ventas
CREATE TABLE IF NOT EXISTS `ventas` (
  `idVenta` int unsigned NOT NULL AUTO_INCREMENT,
  `idCliente` int unsigned NOT NULL,
  `idLibro` int unsigned NOT NULL,
  `fecha` datetime NOT NULL,
  PRIMARY KEY (`idVenta`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla libros.ventas: ~30 rows (aproximadamente)
INSERT INTO `ventas` (`idVenta`, `idCliente`, `idLibro`, `fecha`) VALUES
	(1, 1, 9999, '2010-09-01 11:49:21'),
	(2, 1, 11123, '2011-09-01 11:49:21'),
	(3, 1, 11123, '2012-09-01 11:49:21'),
	(4, 1, 11123, '2012-09-02 12:38:23'),
	(5, 1, 9999, '2012-09-02 12:38:23'),
	(6, 1, 8767, '2013-02-16 00:00:00'),
	(7, 2, 11123, '2015-02-16 00:00:00'),
	(8, 1, 9999, '2015-02-16 00:00:00'),
	(10, 1, 9999, '2016-06-05 00:00:00'),
	(11, 1, 900, '2018-08-13 11:29:10'),
	(12, 1, 43944, '2018-08-13 11:29:10'),
	(13, 1, 13667, '2021-11-17 12:29:00'),
	(14, 1, 78011, '2021-11-18 09:38:47'),
	(15, 1, 900, '2021-11-29 11:05:20'),
	(16, 1, 9999, '2021-11-29 11:05:20'),
	(17, 1, 27883, '2021-11-29 11:05:20'),
	(18, 1, 13667, '2022-03-07 12:22:45'),
	(19, 1, 27883, '2022-03-07 12:22:45'),
	(20, 1, 26003, '2022-03-07 12:44:13'),
	(21, 1, 27883, '2022-03-07 12:45:23'),
	(22, 1, 900, '2022-03-17 09:45:43'),
	(23, 1, 70990, '2022-03-17 09:45:43'),
	(24, 1, 888, '2022-03-22 12:02:47'),
	(25, 1, 888, '2022-03-22 12:02:47'),
	(26, 1, 27883, '2022-03-22 12:02:47'),
	(27, 1, 27883, '2022-03-22 12:02:47'),
	(28, 1, 78011, '2022-03-22 12:03:44'),
	(29, 1, 27883, '2022-03-28 10:04:45'),
	(30, 1, 43944, '2022-03-30 10:42:15'),
	(31, 1, 888, '2022-03-30 10:42:15');


-- Volcando estructura de base de datos para tienda
CREATE DATABASE IF NOT EXISTS `tienda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tienda`;

-- Volcando estructura para tabla tienda.productos
CREATE TABLE IF NOT EXISTS `productos` (
  `idProducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla tienda.productos: ~4 rows (aproximadamente)
INSERT INTO `productos` (`idProducto`, `nombre`, `categoria`, `precio`) VALUES
	(1, 'pan', 'alimentación', 1.1),
	(2, 'leche', 'alimentación', 1.2),
	(3, 'silla', 'hogar', 30),
	(7, 'mantequilla', 'alimentación', 2.5);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
