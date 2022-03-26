/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Util;

import Entidad.Persona;
import java.util.Comparator;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Comparadores {
    public static Comparator<Persona> compararMontoAscendente = (Persona p1, Persona p2) -> p1.getMonto().compareTo(p2.getMonto());
}
