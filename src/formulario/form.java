
package formulario;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class form extends JFrame{
    
   public form(){
       this.setLocation(200,200);
       this.setSize(200,200);
       this.setVisible(true);
       panel mipanel=new panel();
       add(mipanel);
   }
    public static void main(String[] args) {
        form form=new form();
        
    }
    
}

class panel extends JPanel{
   
    
    
}