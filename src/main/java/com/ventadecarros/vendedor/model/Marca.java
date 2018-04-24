/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventadecarros.vendedor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jorda
 */
@Entity
@Table (name="AUTOF_MARCA")
public class Marca {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="COD_MARCA")
    private String cod_marca;    

    @Column(name="DSC_MARCA")
    private String dsc_marca;    
    
    public Long getId() {
        return id;
    }

    public Marca() {
    }
    
    public Marca(String cod_marca) {
        this.cod_marca = cod_marca;
    }
    
    public Marca(Long id, String cod_marca, String dsc_marca) {
        this.id = id;
        this.cod_marca = cod_marca;
        this.dsc_marca = dsc_marca;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getCod_marca() {
        return cod_marca;
    }

    public void setCod_marca(String cod_marca) {
        this.cod_marca = cod_marca;
    }

    public String getDsc_marca() {
        return dsc_marca;
    }

    public void setDsc_marca(String dsc_marca) {
        this.dsc_marca = dsc_marca;
    }
    
}
