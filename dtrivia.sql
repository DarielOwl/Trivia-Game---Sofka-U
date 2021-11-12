-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2021 a las 19:04:24
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dtrivia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombreCategoria` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nombreCategoria`) VALUES
(1, 'Historia'),
(2, 'Geografia'),
(3, 'Arte'),
(4, 'Ciencia'),
(5, 'Entretenimiento');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `idJugador` int(11) NOT NULL,
  `nombreJugador` varchar(255) NOT NULL,
  `premio` int(11) NOT NULL,
  `ronda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`idJugador`, `nombreJugador`, `premio`, `ronda`) VALUES
(1, 'Dariel', 10000000, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `pregunta` varchar(255) NOT NULL,
  `dificultad` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id`, `idCategoria`, `pregunta`, `dificultad`) VALUES
(5, 3, '¿Cuál es el libro más vendido de la historia?', 'Facil'),
(6, 1, '¿Qué suceso marca el final de la Edad Antigua y el inicio de la Edad Media?', 'Medio'),
(11, 3, '¿En qué museo está la Mona Lisa?', 'Medio'),
(12, 1, '¿Qué filósofo creó “El mito de la caverna\'\'?', 'Dificil'),
(13, 3, '¿En qué siglo se inició el Renacimiento?', 'Dificil'),
(14, 3, '¿Por qué El Principito decide abandonar su planeta? ', 'Medio'),
(15, 3, '¿Quien fue Elvis Presley? ', 'Facil'),
(16, 1, '¿Cuál fue el primer país en aprobar el sufragio femenino?', 'Dificil'),
(17, 1, '¿Qué civilización prehispánica adoró al dios Kukulkán?', 'Medio'),
(18, 1, '¿Qué esposas de Enrique VIII fueron decapitadas?', 'Facil'),
(19, 4, '¿Cuál de los cinco sentidos se desarrolla primero?', 'Facil'),
(20, 4, '¿Cuántos corazones tiene un gusano de tierra?', 'Dificil'),
(21, 4, ' Si 50 es el 100%, ¿cuánto es el 90%?', 'Medio'),
(22, 4, '¿Qué elemento está presente en absolutamente todas las moléculas orgánicas?', 'Medio'),
(23, 4, '¿Cuántos elementos tiene la tabla periódica?', 'Facil'),
(24, 5, '¿Cuál es el segundo nombre de Chandler en la comedia Friends?', 'Facil'),
(25, 5, '¿Qué película de James Cameron se convirtió en la película más taquillera de su tiempo?', 'Medio'),
(26, 5, '¿Quién es la primera mujer de color en ganar el Oscar a la mejor actriz?', 'Dificil'),
(27, 5, '¿Cuál fue la primera película animada de largometraje que se lanzó?', 'Dificil'),
(28, 5, '¿Cuál es la película más taquillera de la historia?', 'Facil'),
(29, 2, '¿Cuál es la capital de Filipinas?', 'Facil'),
(30, 2, '¿Cuál es el río más caudaloso del mundo?', 'Facil'),
(31, 2, '¿Qué país está entre Perú y Colombia?', 'Medio'),
(32, 2, '¿En qué país se encuentra el río Po?', 'Medio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `id` int(11) NOT NULL,
  `idPregunta` int(11) NOT NULL,
  `respuestaBien` varchar(255) DEFAULT NULL,
  `respuestaMal1` varchar(255) DEFAULT NULL,
  `respuestaMal2` varchar(255) DEFAULT NULL,
  `respuestaMal3` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `respuesta`
--

INSERT INTO `respuesta` (`id`, `idPregunta`, `respuestaBien`, `respuestaMal1`, `respuestaMal2`, `respuestaMal3`) VALUES
(8, 5, 'La Biblia', 'Don Quijote', 'El Señor de los Anillos', 'El Principito'),
(9, 6, 'La Escritura', 'Surgimiento de civilizaciones', 'Revolución Francesa', 'La Gran Guerra'),
(10, 11, 'Museo del Louvre', 'Museo Nacional del Prado', 'Museo Británico', 'Museo del Vaticano'),
(11, 12, 'Platón', 'Sócrates', 'Pitágoras', 'Homero'),
(12, 13, 'Siglo XV ', 'Siglo XVI', 'Siglo XIV', 'Siglo XVII'),
(13, 14, 'Porque sentía que una rosa se aprovechaba de él', 'Porque quería conocer la tierra', 'Porque estaba enfermo', 'Porque el Rey le ordena irse'),
(14, 15, 'El Rey del Rock and Roll', 'Ingeniero en Sistemas', 'El Rey del POP', 'Doctor'),
(15, 16, 'Nueva Zelanda', 'Noruega', 'Finlandia', 'Uruguay'),
(16, 17, 'Mayas', 'Olmecas', 'Incas', 'Aztecas'),
(17, 18, 'Ana Bolena y Catherine Howard', 'Ana de Cléveris y Ana Bolena', 'Ana Bolena y Catalina de Aragón', 'Catalina de Aragón y Ana de Cléveris'),
(18, 19, 'Olfato', 'Visión', 'Tacto', 'Gusto'),
(19, 20, 'Cinco', 'Ninguno', '1', '3'),
(20, 21, '45', '40', '25', '35'),
(21, 22, 'Carbono', 'Hidrógeno', 'Oxígeno', 'Agua'),
(22, 23, '118', '125', '115', '120'),
(23, 24, 'Muriel', 'Eustace', 'Francis', 'Ross'),
(24, 25, 'Titanic', 'Avatar', 'Terminator', 'Aliens: el regreso'),
(25, 26, ' Halle Berry', 'Jeniffer Hudson', 'Viola Davis', 'Regina King'),
(26, 27, 'El Apóstol', 'Blancanieves y los siete enanitos', 'Dumbo', '¿Quién engañó a Roger Rabbit?'),
(27, 28, 'Avatar', 'Avengers End Game', 'Titanic', 'Star Wars: Episodio VII'),
(28, 29, 'Manila', 'Montevideo', 'Brasilia', 'Berlin'),
(29, 30, 'El Amazonas', 'Rio Nilo', 'Rio de la Plata', 'Oceano Pacifico'),
(30, 31, 'Ecuador', 'Paraguay', 'Uruguay', 'Venezuela'),
(31, 32, 'Italia', 'Francia', 'China', 'Rusia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ronda`
--

CREATE TABLE `ronda` (
  `id` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `puntos` int(11) NOT NULL,
  `dificultad` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ronda`
--

INSERT INTO `ronda` (`id`, `numero`, `puntos`, `dificultad`) VALUES
(3, 1, 100000, 'facil'),
(4, 2, 300000, 'facil'),
(5, 3, 500000, 'medio'),
(6, 4, 750000, 'medio'),
(7, 5, 10000000, 'dificil');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`idJugador`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idPregunta` (`idPregunta`);

--
-- Indices de la tabla `ronda`
--
ALTER TABLE `ronda`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `jugador`
--
ALTER TABLE `jugador`
  MODIFY `idJugador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `ronda`
--
ALTER TABLE `ronda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `respuesta_ibfk_1` FOREIGN KEY (`idPregunta`) REFERENCES `pregunta` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
