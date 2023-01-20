-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Erstellungszeit: 19. Jan 2023 um 19:04
-- Server-Version: 10.8.3-MariaDB-1:10.8.3+maria~jammy
-- PHP-Version: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `furnitures`
--
DROP DATABASE IF EXISTS `furnitures`;
CREATE DATABASE IF NOT EXISTS `furnitures` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `furnitures`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `furniture`
--

DROP TABLE IF EXISTS `furniture`;
CREATE TABLE `furniture` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `furniture`
--

INSERT INTO `furniture` (`id`) VALUES
(1),
(2);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `furniture`
--
ALTER TABLE `furniture`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `furniture`
--
ALTER TABLE `furniture`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
