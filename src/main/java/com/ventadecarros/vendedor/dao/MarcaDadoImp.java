/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventadecarros.vendedor.dao;

import com.ventadecarros.vendedor.model.Marca;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jorda
 */
@Repository
public class MarcaDadoImp implements MarcaDao {

    @Autowired
    private SessionFactory sessionfactory;

    @Override
    public Marca agregar(Marca marca) {
        sessionfactory.getCurrentSession().save(marca);
        return marca;
    }

    @Override
    public boolean actualizar(Long id, Marca marca) {
        Marca marcaUpdated = selectPorId(id);
        boolean resultado = false;
        if (marcaUpdated != null) {
            sessionfactory.getCurrentSession().merge(marca);
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    @Override
    public boolean eliminarPorId(Long id) {
        Marca marcaDelete = selectPorId(id);
        boolean resultado = false;
        if (marcaDelete != null) {
            sessionfactory.getCurrentSession().delete(marcaDelete);
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    @Override
    public Marca selectPorId(Long id) {
        Marca marca = (Marca) sessionfactory.getCurrentSession().get(Marca.class, id);
        return marca;
    }

    @Override
    public List<Marca> listarMarca() {
        @SuppressWarnings("unchecked")
        TypedQuery<Marca> query = sessionfactory.getCurrentSession().createQuery("from AUTOF_MARCA");
        return query.getResultList();
    }

}
