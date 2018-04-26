/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.sa.ccss.entidad;

/**
 *
 * @author csibajac
 */
public class Genero {

    private String codigo;
    private String descripcion;
    private String enuso;

    public Genero() {
    }

    public Genero(String codigo) {
        this.codigo = codigo;
    }

    public Genero(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.enuso = enuso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnuso() {
        return enuso;
    }

    public void setEnuso(String enuso) {
        this.enuso = enuso;
    }
}
