/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistalumnoscd;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kdiaziglesias
 */
public class ColegioCD {
       private String nombre;
    private int nota;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
 
  public ColegioCD(){
  
  }
  public ColegioCD(String nombre,int nota){
  this.nombre=nombre;
  this.nota=nota;
  
  
  }
  
  public void Listadealumnos(ArrayList<ColegioCD> lista){
      String auxnombre;
      int auxnota;
      
  do{
  auxnombre=JOptionPane.showInputDialog("Dame nombre");
   auxnota= Integer.parseInt(JOptionPane.showInputDialog("Dame nota"));
   
   ColegioCD col = new ColegioCD (auxnombre,auxnota);
   if(auxnombre.compareToIgnoreCase("fin")!=0)
   lista.add(col);
   
  }while (auxnombre.equalsIgnoreCase("fin")!=true); 
          
     
  }
  public String toString(){
  return ("nombre " + nombre + " nota "+nota); 
  
  }
  public void ver(ArrayList<ColegioCD> lista){
  for(int i=0;i<lista.size();i++){
  System.out.println(lista.get(i));
  
  }
  
  }
    public void verNotadetermidado(ArrayList<ColegioCD> lista, String nombreabuscar){
        boolean atopado =false;
        for(int i=0;i<lista.size();i++){
if(nombreabuscar.equalsIgnoreCase(lista.get(i).getNombre())){
    System.out.println("Alumno"+lista.get(i).getNota());
    atopado=true;
}

}
    System.out.println("Alumno no encontrado");
    }
}
