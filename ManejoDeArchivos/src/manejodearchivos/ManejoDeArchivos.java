/*
-Crear archivo
-Guardar infor. en un archivo
-Eliminar infor. de un archivo
 */
package manejodearchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static void escribirArchivo(String nombre, String contenido){
        
        PrintWriter salida=null;
        File archivo=new File(nombre);
        
        try{  //el fichero existe
            salida=new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el archivo!!!");
        }catch(FileNotFoundException ex){//El fichero no existe=>Excep.
            ex.printStackTrace(System.out);
        }finally {//Este bloque siempre se ejecuta)
            salida.close();
        }
    }
    //Este método agrega texto en el archivo, no sobreescribe
    public static void agregarArchivo(String nombre, String contenido){
        PrintWriter salida= null;
        File archivo=new File(nombre);
        try{
            salida=new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        }catch(IOException ex){
           
        }finally {
            salida.close();
        }
        
    }
    
    public static void leerArchivo(String nombre){
        BufferedReader entrada=null;        
        //1.Declaramos el file
        File archivo=new File(nombre);
        try {
            //2. Creamos el descriptor de lectura del fichero
            entrada=new BufferedReader(new FileReader(archivo));
            String lectura=entrada.readLine();
            //3.Ahora recorremos lectura hasta fin de fichero
            while (lectura!=null){
                System.out.println("lectura="+lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        }catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }catch (IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivoPorPalabra(String nombre){
        File archivo=new File(nombre);
        try {
            Scanner entrada = new Scanner(archivo);
            int cont=0;
            //recorro el fichero hasta el final
            while(entrada.hasNext()){
                String palabra=entrada.next();
                System.out.println(palabra);
                cont=cont+1;
            }
            System.out.println("Nº de la palabras de mi fichero="+cont);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
    
