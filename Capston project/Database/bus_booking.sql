-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 16, 2023 at 01:17 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus_booking`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_bus`
--

CREATE TABLE `add_bus` (
  `id` int(60) NOT NULL,
  `driver_name` varchar(60) NOT NULL,
  `phone` varchar(44) NOT NULL,
  `bus_name` varchar(44) NOT NULL,
  `bus_number` varchar(44) NOT NULL,
  `bus_type` varchar(44) NOT NULL,
  `date` varchar(44) NOT NULL,
  `original_seat` varchar(60) NOT NULL,
  `available_seat` varchar(60) NOT NULL,
  `booked_seat` varchar(44) NOT NULL,
  `price` varchar(44) NOT NULL,
  `source` varchar(44) NOT NULL,
  `destination` varchar(44) NOT NULL,
  `atime` varchar(44) NOT NULL,
  `dtime` varchar(44) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `add_bus`
--

INSERT INTO `add_bus` (`id`, `driver_name`, `phone`, `bus_name`, `bus_number`, `bus_type`, `date`, `original_seat`, `available_seat`, `booked_seat`, `price`, `source`, `destination`, `atime`, `dtime`) VALUES
(21, 'Kumaran', '8789546510', 'Volvo', '2', 'Non AC', '08/10/2023', '55', '50', '0', '600', 'Madurai', 'Trivarur', '8:00am', '4:00pm'),
(22, 'Rajiv', '678767897', 'Tata Magic', '1', 'AC', '12/10/2023', '70', '68', '2', '700', 'Cochin', 'Chennai', '5:00pm', '12:00am'),
(20, 'Subramani', '9876543210', 'Mahindra', '3', 'AC', '03-10-2023', '60', '50', '0', '700', 'Chennai', 'Bangalore', '5:00pm', '12:00am'),
(25, 'Nehru harsha', '9876543210', 'Mahindra', '3', 'AC', '25/10/2023', '50', '50', '0', '600', 'Kerala', 'Cochin', '5:00pm', '8:00pm');

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(22) NOT NULL,
  `password` varchar(22) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id` int(11) NOT NULL,
  `username` varchar(60) NOT NULL,
  `userid` varchar(66) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `bus_number` varchar(60) NOT NULL,
  `date` varchar(100) NOT NULL,
  `source` varchar(60) NOT NULL,
  `destination` varchar(60) NOT NULL,
  `seats` varchar(100) NOT NULL,
  `amount` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `id` int(55) NOT NULL,
  `no` varchar(60) NOT NULL,
  `busname` varchar(60) NOT NULL,
  `model` varchar(100) NOT NULL,
  `reg` varchar(60) NOT NULL,
  `type` varchar(60) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`id`, `no`, `busname`, `model`, `reg`, `type`) VALUES
(4, '3', 'Mahindra', 'R65', 'TN56 VW 9890', 'AC'),
(5, '2', 'Volvo', 'S7', 'TN49 BW3456', 'Non AC'),
(6, '1', 'Tata Magic', 'C5', 'TN58 AZ8767', 'AC');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `id` int(60) NOT NULL,
  `username` varchar(33) NOT NULL,
  `user_id` varchar(60) NOT NULL,
  `amount` varchar(33) NOT NULL,
  `bank` varchar(33) NOT NULL,
  `account` varchar(33) NOT NULL,
  `card` varchar(33) NOT NULL,
  `booking_status` varchar(44) NOT NULL,
  `payment_status` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `staff_details`
--

CREATE TABLE `staff_details` (
  `staff_id` int(55) NOT NULL,
  `staffname` varchar(55) NOT NULL,
  `gender` varchar(55) NOT NULL,
  `phone` varchar(55) NOT NULL,
  `address` varchar(55) NOT NULL,
  `qualification` varchar(55) NOT NULL,
  `username` varchar(55) NOT NULL,
  `email` varchar(55) NOT NULL,
  `password` varchar(55) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff_details`
--

INSERT INTO `staff_details` (`staff_id`, `staffname`, `gender`, `phone`, `address`, `qualification`, `username`, `email`, `password`) VALUES
(2, 'riya', 'female', '7678909878', 'Nethaji Street', '12', 'riya', 'riya@gmail.com', 'riya'),
(5, 'Priya', 'female', '08757544313', 'Tamil nadu', 'BSc', 'priya', 'priya@gmail.com', 'priya123');

-- --------------------------------------------------------

--
-- Table structure for table `user_register`
--

CREATE TABLE `user_register` (
  `id` int(60) NOT NULL,
  `name` varchar(60) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `phone` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_register`
--

INSERT INTO `user_register` (`id`, `name`, `username`, `password`, `phone`) VALUES
(18, 'divya', 'divya', '123', '9876543210'),
(19, 'kaviya', 'kaviya', '123', '9878990867'),
(20, 'Mohan', 'mohan', '123', '7867666667'),
(21, 'Raja', 'raja', '123', '978787879');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_bus`
--
ALTER TABLE `add_bus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `staff_details`
--
ALTER TABLE `staff_details`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `user_register`
--
ALTER TABLE `user_register`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_bus`
--
ALTER TABLE `add_bus`
  MODIFY `id` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `bus`
--
ALTER TABLE `bus`
  MODIFY `id` int(55) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `id` int(60) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `staff_details`
--
ALTER TABLE `staff_details`
  MODIFY `staff_id` int(55) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user_register`
--
ALTER TABLE `user_register`
  MODIFY `id` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
