package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table( name = "pembeli")
@Getter
@Setter
public class Pembeli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nama_pembeli;

    @Column
    private String jk;

    @Column
    private String no_telp;

    @Column
    private String alamat;

}
