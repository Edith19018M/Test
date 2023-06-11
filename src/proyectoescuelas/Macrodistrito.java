/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author Desktop
 */
public class Macrodistrito {
    private String nombre;
     private CSimpleZ cz;

    public Macrodistrito(String nombre, CSimpleZ cz) {
        this.nombre = nombre;
        this.cz = cz;
    }

    public Macrodistrito() {
    }

    public CSimpleZ getCz() {
        return cz;
    }

    public void setCz(CSimpleZ cz) {
        this.cz = cz;
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public void mostrar(){
        System.out.println("\n");
        System.out.println("Macrodistrito:\t \t \t"+nombre+"");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        cz.mostrar();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
    }
    void leer1() {
        System.out.println("Macrodistrito:");
        System.out.println("Nro de Instituciones");
        int nu=Leer.datoInt();
        nombre=Leer.dato();
        cz.llenar1(nu);     
    }
    void leer2() {
        System.out.println("Macrodistrito:");
        System.out.println("Nro de Instituciones");
        int nu=Leer.datoInt();
        nombre=Leer.dato();
        cz.llenar2(nu);     
    }
}
