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
public class Provincia {

    private String numero;
    private String descripcion;

    public Provincia() {
    }

    public Provincia(String numero) {
        this.numero = numero;
    }

    public Provincia(String numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
