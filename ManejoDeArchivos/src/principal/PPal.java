/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import manejodearchivos.ManejoDeArchivos;
/**
 *
 * @author Alumno Mañana
 */
public class PPal {
    
    public static void main(String[] args){
        //Creamos archivo
        String nombreArchivo="prueba.txt";
        ManejoDeArchivos.crearArchivo(nombreArchivo);
        ManejoDeArchivos.escribirArchivo(nombreArchivo, "Buenos días");
        ManejoDeArchivos.agregarArchivo(nombreArchivo, "vuestro caudillo");
        ManejoDeArchivos.leerArchivoPorPalabra(nombreArchivo);
    }
}
