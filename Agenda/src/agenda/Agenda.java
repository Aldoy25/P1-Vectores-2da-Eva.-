/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda{
    private ArrayList<Contacto> contactos;

    public Agenda(){
        contactos = new ArrayList<>();
    }

    public void mostrarmenu(){
        System.out.println("\nMenú\n");
        System.out.println("1. Registrar un contacto");
        System.out.println("2. Buscar un contacto");
        System.out.println("3. Eliminar un contacto");
        System.out.println("4. Modificar un contacto");
        System.out.println("5. Salir");
    }

    public void registrarcontacto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Fecha de cumpleaños: ");
        String cumpleaños = scanner.nextLine();

        Contacto nuevoContacto = new Contacto(nombre, apellido, telefono, correo, direccion, cumpleaños);
        contactos.add(nuevoContacto);

        System.out.println("Contacto registrado con éxito.");
    }

    public void buscarcontacto(){
        System.out.println("\nListado de Contactos\n");
        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            System.out.println((i + 1) + ". " + contacto.Nombre() + " " + contacto.Apellido());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona un contacto (1-" + contactos.size() + "): ");
        int seleccion = scanner.nextInt();
        if (seleccion >= 1 && seleccion <= contactos.size()) {
            Contacto contactoSeleccionado = contactos.get(seleccion - 1);
            contactoSeleccionado.mostrarContacto();
            } else{
            System.out.println("Selección inválida.");
        }
    }

    public void eliminarcontacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEliminar Contacto\n");
        System.out.print("Selecciona un contacto a eliminar (1-" + contactos.size() + "): ");
        int seleccion = scanner.nextInt();
        if (seleccion >= 1 && seleccion <= contactos.size()) {
            Contacto contactoEliminado = contactos.remove(seleccion - 1);
            System.out.println("Contacto eliminado con éxito: " + contactoEliminado.Nombre() + " " + contactoEliminado.Apellido());
            } else{
            System.out.println("Selección inválida.");
        }
    }

    public void modificarcontacto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nModificar Contacto\n");
        System.out.print("Selecciona un contacto a modificar (1-" + contactos.size() + "): ");
        int seleccion = scanner.nextInt();
        if (seleccion >= 1 && seleccion <= contactos.size()) {
            Contacto contactomodificar = contactos.get(seleccion - 1);
            System.out.println("Modificar contacto seleccionado:");
            contactomodificar.mostrarContacto();
            System.out.println("Ingresa la nueva información:");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Apellido: ");
            String apellido = scanner.next();
            System.out.print("Teléfono: ");
            String telefono = scanner.next();
            System.out.print("Correo electrónico: ");
            String correo = scanner.next();
            System.out.print("Dirección: ");
            String direccion = scanner.next();
            System.out.print("Fecha de cumpleaños: ");
            String cumpleaños = scanner.next();
            contactomodificar = new Contacto(nombre, apellido, telefono, correo, direccion, cumpleaños);
            contactos.set(seleccion - 1, contactomodificar);
            
            System.out.println("Contacto modificado.");
            } else{
            System.out.println("Selección no válida.");
        }
    }
}