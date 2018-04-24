/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventadecarros.vendedor.service;

import com.ventadecarros.vendedor.dao.MarcaDao;
import com.ventadecarros.vendedor.model.Marca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jorda
 */
@Service
public class MarcaSeviceImp implements MarcaService {

    @Autowired
    private MarcaDao marcadao;

    @Transactional
    @Override
    public Marca agregar(Marca marca) {
        Marca marcaP = marcadao.agregar(marca);
        return marcaP;
    }

    @Transactional
    @Override
    public boolean actualizar(Long id, Marca marca) {
        return marcadao.actualizar(id, marca);
    }

    @Transactional
    @Override
    public boolean eliminarPorId(Long id) {
        return marcadao.eliminarPorId(id);
    }

    @Transactional
    @Override
    public Marca selectPorId(Long id) {
        Marca marcaP = marcadao.selectPorId(id);
        return marcaP;
    }

    @Transactional
    @Override
    public List<Marca> listarMarca() {
        return marcadao.listarMarca();
    }

}
