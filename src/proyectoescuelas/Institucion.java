/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class Institucion {
    private String nombre;
    private String direccion;
    private String tipo;
    private int contactos;
    private Informacion in;

    public Institucion(String nombre, String direccion, String tipo, int contactos, Informacion in) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.contactos = contactos;
        this.in = in;
    }
    Institucion(){}
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public int getContactos() {
        return contactos;
    }

    public Informacion getIn() {
        return in;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setContactos(int contactos) {
        this.contactos = contactos;
    }

    public void setIn(Informacion in) {
        this.in = in;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre+"\nDireccion: "+direccion+"\nTipo: "+tipo+"\nContactos: "+contactos);
        in.mostrar();
    }public void leer(){
        System.out.println("nombre ins");
        nombre=Leer.dato();
        System.out.println("direccion");
        direccion=Leer.dato();
        System.out.println("tipo");
        tipo=Leer.dato();
        System.out.println("contactos");
        contactos=Leer.datoInt();
        System.out.println("Informacion");        
        Informacion inst = new Informacion();
        inst.leer();
        in=inst;

    }

    
}
