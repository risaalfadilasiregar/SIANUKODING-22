package com.example.demo.service.impl;

import com.example.demo.entity.Supplier;
import com.example.demo.repository.SupplierRepository;
import com.example.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository repository;

    @Override
    public Supplier save(Supplier param){
        return repository.save(param);
    }

    @Override
    public List<Supplier> findAllData(){
        return repository.findAll();
    }

    @Override
    public Supplier update(Supplier param, Long id){
        Supplier data = repository.findById(id).orElse(null);

        if (data != null){
            data.setNama_supplier(param.getNama_supplier()==null ? data.getNama_supplier():param.getNama_supplier());
            data.setNo_telp(param.getNo_telp()==null ? data.getNo_telp():param.getNo_telp());
            data.setAlamat(param.getAlamat()==null ? data.getAlamat() : param.getAlamat());

            return repository.save(data);
        }
        return data;
    }

    @Override
    public Boolean delete(Long id){
        Supplier data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }
        return false;
    }

    @Override
    public Supplier findById(Long id){
        return repository.findById(id).orElse(null);
    }

}
