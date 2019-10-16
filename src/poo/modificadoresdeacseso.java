
package poo;

public class modificadoresdeacseso {
  private  int id; // este tipo de  modificador de exseso solo nos permitira solo utilizar esta variable en la misma de casa
  public   String nombre;// este tipo de bable nos permitira modificar el valor de variable de cualquier lugar

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

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
    public static void main(String[] args) {
        modificadoresdeacseso mo=new modificadoresdeacseso();
        mo.id=2;
        mo.nombre="nilson";
    }
  
}
