import java.util.Scanner;

public class LosAmantesDeIntel {
    public static void main(String[] args) {

        Ensamblaje ensamblaje = new Ensamblaje();

        Scanner m = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\n***BIENVENIDO A MCDONALDS***"
                    + "\n¿Puedo tomar tu orden?"
                    + "\n1.- Combo 1"
                    + "\n2.- Combo 2"
                    + "\n3.- Combo 3"
                    + "\n0.- Salir");

            while (true){
                try {
                    String opcionUsuario = m.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                }catch (NumberFormatException ex){
                    System.out.println("Ingresa una opcion valida."
                            + "\n1.- Combo 1"
                            + "\n2.- Combo 2"
                            + "\n3.- Combo 3"
                            + "\n0.- Salir");
                }
            }

            switch(opcion){
                case 1:
                    Comida combo1 = new Combo1();
                    System.out.println("\nComida Combo 1");
                    cheems.preparaComboUno(combo1);
                    combo1.muestraComida();
                    System.out.println("Total: " + (float)combo1.obtenCosto());
                    break;
                case 2:
                    Comida combo2 = new Combo2();
                    System.out.println("\nComida Combo 2");
                    cheems.preparaComboDos(combo2);
                    combo2.muestraComida();
                    System.out.println("Total: " + (float)combo2.obtenCosto());
                    break;
                case 3:
                    Comida combo3 = new Combo3();
                    System.out.println("\nComida Combo 3");
                    cheems.preparaComboTres(combo3);
                    combo3.muestraComida();
                    System.out.println("Total: " + (float)combo3.obtenCosto());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingresa una opcion valida.");
                    break;
            }
        }while(opcion != 0);
    }
}
