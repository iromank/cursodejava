
package poo;
import javax.swing.JOptionPane;
public class c_cliente {
    private String color;
      private String marca;
        private String modelo;
        
        public c_cliente(){
         color="ROJO";
       marca="TOYOTA";
         modelo="KIA";    
            
        }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public static void main(String[] args) {
        c_cliente c_cliente=new c_cliente();//objeto 
        c_cliente.setMarca(JOptionPane.showInputDialog("ingresa marca de auto"));
         c_cliente.setModelo(JOptionPane.showInputDialog("ingresa modelo de auto"));
        c_cliente.setColor(JOptionPane.showInputDialog("ingresa color  de auto"));
        System.err.println("el coloR deL carro  "+c_cliente.getColor());
           System.err.println("LA MARVA DEL "+c_cliente.getMarca());
           System.err.println("el  modelo del carro  "+c_cliente.getModelo());
    }
}
