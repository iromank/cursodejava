
package declaraciondevariables;

import javax.swing.JOptionPane;

public class ingresodatosjinputdialg {
   static  int cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
 static   String nombre=JOptionPane.showInputDialog("ingresa tu nombre");
 static   double precio=Double.parseDouble(JOptionPane.showInputDialog("ingresa precio"));
    
   //emprimimos en consola
 public static void main(String [] args){
     System.err.println(cantidad);
      System.err.println(nombre);
       System.err.println(precio);
     
 }
}
