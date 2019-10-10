
package declaraciondevariables;

import java.util.Scanner;

public class estructurasrepetitivas {
    public static void main(String[] args) {
          Scanner i=new Scanner(System.in);
         System.err.println("ingrese usuario");
         // suma de dos numeros
         
        String usuario="";
        String pass="baca";
        usuario=i.next();
         System.err.println("ingrese clave");
          pass=i.next();
          
          while((usuario.equals("nilson")==false) ||(pass.equals("baca")==false)){
              
          
          }
          do{
         System.err.println("ingrese usuario");
         usuario=i.next();
         System.err.println("ingrese clave");
          pass=i.next();
              System.err.println("contraseña incorrecta ");
          } while((usuario.equals("nilson")==false) ||(pass.equals("baca")==false));  
    }
}
