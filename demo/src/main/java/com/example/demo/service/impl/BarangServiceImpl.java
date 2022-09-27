package com.example.demo.service.impl;

import com.example.demo.entity.Barang;
import com.example.demo.repository.BarangRepository;
import com.example.demo.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class BarangServiceImpl implements BarangService {
    @Autowired
    private BarangRepository repository;

    @Override
    public Barang save(Barang param){
        return repository.save(param);
    }

    @Override
    public List<Barang> findAllData(){
        return repository.findAll();
    }

    @Override
    public Barang update(Barang param, Long id){
        Barang data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNama_barang(param.getNama_barang() == null ? param.getNama_barang(): param.getNama_barang());
            data.setHarga_barang(param.getHarga_barang() != null ? data.getHarga_barang() : data.getHarga_barang());
            data.setStok(param.getStok() != null ? param.getStok() : data.getStok());
            data.setId_supplier(param.getId_supplier() != null ? param.getId_supplier() : param.getId_supplier());

            return repository.save(data);
        }
        return data;
    }

    @Override
    public Boolean delete(Long id){
        Barang data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }
        return false;
    }

    @Override
    public Barang findById(Long id){
        return repository.findById(id).orElse(null);
    }
}
