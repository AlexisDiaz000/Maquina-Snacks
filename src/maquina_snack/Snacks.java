package maquina_snack;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    // bloque static inicializador
    static {
        snacks = new ArrayList<>();
        // creacion de la lista
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Gaseosa",50));
        snacks.add(new Snack("Sandwich", 120));
    }
    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }
    public static void mostrarSnack(){
        var inventarioSnack = "";
        for(var snack : snacks){
            inventarioSnack += snack.toString() + "\n";
        }
        System.out.println("---- Snack en el Inventario -----");
        System.out.println(inventarioSnack);
    }
    public static List<Snack> getSnacks(){
        return snacks;

    };
}
