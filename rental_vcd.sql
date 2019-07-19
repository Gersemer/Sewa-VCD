-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2019 at 06:16 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rental_vcd`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_peminjam`
--

CREATE TABLE IF NOT EXISTS `data_peminjam` (
  `nik` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(25) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `pekerjaan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_peminjam`
--

INSERT INTO `data_peminjam` (`nik`, `nama`, `jenis_kelamin`, `alamat`, `pekerjaan`) VALUES
('1234', 'Alfin', 'L', 'sukoharjo', 'mahasiswa'),
('1235', 'lala', 'P', 'sukoharjo', 'mahasiswa'),
('1236', 'Asahi', 'P', 'solo', 'mahasiswa');

-- --------------------------------------------------------

--
-- Table structure for table `data_vcd`
--

CREATE TABLE IF NOT EXISTS `data_vcd` (
  `no_vcd` varchar(5) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `kategori` varchar(25) NOT NULL,
  `jumlah` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_vcd`
--

INSERT INTO `data_vcd` (`no_vcd`, `judul`, `kategori`, `jumlah`) VALUES
('vcd01', 'Ortega', 'Action', 2),
('vcd02', 'Thor', 'Action', 5),
('vcd03', 'Insidious', 'Horor', 5),
('vcd04', 'Terlalu jelek cuy', 'Comedy', 1),
('vcd05', 'Battle Mauru', 'Action', 4);

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE IF NOT EXISTS `pengembalian` (
  `nik` varchar(20) NOT NULL,
  `no_vcd` varchar(5) NOT NULL,
  `sdh_kembali` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`nik`, `no_vcd`, `sdh_kembali`) VALUES
('1234', 'vcd02', 'Belum'),
('1235', 'vcd03', 'Sudah');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `nik` varchar(20) NOT NULL,
  `no_vcd` varchar(5) NOT NULL,
  `tgl_pinjam` varchar(25) NOT NULL,
  `tgl_kembali` varchar(25) NOT NULL,
  `jumlah_vcd` int(11) NOT NULL,
  `total_harga` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`nik`, `no_vcd`, `tgl_pinjam`, `tgl_kembali`, `jumlah_vcd`, `total_harga`) VALUES
('lala', 'vcd01', '12-01-2019', '13-01-2019', 2, 6000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(3) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `level` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `level`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'user', 'user', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_peminjam`
--
ALTER TABLE `data_peminjam`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `data_vcd`
--
ALTER TABLE `data_vcd`
  ADD PRIMARY KEY (`no_vcd`);

--
-- Indexes for table `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`nik`), ADD KEY `no_vcd` (`no_vcd`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`nik`), ADD KEY `no_vcd` (`no_vcd`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pengembalian`
--
ALTER TABLE `pengembalian`
ADD CONSTRAINT `pengembalian_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `data_peminjam` (`nik`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`no_vcd`) REFERENCES `data_vcd` (`no_vcd`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
