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
public class EstadoCivil {

    private String codigo;
    private String descripcion;
    private char activo;

    public EstadoCivil() {
    }

    public EstadoCivil(String codigo) {
        this.codigo = codigo;
    }

    public EstadoCivil(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion  = descripcion;
        this.activo = activo;
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

    public char getActivo() {
        return activo;
    }

    public void setActivo(char activo) {
        this.activo = activo;
    }

}
