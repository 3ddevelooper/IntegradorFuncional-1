/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Entidad;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Persona {
    private String nombre;
    private String correo;
    private String ciudad;
    private Integer monto;

    public Persona() {
    }

    public Persona(String nombre, String correo, String ciudad, Integer monto) {
        this.nombre = nombre;
        this.correo = correo;
        this.ciudad = ciudad;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nCorreo: "+correo+"\nCiudad: "+ciudad+"\nMonto: "+monto;
    }
    
    
    
}
