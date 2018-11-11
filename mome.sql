-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Gen 29, 2018 alle 08:51
-- Versione del server: 5.6.15-log
-- PHP Version: 5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mome`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `contatori`
--

CREATE TABLE IF NOT EXISTS `contatori` (
  `ip_address` varchar(30) NOT NULL,
  `utente` int(11) NOT NULL,
  `ultima_rilevazione` int(11) NOT NULL,
  PRIMARY KEY (`ip_address`),
  KEY `contatore` (`utente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dump dei dati per la tabella `contatori`
--

INSERT INTO `contatori` (`ip_address`, `utente`, `ultima_rilevazione`) VALUES
('192.168.0.1', 1, 0),
('192.168.0.2', 2, 0);

-- --------------------------------------------------------

--
-- Struttura della tabella `registrazioni`
--

CREATE TABLE IF NOT EXISTS `registrazioni` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `contatore_ip` varchar(30) NOT NULL,
  `data` datetime NOT NULL,
  `consumo` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `contatore_ip` (`contatore_ip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE IF NOT EXISTS `utenti` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` text NOT NULL,
  `cognome` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dump dei dati per la tabella `utenti`
--

INSERT INTO `utenti` (`id`, `nome`, `cognome`) VALUES
(1, 'Saverio', 'Morelli'),
(2, 'Sara', 'Papapietro');

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `contatori`
--
ALTER TABLE `contatori`
  ADD CONSTRAINT `contatori_ibfk_1` FOREIGN KEY (`utente`) REFERENCES `utenti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limiti per la tabella `registrazioni`
--
ALTER TABLE `registrazioni`
  ADD CONSTRAINT `registrazioni_ibfk_1` FOREIGN KEY (`contatore_ip`) REFERENCES `contatori` (`ip_address`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
