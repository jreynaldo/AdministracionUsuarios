/**
 * Created by root on 24-08-14.
 */
package curso.beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name="Hello")
@RequestScoped
public class Hello {
    private String nombre="No inicializado";
    public Hello() {
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}