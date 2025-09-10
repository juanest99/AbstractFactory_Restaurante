import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = null;

        Entrada entrada =null;
        Principal principal = null;
        Bebida bebida = null;
        Postre postre = null ;


        System.out.println("Seleccione el tipo de menu: \n 1. Vegetariano \n 2. Gourmet \n 3. Saludable");
        int opcion = sc.nextInt();
        String eliminado;
        switch (opcion){
            case 1:
                menu = new MenuVegetariano();
                System.out.println("\nHa seleccionado el menu vegetariano");
                break;
            case 2:
                menu = new MenuGourmet();
                System.out.println("\nHa seleccionado el menu gourmet");
                break;
            case 3:
                menu = new MenuSaludable();
                System.out.println("\nHa seleccionado el menu saludable");
                break;
            default:
                System.out.println("opcion no valida");
                System.exit(0);
        }
        sc.nextLine(); // Limpiar el buffer
        entrada = menu.crearEntrada();
        principal = menu.crearPlato();
        bebida = menu.crearBebida();
        postre = menu.crearPostre();

        StringBuilder menuCompleto = new StringBuilder();
        menuCompleto.append("\n**** Su menu **** \n");

        System.out.println("¿De casualidad desea eliminar algun plato?");

        System.out.println("Desea eliminar la entrada (S/N)?");
        eliminado = sc.nextLine().toUpperCase();
        if (!eliminado.equalsIgnoreCase("S")) {
            menuCompleto.append("Entrada: ").append(entrada.getNombre()).append("\n");
        }

        System.out.println("Desea eliminar el plato principal (S/N)?");
        eliminado = sc.nextLine().toUpperCase();

        if (!eliminado.equalsIgnoreCase("S")) {
            menuCompleto.append("Plato Principal: ").append(principal.getNombre()).append("\n");
        }
        System.out.println("Desea eliminar la bebida (S/N)?");
        eliminado = sc.nextLine().toUpperCase();

        if (!eliminado.equalsIgnoreCase("S")) {
            menuCompleto.append("Bebida: ").append(bebida.getNombre()).append("\n");
        }

        System.out.println("Desea eliminar el postre (S/N)?");
        eliminado = sc.nextLine().toUpperCase();
        if (!eliminado.equalsIgnoreCase("S")) {
            menuCompleto.append("Postre: ").append(postre.getNombre()).append("\n");
        }


        System.out.println(menuCompleto);

    }}
