/*
-Crear archivo
-Guardar infor. en un archivo
-Eliminar infor. de un archivo
 */
package manejodearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Nacho L.C.
 */
public class ManejoDeArchivos {

    public static void crearArchivo(String nombre) {
        //Creo objeto de tipo File donde paso el nombre del fichero
        File archivo=new File(nombre);
        try{
            PrintWriter salida= new PrintWriter(archivo);
            salida.close();
        //Creo una excepción ya que puede que no exista el archivo en el que quiero escribir
        }catch (FileNotFoundException ex){
            ex.printStackTrace (System.out);
        }
    }
    
}
