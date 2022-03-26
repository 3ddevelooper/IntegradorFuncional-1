/*
 * Bienvenido, este es un mensaje auto-generado por Damian Dries
 * Damian Dries - JAVA DEV 
 * www.damiandries.com.ar
 */
package Util;

import Entidad.Persona;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Damian Dries - "www.damiandries.com.ar"
 */
public class Util {
    
    

//    public List<Persona> leerArchivo(String archivo) {
//       List<Persona> personaLista = new ArrayList();
//        try (
//            BufferedReader br = new BufferedReader(new FileReader(archivo));) {
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                  String[] dataSplit = linea.split(",");
//                  personaLista.add(new Persona(dataSplit[0],dataSplit[1],dataSplit[2], Integer.parseInt(dataSplit[3])));
//            }
//        } catch (IOException e) {
//            System.out.println("ERROR: " + e.getMessage());
//        }
//        return personaLista;
//    }

    
    
    public List<Persona> leerArchivo(String archivo) {
        List<Persona> listaPersonas = new ArrayList();
        try (Stream<String> streamFile = Files.lines(Paths.get(archivo))){
          listaPersonas = streamFile.map(linea -> linea.split(",")).map(array -> {Persona pers = new Persona(array[0],array[1],array[2], Integer.parseInt(array[3]));
             return pers;
                  }).collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return listaPersonas;
    }
    
}
