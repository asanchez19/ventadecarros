/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventadecarros.vendedor.controler;

import com.ventadecarros.vendedor.model.Marca;
import com.ventadecarros.vendedor.service.MarcaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jorda
 */

@RestController
@RequestMapping("/rest")
public class MarcaController {
    @Autowired
    private MarcaService marcaservice;
    
@GetMapping("/marcas")
    public List<Marca> getMarcas() {
        List<Marca> listMarcas = marcaservice.listarMarca();

        return  listMarcas;
    }    
}
