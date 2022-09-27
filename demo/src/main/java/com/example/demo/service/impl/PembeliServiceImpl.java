package com.example.demo.service.impl;

import com.example.demo.entity.Pembeli;
import com.example.demo.repository.PembeliRepository;
import com.example.demo.service.Pembelian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class PembeliServiceImpl implements Pembelian {

    @Autowired
    private PembeliRepository repository;

    @Override
    public Pembeli save(Pembeli param){
        return repository.save(param);
    }

    @Override
    public List<Pembeli>findAllData(){
        return repository.findAll();
    }

    @Override
    public Pembeli update(Pembeli param, Long id){
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNama_pembeli(param.getNama_pembeli() == null ? data.getNama_pembeli() : param.getNama_pembeli());
            data.setJk(param.getJk() != null ? param.getJk() : data.getJk());;
            data.setNo_telp(param.getNo_telp() != null ? param.getNo_telp() : data.getNo_telp());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            return repository.save(data);
        }
        return data;
    }

    @Override
    public Boolean delete(Long id){
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }
        return false;
    }

    @Override
    public Pembeli findById(Long id){
        return repository.findById(id).orElse(null);
    }
}

