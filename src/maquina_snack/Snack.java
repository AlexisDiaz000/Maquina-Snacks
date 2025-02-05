package maquina_snack;

import java.io.Serializable;
import java.util.Objects;

// creacion de clase beans
public class Snack implements Serializable {
    //atributos.
    private static int contadorSnack = 0;
    private int idSnack;
    private String nombre;
    private double precio;
    //constructor
    public Snack(){
        this.idSnack = ++Snack.contadorSnack;
    }
    public Snack(String nombre, double precio){
        this();//debe ser el primer linea la llamada al constructor.
        this.nombre = nombre;
        this.precio = precio;
    }
    //solo se genera el get de contadorSnack ya que el set no se utiliza
    public static void setContadorSnack(int contadorSnack) {
        Snack.contadorSnack = contadorSnack;
    }
    // se crean los getter y setter de los atributos de la clase
    public int getIdSnack() {
        return idSnack;
    }

    public void setIdSnack(int idSnack) {
        this.idSnack = idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override  //equals para realizar las comparaciones
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override //hashCode para hacer comparaciones de tipo numerico.
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
