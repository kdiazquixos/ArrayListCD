/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistalumnoscd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kdiaziglesias
 */
public class ArrayListAlumnosCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayList <ColegioCD> alumnos = new ArrayList< ColegioCD>(); 
     //ArrayList <Colegio>  creada
ColegioCD alumno = new ColegioCD();
alumno.Listadealumnos(alumnos);

alumno.ver(alumnos);
Scanner buscar = new Scanner(System.in);
       String busco = buscar.nextLine();
alumno.verNotadetermidado(alumnos, busco);
    }
    
}
