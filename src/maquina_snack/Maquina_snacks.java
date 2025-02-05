package maquina_snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maquina_snacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }
    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        //creacion de la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnack();// muestra el inventario de snack disponibles.
        while(!salir){
            try{
                var opicion = mostrarMenu(consola);
                //salir = ejecutarOpciones(opcion,consola,productos);

            }catch (Exception e){
                System.out.println("Ocurrido un error: " + e.getMessage());
            }
            finally {
                System.out.println();// Imprime un salto de linea con cada iteración
            }
        }

    }


    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                Menu:
                1.Comprar snack
                2.Mostrar ticket
                3.Agregar Nuevo Snack
                4.Salir
                Elige una opcion:\s""");
        // leemos  y retornamos la opcion selecionada
        return Integer.parseInt(consola.nextLine());

    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola,
                                            List<Snack> productos){
        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola,productos);
            case 2 -> mostrarTicket(productos);
        } return salir;
    }
    private static void comprarSnack(Scanner consola,
                                     List<Snack> productos){
        System.out.println("Que snack quiere comprar (id)?");
        var idSnack = Integer.parseInt(consola.nextLine());
        // validar la existencia del snack en stock
        var snackencontrado = false;
        for(var snack : Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()){
                productos.add(snack);// agregamos el snack a la lista de productos
                System.out.println("Ok, Snack agregado: " + snack);
                snackencontrado = true;
                break;
            }
        }
        if (!snackencontrado) {
            System.out.println("id de snack no encontrado: ");
        }

    }

    private static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de venta ***";
        var total = 0;
        for(var producto: productos){
            ticket += "\n\t-" + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();

        }
        ticket +="\n\tTotal -> $" + total;
        System.out.println(ticket);


    }




}
