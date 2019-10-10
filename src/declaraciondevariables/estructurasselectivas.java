
package declaraciondevariables;

import java.util.Scanner;

public class estructurasselectivas {
    public static void main(String[] args) {
         Scanner i=new Scanner(System.in);
         System.err.println("ingrese usuario");
         // suma de dos numeros
         
        String usuario="";
        String pass="baca";
        usuario=i.next();
         System.err.println("ingrese clave");
          pass=i.next();
          // nos permite evaluar una condicion si es vesasera o falsa
        if(usuario.equals("nilson") && (pass.equals("baca"))){
            System.err.println("si ingesa al sistea");
        }
        else{
            System.err.println("cotarseña in corecta");
        }
        // if en cascada
        String dia="";
         System.err.println("ingrese dia");
          dia=i.next();
            if(dia.equals("lunes")){
               System.err.println("laborable"); 
            }
             if(dia.equals("martes")){
               System.err.println("laborable"); 
            }
              if(dia.equals("niercoles")){
               System.err.println("laborable"); 
            } if(dia.equals("jueves")){
               System.err.println("laborable"); 
            }
             if(dia.equals("viernes")){
               System.err.println("laborable"); 
            }
              if(dia.equals("sabado")){
               System.err.println("no laborable"); 
            }
               if(dia.equals("domingo")){
               System.err.println("no laborable"); 
            }
              
              
switch(dia){
    case"lunea":
        System.err.println("laborable"); 
    break;
    case"martes":
        System.err.println("laborable"); 
    break;case"miercoles":
        System.err.println("laborable"); 
    break;
    case"jueves":
        System.err.println("laborable"); 
    break;
    case"viernes":
        System.err.println("laborable"); 
    break;
    case"sabado":
        System.err.println(" no laborable"); 
    break;
     case"domingo":
        System.err.println(" no laborable"); 
    break;
   default:
        System.err.println("dia no existe ese dia");
    break;
    
    
}
    }
     
}
