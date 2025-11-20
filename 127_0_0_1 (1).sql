-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-11-2025 a las 20:34:50
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--
CREATE DATABASE IF NOT EXISTS `inventario` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `inventario`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--
-- Creación: 08-11-2025 a las 21:06:00
--

CREATE TABLE `categorias` (
  `idCategoria` int(11) NOT NULL,
  `categoria` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`idCategoria`, `categoria`) VALUES
(2, 'Kodomo'),
(3, 'Shonen'),
(4, 'Shojo'),
(7, 'Seinen'),
(8, 'Josei');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--
-- Creación: 08-11-2025 a las 21:02:33
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `documento` varchar(12) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nombre`, `apellido`, `documento`, `direccion`, `telefono`, `correo`) VALUES
(1, 'Yorllina', 'Oropeza', '13728576', 'Los Picachos', '04143170824', 'yorllina@gmail.com'),
(2, 'Elijain', 'Torres', '11585584', 'Club de Campo', '04141267401', 'torres@yahoo.com'),
(3, 'Nadiaa', 'Nori', '6578322', 'Los Teques', '04142298412', 'nadiaaa@nadia.com'),
(4, 'Pablo', 'Oropeza', '3587254', 'Los Alpes', '12345678', 'pablo@alla.com'),
(7, 'Pablo', 'Remo', '15723783', 'Los Teques', '123456', 'xxxxxxxx');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallesalida`
--
-- Creación: 15-11-2025 a las 14:31:54
--

CREATE TABLE `detallesalida` (
  `id` int(11) NOT NULL,
  `idSalida` int(11) NOT NULL,
  `idEntrada` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `importe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallesalida`
--

INSERT INTO `detallesalida` (`id`, `idSalida`, `idEntrada`, `cantidad`, `importe`) VALUES
(1, 1, 1, 2, 40),
(2, 1, 1, 2, 40),
(3, 1, 2, 1, 12),
(4, 1, 5, 4, 48),
(5, 1, 2, 1, 12),
(6, 1, 5, 4, 48),
(7, 1, 1, 2, 40),
(8, 1, 1, 1, 20),
(9, 1, 2, 2, 16),
(10, 1, 2, 2, 16),
(11, 1, 5, 2, 4),
(12, 1, 5, 2, 4),
(13, 1, 1, 1, 20),
(14, 1, 1, 1, 20),
(15, 1, 5, 1, 16),
(16, 1, 4, 2, 24),
(17, 1, 4, 8, 96);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--
-- Creación: 16-11-2025 a las 02:01:09
--

CREATE TABLE `entrada` (
  `identrada` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idproveedor` int(11) NOT NULL,
  `precioEntrada` decimal(10,2) NOT NULL,
  `precioVenta` decimal(10,2) NOT NULL,
  `total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `entrada`
--

INSERT INTO `entrada` (`identrada`, `idproducto`, `stock`, `idCategoria`, `fecha`, `idproveedor`, `precioEntrada`, `precioVenta`, `total`) VALUES
(1, 1, 10, 3, '2025-11-15', 1, 18.00, 20.00, 180.00),
(2, 2, 5, 2, '2025-11-15', 3, 5.00, 8.00, 25.00),
(4, 3, 12, 2, '2025-11-16', 1, 16.00, 20.00, 192.00),
(5, 4, 10, 4, '2025-11-16', 2, 10.00, 12.00, 100.00),
(9, 3, 2, 2, '2025-11-16', 1, 18.00, 20.00, 36.00),
(14, 5, 12, 3, '2025-11-18', 3, 12.00, 16.00, 144.00),
(16, 7, 10, 4, '2025-11-18', 1, 10.00, 12.00, 100.00),
(17, 1, 1, 3, '2025-11-16', 2, 18.00, 20.00, 18.00),
(18, 1, 1, 3, '2025-11-16', 2, 18.00, 20.00, 18.00),
(19, 8, 10, 4, '2025-11-17', 1, 10.00, 12.00, 100.00),
(20, 4, 10, 3, '2025-11-16', 2, 10.00, 12.00, 100.00),
(21, 9, 12, 7, '2025-11-19', 1, 8.00, 12.00, 96.00),
(22, 2, 10, 7, '2025-11-18', 2, 5.00, 8.00, 50.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--
-- Creación: 17-11-2025 a las 03:57:54
--

CREATE TABLE `productos` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `stock` int(11) NOT NULL,
  `idcategoria` int(11) NOT NULL,
  `precioV` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idproducto`, `nombre`, `stock`, `idcategoria`, `precioV`) VALUES
(1, 'One Piece', 11, 3, 20.00),
(2, 'Camila', 15, 2, 8.00),
(3, 'Pokemon', 14, 2, 20.00),
(4, 'Sailor Moon', 10, 4, 12.00),
(5, 'Death Note', 11, 3, 16.00),
(6, 'Nara', 0, 7, 12.00),
(7, 'Amarantha', 10, 4, 12.00),
(8, 'Sofia', 10, 4, 12.00),
(9, 'Dragon Ball', 12, 7, 12.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--
-- Creación: 13-11-2025 a las 14:22:58
--

CREATE TABLE `proveedor` (
  `idproveedor` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `documento` varchar(12) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(11) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idproveedor`, `nombre`, `documento`, `direccion`, `telefono`, `correo`) VALUES
(1, 'TecniCiencia', '32174418', 'C.C. Ciudad Comercial Tamanaco Nivel C-2. Av. Ernesto Blohm ', '02123238412', 'tecni@ciiencia.com'),
(2, 'Planeta', 'J123456', 'Sambil Chacao', '04123238813', 'Planeta@proveedor.'),
(3, 'Mangas', 'J6382272', 'Caracas - El Rosal', '0212325727', '000000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas`
--
-- Creación: 15-11-2025 a las 15:24:02
--

CREATE TABLE `salidas` (
  `idSalidas` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `salidas`
--

INSERT INTO `salidas` (`idSalidas`, `idCliente`, `fecha`, `total`) VALUES
(1, 1, '2025-11-25', 40.00),
(2, 1, '2025-11-13', 20.00),
(15, 7, '2025-11-16', 4.00),
(16, 2, '2025-11-16', 4.00),
(17, 1, '2025-11-16', 20.00),
(18, 1, '2025-11-16', 20.00),
(19, 1, '2025-11-18', 16.00),
(20, 1, '2025-11-18', 24.00),
(21, 1, '2025-11-18', 96.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--
-- Creación: 08-11-2025 a las 21:06:51
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `documento` varchar(12) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `tipoUsuario` varchar(20) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `pass` varbinary(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombre`, `apellido`, `documento`, `direccion`, `telefono`, `correo`, `tipoUsuario`, `usuario`, `pass`) VALUES
(1, 'Eliana', 'Torres', '32174418', 'Urbanizacion Santa Maria', '04242225525', 'torreseliana2808@gmail.com', 'Adminstrador ', 'Elit', 0x11784b3edba0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `detallesalida`
--
ALTER TABLE `detallesalida`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_salida` (`idSalida`),
  ADD KEY `fk_entradas` (`idEntrada`);

--
-- Indices de la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`identrada`),
  ADD KEY `fk_proveedor` (`idproveedor`),
  ADD KEY `fk_categoria` (`idCategoria`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idproveedor`),
  ADD UNIQUE KEY `documento_UNIQUE` (`documento`);

--
-- Indices de la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD PRIMARY KEY (`idSalidas`),
  ADD KEY `fk_cliente` (`idCliente`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `detallesalida`
--
ALTER TABLE `detallesalida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `entrada`
--
ALTER TABLE `entrada`
  MODIFY `identrada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idproveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `salidas`
--
ALTER TABLE `salidas`
  MODIFY `idSalidas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallesalida`
--
ALTER TABLE `detallesalida`
  ADD CONSTRAINT `fk_entradas` FOREIGN KEY (`idEntrada`) REFERENCES `entrada` (`identrada`),
  ADD CONSTRAINT `fk_salida` FOREIGN KEY (`idSalida`) REFERENCES `salidas` (`idSalidas`);

--
-- Filtros para la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `fk_categoria` FOREIGN KEY (`idCategoria`) REFERENCES `categorias` (`idCategoria`),
  ADD CONSTRAINT `fk_proveedor` FOREIGN KEY (`idproveedor`) REFERENCES `proveedor` (`idproveedor`);

--
-- Filtros para la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
