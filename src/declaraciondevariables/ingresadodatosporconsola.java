
package declaraciondevariables;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ingresadodatosporconsola {
    //creamos un opjeto de la clase Scanner
    public static void main(String[] args) {
         Scanner i=new Scanner(System.in);
         System.err.println("ingrese un numero");
         int numero=i.nextInt();
          System.err.println("ingrese un nombre");
        String nombre=i.next();
         System.err.println("ingrese precio");
        double precio=i.nextDouble();
        
        JOptionPane.showMessageDialog(null,numero);
        JOptionPane.showMessageDialog(null,nombre);
        JOptionPane.showMessageDialog(null,precio);
    }
    
   
    
}
