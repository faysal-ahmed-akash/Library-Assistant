-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2020 at 03:54 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `libraryassistant`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_table`
--

CREATE TABLE `admin_table` (
  `AdminId` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_table`
--

INSERT INTO `admin_table` (`AdminId`, `name`, `password`, `phone`, `address`, `email`) VALUES
('1', 'Akash', '12345', '000111000111', 'Dhaka', 'a.faysal@aol.com');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `BookId` varchar(50) NOT NULL,
  `ISBN` int(50) NOT NULL,
  `BookName` varchar(50) NOT NULL,
  `BookPublisher` varchar(50) NOT NULL,
  `BookEdition` varchar(50) NOT NULL,
  `Stock` int(50) NOT NULL,
  `Issued` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`BookId`, `ISBN`, `BookName`, `BookPublisher`, `BookEdition`, `Stock`, `Issued`) VALUES
('727', 25, 'Math', 'ABC', '2nd', 19, 1),
('921', 10, 'Physics', 'ABC', '1st', 10, 0);

-- --------------------------------------------------------

--
-- Table structure for table `issue_book`
--

CREATE TABLE `issue_book` (
  `IssueId` varchar(50) NOT NULL,
  `BookId` varchar(50) NOT NULL,
  `MemberId` varchar(50) NOT NULL,
  `IssuedDate` varchar(50) NOT NULL,
  `ExpiryDate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issue_book`
--

INSERT INTO `issue_book` (`IssueId`, `BookId`, `MemberId`, `IssuedDate`, `ExpiryDate`) VALUES
('414', '727', '25', '2020-11-10', '2020-11-12');

-- --------------------------------------------------------

--
-- Table structure for table `librarian`
--

CREATE TABLE `librarian` (
  `LibrarianId` varchar(50) NOT NULL,
  `LibrarianName` varchar(50) NOT NULL,
  `LibrarianPassword` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `LibrarianAddress` varchar(50) NOT NULL,
  `LibrarianContact` varchar(50) NOT NULL,
  `AdminId` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `librarian`
--

INSERT INTO `librarian` (`LibrarianId`, `LibrarianName`, `LibrarianPassword`, `Email`, `LibrarianAddress`, `LibrarianContact`, `AdminId`) VALUES
('31', 'Akash', '12345', 'a.faysal@aol.com', 'Dhaka', '015464623846', '1'),
('924', 'Faysal', '23456', 'f.ahmedakash@outlook.com', 'Dhaka', '26416541846', '1');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `MemberId` varchar(50) NOT NULL,
  `MemberName` varchar(50) NOT NULL,
  `MemberPassword` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `MemberAddress` varchar(50) NOT NULL,
  `MemberContact` varchar(50) NOT NULL,
  `Rating` varchar(50) NOT NULL,
  `LibrarianId` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`MemberId`, `MemberName`, `MemberPassword`, `Email`, `MemberAddress`, `MemberContact`, `Rating`, `LibrarianId`) VALUES
('25', 'Akash', '12345', 'a.faysal@aol.com', 'Dhaka', '0651565165', '10', '31'),
('362', 'Faysal', '23456', 'f.ahmedakash@outlook.com', 'Dhaka', '06586565498', '10', '924');

-- --------------------------------------------------------

--
-- Table structure for table `return_book`
--

CREATE TABLE `return_book` (
  `ReturnId` varchar(50) NOT NULL,
  `BookId` varchar(50) NOT NULL,
  `MemberId` varchar(50) NOT NULL,
  `ReturnDate` varchar(50) NOT NULL,
  `RatingModification` double NOT NULL,
  `Fine` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `return_book`
--

INSERT INTO `return_book` (`ReturnId`, `BookId`, `MemberId`, `ReturnDate`, `RatingModification`, `Fine`) VALUES
('319', '727', '25', '2020-11-20', -0.1, 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_table`
--
ALTER TABLE `admin_table`
  ADD PRIMARY KEY (`AdminId`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`BookId`);

--
-- Indexes for table `issue_book`
--
ALTER TABLE `issue_book`
  ADD PRIMARY KEY (`IssueId`);

--
-- Indexes for table `librarian`
--
ALTER TABLE `librarian`
  ADD PRIMARY KEY (`LibrarianId`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`MemberId`);

--
-- Indexes for table `return_book`
--
ALTER TABLE `return_book`
  ADD PRIMARY KEY (`ReturnId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
