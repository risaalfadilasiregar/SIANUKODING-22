package com.example.demo.service;

import com.example.demo.entity.Supplier;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.List;

public interface SupplierService {
    Supplier save(Supplier param);

    List<Supplier> findAllData();

    Supplier update (Supplier param, Long id);

    Boolean delete(Long id);

    Supplier findById(Long id);
}
