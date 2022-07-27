-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bulspyvcal7twxi2ukzg-mysql.services.clever-cloud.com:3306
-- Generation Time: Jul 27, 2022 at 12:46 AM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `portfolioValdez`
--

-- --------------------------------------------------------

--
-- Table structure for table `banner`
--

CREATE TABLE `banner` (
  `id` bigint(20) NOT NULL,
  `url_banner` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `banner`
--

INSERT INTO `banner` (`id`, `url_banner`) VALUES
(1, 'https://i.ibb.co/fD1Xmsq/banner.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id` bigint(20) NOT NULL,
  `institucion_educacion` varchar(255) DEFAULT NULL,
  `tiempo_educacion` varchar(255) DEFAULT NULL,
  `titulo_educacion` varchar(255) DEFAULT NULL,
  `url_educacion` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id`, `institucion_educacion`, `tiempo_educacion`, `titulo_educacion`, `url_educacion`) VALUES
(17, 'Educación IT', 'Mayo 2022 - actualidad', 'Data Analytics ', 'https://i.ibb.co/0c9BMK5/educacion-IT.jpg'),
(18, 'Ministerio de Desarrollo Productivo', 'Noviembre 2021 - actualidad', 'Full Stack Developer Jr. ', 'https://i.ibb.co/4NfJr5F/inti.png'),
(19, 'Fundación Telefónica Movistar', '30 hs. Junio 2021', 'Analítica Web', 'https://i.ibb.co/fxPgsBt/ftm.jpg'),
(20, 'Fundación Telefónica Movistar', '20 hs. Mayo 2021', 'Principios Básicos de BigData', 'https://i.ibb.co/fxPgsBt/ftm.jpg'),
(21, 'Fundación Telefónica Movistar', '40 hs. Marzo 2021', 'Programación con JavaScript', 'https://i.ibb.co/fxPgsBt/ftm.jpg'),
(22, 'Instituto de Idiomas de la Universidad de La Punta', 'Agosto - Noviembre 2016', 'Lengua de Señas Argentina Nivel 1', 'https://i.ibb.co/fM0znCx/idi.jpg'),
(23, 'Comunidad IT', 'Agosto - Noviembre 2015', 'Programación de Aplicaciones en C# .Net', 'https://i.ibb.co/yd8bPcT/commit.png'),
(24, 'Tomás Alva Edison', '2008 - 2012 ', 'Producción de Bienes y Servicios con Orientación en Informática', 'https://i.ibb.co/cxktxpn/tae.png');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id` bigint(20) NOT NULL,
  `institucion_experiencia` varchar(255) DEFAULT NULL,
  `tiempo_experiencia` varchar(255) DEFAULT NULL,
  `titulo_experiencia` varchar(255) DEFAULT NULL,
  `url_experiencia` varchar(255) DEFAULT NULL,
  `descripcion_experiencia` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia`
--

INSERT INTO `experiencia` (`id`, `institucion_experiencia`, `tiempo_experiencia`, `titulo_experiencia`, `url_experiencia`, `descripcion_experiencia`) VALUES
(1, 'Centro Educativo de Formación Laboral Integrada', 'agosto 2020 - actualidad', 'Profesora de Computación', 'https://i.ibb.co/44DxQKL/CEFLI.png', 'Taller de computación con contenidos adaptados para jóvenes y adultos con discapacidad cuyo objetivo es obtener los conocimientos necesarios para una correcta inserción laboral. (Software de Ofimática, Diseño Gráfico y Apoyo a la Inclusión Educativa)');

-- --------------------------------------------------------

--
-- Table structure for table `habilidad`
--

CREATE TABLE `habilidad` (
  `id` bigint(20) NOT NULL,
  `nombre_habilidad` varchar(255) DEFAULT NULL,
  `porcentaje_habilidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `habilidad`
--

INSERT INTO `habilidad` (`id`, `nombre_habilidad`, `porcentaje_habilidad`) VALUES
(1, 'HTML5', 85),
(2, 'CSS3', 45),
(3, 'PHOTOSHOP', 50),
(4, 'ANGULAR JS', 55),
(5, 'JAVASCRIPT', 80),
(6, 'MYSQL', 40),
(7, 'C# .NET', 40),
(8, 'PROACTIVIDAD', 75),
(9, 'LIDERAZGO', 80),
(10, 'RESPONSABILIDAD', 90),
(11, 'ASERTIVIDAD', 60),
(12, 'RESOLUCIÓN DE PROBLEMAS', 75);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(25);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` bigint(20) NOT NULL,
  `acerca_de` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `url_perfil` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `acerca_de`, `nombre`, `titulo`, `url_perfil`) VALUES
(1, 'Me fascina el BackEnd, por ello busco crecer constantemente y capacitarme para obtener un rendimiento eficiente en el mundo IT.', 'Liza Valdez', 'Full Stack Developer Jr.', 'https://i.ibb.co/3hy8g8R/perfil.png');

-- --------------------------------------------------------

--
-- Table structure for table `proyecto`
--

CREATE TABLE `proyecto` (
  `id` bigint(20) NOT NULL,
  `nombre_proyecto` varchar(255) DEFAULT NULL,
  `url_proyecto` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyecto`
--

INSERT INTO `proyecto` (`id`, `nombre_proyecto`, `url_proyecto`) VALUES
(1, 'PORTFOLIO', 'https://i.ibb.co/4sVvSN3/portfolio.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `rol`
--

CREATE TABLE `rol` (
  `id` bigint(20) NOT NULL,
  `rol_nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rol`
--

INSERT INTO `rol` (`id`, `rol_nombre`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nombre_usuario` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `password`, `nombre_usuario`) VALUES
(1, 'admin', '$2a$10$Zz2kqnRs6AVuetOyXnkK1.LHT5Yb5oB2KSwhFyjv6nLWE60.j7EGi', 'admin'),
(2, 'user', '$2a$10$IldGyM/d.5l1R3nZ/80bze0ZTqs71yKdEqq2oW1aKDEiGmW/hwKWO', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `usuario_rol`
--

CREATE TABLE `usuario_rol` (
  `usuario_id` bigint(20) NOT NULL,
  `rol_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario_rol`
--

INSERT INTO `usuario_rol` (`usuario_id`, `rol_id`) VALUES
(1, 1),
(1, 2),
(2, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `banner`
--
ALTER TABLE `banner`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `habilidad`
--
ALTER TABLE `habilidad`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_e6g9bvq68pvpfwrbis5kcugwv` (`rol_nombre`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_cto7dkti4t38iq8r4cqesbd8k` (`nombre`),
  ADD UNIQUE KEY `UK_puhr3k3l7bj71hb7hk7ktpxn0` (`nombre_usuario`);

--
-- Indexes for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD PRIMARY KEY (`usuario_id`,`rol_id`),
  ADD KEY `FK610kvhkwcqk2pxeewur4l7bd1` (`rol_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rol`
--
ALTER TABLE `rol`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK610kvhkwcqk2pxeewur4l7bd1` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`),
  ADD CONSTRAINT `FKbyfgloj439r9wr9smrms9u33r` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
