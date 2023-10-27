/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

public class Contacto{
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private String cumpleaños;

    public Contacto(String nombre, String apellido, String telefono, String correo, String direccion, String cumpleaños) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.cumpleaños = cumpleaños;
    }

    public String Nombre(){
        return nombre;
    }

    public String Apellido(){
        return apellido;
    }

    public void mostrarContacto(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo electrónico: " + correo);
        System.out.println("Dirección: " + direccion);
        System.out.println("Fecha de cumpleaños: " + cumpleaños);
    }
}