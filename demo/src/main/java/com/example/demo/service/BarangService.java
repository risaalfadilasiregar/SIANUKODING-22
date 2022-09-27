package com.example.demo.service;

import com.example.demo.entity.Barang;

import java.util.List;

public interface BarangService {
    Barang save(Barang param);

    List<Barang>findAllData();

    Barang update (Barang param , Long id);

    Boolean delete(Long id);

    Barang findById(Long id);
}
