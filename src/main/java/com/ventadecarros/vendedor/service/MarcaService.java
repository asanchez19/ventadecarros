/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventadecarros.vendedor.service;

import com.ventadecarros.vendedor.model.Marca;
import java.util.List;

/**
 *
 * @author jorda
 */
public interface MarcaService {
    Marca agregar(Marca marca);
    boolean actualizar(Long id, Marca marca);
    boolean eliminarPorId(Long id);
    Marca selectPorId(Long id);
    List<Marca> listarMarca();
}
