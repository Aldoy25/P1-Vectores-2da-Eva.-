/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        while(true){
            agenda.mostrarmenu();
            System.out.print("\nSelecciona una opción:");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    agenda.registrarcontacto();
                    break;
                case 2:
                    agenda.buscarcontacto();
                    break;
                case 3:
                    agenda.eliminarcontacto();
                    break;
                case 4:
                    agenda.modificarcontacto();
                    break;
                case 5:
                    System.out.println("\nHasta luego.");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}