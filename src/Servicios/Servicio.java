/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Servicios;

import Entidad.Persona;
import Util.Comparadores;
import Util.Util;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Servicio {

    private List<Persona> crearListaPersona() {
        final String ARCHIVO_EXTERNO = "D:\\datos.csv";
        Util archivo = new Util();
        return archivo.leerArchivo(ARCHIVO_EXTERNO);
    }

    private String filtroPorNombre(List<Persona> listaPersonas) {
        return listaPersonas.stream().filter((persona) -> persona.getNombre().equals("Giselle Marshall")).map((persona) -> persona.toString()).reduce("", String::concat);
    }

    private String filtroPorCorreo(List<Persona> listaPersonas) {
        return listaPersonas.stream().filter((persona) -> persona.getCorreo().equals("imperdiet.non@enim.org")).map((persona) -> persona.toString()).reduce("", String::concat);
    }

    private Set<String> obtenerCiudades(List<Persona> listaPersonas) {
        Set<String> ciudades = new TreeSet<>();
        listaPersonas.stream().forEach((persona) -> ciudades.add(persona.getCiudad()));
        return ciudades;
    }

    private long filtroPorCorreoEspecifico(List<Persona> listaPersonas) {
        return listaPersonas.stream().filter((persona) -> persona.getCorreo().contains("elit")).count();
    }

    private void montoPorTres(List<Persona> listaPersonas) {
        listaPersonas.forEach((persona) -> persona.setMonto(persona.getMonto() * 3));
    }

    private String filtroPorMonto(List<Persona> listaPersonas) {
        montoPorTres(listaPersonas);
        return listaPersonas.stream().filter((persona) -> (persona.getMonto() > 29000)).map((persona) -> persona.toString() + "\n").reduce("", String::concat);

    }

    private double promedioDeMoto(List<Persona> listaPersona) {

        return (double) (listaPersona.stream().map((persona) -> persona.getMonto()).reduce(0, (a, b) -> a + b)) / listaPersona.size();
    }

    private String obtenerDatosMenorMonto(List<Persona> listaPersonas) {
         return listaPersonas.stream().min(Comparadores.compararMontoAscendente).get().toString();
        //return Collections.min(listaPersonas, Comparadores.compararMontoAscendente).toString();

    }

    private String obtenerDatosMayorMonto(List<Persona> listaPersonas) {
         return listaPersonas.stream().max(Comparadores.compararMontoAscendente).get().toString();
        //return Collections.max(listaPersonas, Comparadores.compararMontoAscendente).toString();
    }

    public void mostrarDatos() {
        List<Persona> listaPersona = crearListaPersona();
        Set<String> ciudades = obtenerCiudades(listaPersona);
        System.out.println("DATOS POR FILTRO NOMBRE: \"Giselle Marshall\"\n"+filtroPorNombre(listaPersona)+"\n");
        System.out.println("DATOS POR FILTRO CORREO: \"imperdiet.non@enim.org\"\n"+filtroPorCorreo(listaPersona)+"\n");
        System.out.println("CANTIDAD DE CIUDADES SIN REPETIR: "+ciudades.size()+"\n");
        System.out.println("CORREOS QUE CONTIENEN EN SU DOMINIO \"elit\": "+filtroPorCorreoEspecifico(listaPersona)+"\n");
        System.out.println("DATOS POR FILTRO MONTO SUPERIOR A \"29.000\"\n"+filtroPorMonto(listaPersona));
        System.out.println("EL MONTO PROMEDIO ES: "+promedioDeMoto(listaPersona)+"\n");
        System.out.println("DATOS DEL MENOR MONTO\n"+obtenerDatosMenorMonto(listaPersona)+"\n");
        System.out.println("DATOS DEL MAYOR MONTO\n"+obtenerDatosMayorMonto(listaPersona)+"\n");

    }
}
