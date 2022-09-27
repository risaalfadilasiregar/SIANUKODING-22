package com.example.demo.service;

import com.example.demo.entity.Pembeli;

import java.util.List;

public interface Pembelian {
    Pembeli save(Pembeli param);

    List<Pembeli> findAllData();

    Pembeli update(Pembeli param, Long id);

    Boolean delete(Long id);

    Pembeli findById(Long id);
}
