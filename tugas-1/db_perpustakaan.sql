-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Sep 2022 pada 10.51
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_anggota`
--

CREATE TABLE `tb_anggota` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `jenis_kelamin` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `telp` varchar(255) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_buku`
--

CREATE TABLE `tb_buku` (
  `id` int(11) NOT NULL,
  `judul` varchar(255) DEFAULT NULL,
  `tahun_terbit` varchar(255) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `isbn` varchar(255) DEFAULT NULL,
  `pengarang_id` int(11) DEFAULT NULL,
  `penerbit_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjaman`
--

CREATE TABLE `tb_peminjaman` (
  `id` int(11) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `anggota_id` int(11) DEFAULT NULL,
  `petugas_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjamdetail`
--

CREATE TABLE `tb_peminjamdetail` (
  `peminjam_id` int(11) DEFAULT NULL,
  `buku_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_penerbit`
--

CREATE TABLE `tb_penerbit` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `telp` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pengarang`
--

CREATE TABLE `tb_pengarang` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `telp` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pengembalian`
--

CREATE TABLE `tb_pengembalian` (
  `id` int(11) NOT NULL,
  `tgl_pengembalian` varchar(255) DEFAULT NULL,
  `denda` double DEFAULT NULL,
  `peminjaman_id` int(11) DEFAULT NULL,
  `anggota_id` int(11) DEFAULT NULL,
  `petugas_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_pengembaliandetail`
--

CREATE TABLE `tb_pengembaliandetail` (
  `pengembalian_id` int(11) DEFAULT NULL,
  `buku_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_petugas`
--

CREATE TABLE `tb_petugas` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `telp` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_anggota`
--
ALTER TABLE `tb_anggota`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_user` (`id_user`);

--
-- Indeks untuk tabel `tb_buku`
--
ALTER TABLE `tb_buku`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_pengarang` (`pengarang_id`),
  ADD KEY `fk_penerbit` (`penerbit_id`);

--
-- Indeks untuk tabel `tb_peminjaman`
--
ALTER TABLE `tb_peminjaman`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_anggota` (`anggota_id`),
  ADD KEY `fk_pengurus` (`petugas_id`);

--
-- Indeks untuk tabel `tb_peminjamdetail`
--
ALTER TABLE `tb_peminjamdetail`
  ADD KEY `fk_peminjam3` (`peminjam_id`),
  ADD KEY `fk_buku` (`buku_id`);

--
-- Indeks untuk tabel `tb_penerbit`
--
ALTER TABLE `tb_penerbit`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tb_pengarang`
--
ALTER TABLE `tb_pengarang`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `tb_pengembalian`
--
ALTER TABLE `tb_pengembalian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_peminjam` (`peminjaman_id`),
  ADD KEY `fk_anggota2` (`anggota_id`),
  ADD KEY `fk_pengurus2` (`petugas_id`);

--
-- Indeks untuk tabel `tb_pengembaliandetail`
--
ALTER TABLE `tb_pengembaliandetail`
  ADD KEY `fk_pengembalian2` (`pengembalian_id`),
  ADD KEY `fk_buku2` (`buku_id`);

--
-- Indeks untuk tabel `tb_petugas`
--
ALTER TABLE `tb_petugas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_user1` (`user_id`);

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tb_anggota`
--
ALTER TABLE `tb_anggota`
  ADD CONSTRAINT `fk_user` FOREIGN KEY (`id_user`) REFERENCES `tb_user` (`id_user`);

--
-- Ketidakleluasaan untuk tabel `tb_buku`
--
ALTER TABLE `tb_buku`
  ADD CONSTRAINT `fk_penerbit` FOREIGN KEY (`penerbit_id`) REFERENCES `tb_pengarang` (`id`),
  ADD CONSTRAINT `fk_pengarang` FOREIGN KEY (`pengarang_id`) REFERENCES `tb_pengarang` (`id`);

--
-- Ketidakleluasaan untuk tabel `tb_peminjaman`
--
ALTER TABLE `tb_peminjaman`
  ADD CONSTRAINT `fk_anggota` FOREIGN KEY (`anggota_id`) REFERENCES `tb_anggota` (`id`),
  ADD CONSTRAINT `fk_pengurus` FOREIGN KEY (`petugas_id`) REFERENCES `tb_petugas` (`id`);

--
-- Ketidakleluasaan untuk tabel `tb_peminjamdetail`
--
ALTER TABLE `tb_peminjamdetail`
  ADD CONSTRAINT `fk_buku` FOREIGN KEY (`buku_id`) REFERENCES `tb_buku` (`id`),
  ADD CONSTRAINT `fk_peminjam3` FOREIGN KEY (`peminjam_id`) REFERENCES `tb_peminjaman` (`id`);

--
-- Ketidakleluasaan untuk tabel `tb_pengembalian`
--
ALTER TABLE `tb_pengembalian`
  ADD CONSTRAINT `fk_anggota2` FOREIGN KEY (`anggota_id`) REFERENCES `tb_anggota` (`id`),
  ADD CONSTRAINT `fk_peminjam` FOREIGN KEY (`peminjaman_id`) REFERENCES `tb_peminjaman` (`id`),
  ADD CONSTRAINT `fk_pengurus2` FOREIGN KEY (`petugas_id`) REFERENCES `tb_petugas` (`id`);

--
-- Ketidakleluasaan untuk tabel `tb_pengembaliandetail`
--
ALTER TABLE `tb_pengembaliandetail`
  ADD CONSTRAINT `fk_buku2` FOREIGN KEY (`buku_id`) REFERENCES `tb_buku` (`id`),
  ADD CONSTRAINT `fk_pengembalian2` FOREIGN KEY (`pengembalian_id`) REFERENCES `tb_pengembalian` (`id`);

--
-- Ketidakleluasaan untuk tabel `tb_petugas`
--
ALTER TABLE `tb_petugas`
  ADD CONSTRAINT `fk_user1` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
