/**
 * -windowtitle Clase Tipo de Identificación
 */
package cr.sa.ccss.entidad;

/**
 *
 * @author csibajac
 * @version 1.0 26/04/2018
 */
public class TipoIdentificacion {

    /**
     * Declara los Atributos como private
     */
    private String codigo;
    private String descripcion;
    private int nivel1;
    private int nivel2;
    private int nivel3;
    private char enuso;

    /**
     * Constructor vacio
     */
    public TipoIdentificacion() {
    }

    /**
     * Constructor con atributo de llave primaria
     *
     * @param codigo se recibe el código del tipo de identificación
     */
    public TipoIdentificacion(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Constructor con todos los atributos
     *
     * @param codigo se recibe el código del tipo de identificación
     * @param descripcion se recibe la descripcion del tipo de identificación
     */
    public TipoIdentificacion(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public TipoIdentificacion(String codigo, String descripcion, int nivel1, int nivel2, int nivel3, char enuso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nivel1 = nivel1;
        this.nivel2 = nivel2;
        this.nivel3 = nivel3;
        this.enuso = enuso;
    }

    /**
     * Función que recupera el codigo del tipo de identificación.
     *
     * @return Devuelve un código.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método que actualiza el código del tipo de identificación.
     *
     * @param codigo Recibe el valor del código.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Función que recupera la descripción del tipo de identificación.
     *
     * @return Retorna la descripción.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que actualiza el valor de la descripción del tipo de
     * identificación.
     *
     * @param descripcion Recibe el valor de la descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivel1() {
        return nivel1;
    }

    public void setNivel1(int nivel1) {
        this.nivel1 = nivel1;
    }

    public int getNivel2() {
        return nivel2;
    }

    public void setNivel2(int nivel2) {
        this.nivel2 = nivel2;
    }

    public int getNivel3() {
        return nivel3;
    }

    public void setNivel3(int nivel3) {
        this.nivel3 = nivel3;
    }

    public char getEnuso() {
        return enuso;
    }

    public void setEnuso(char enuso) {
        this.enuso = enuso;
    }

}
