/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class PlanEstudio {
    private String nombreP;
    PlanEstudio(String nombre){
        nombreP=nombre;
    }
    PlanEstudio(){
    }
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    public void mostrar(){
        
        System.out.println("(*)"+nombreP+" ");
    }
    public void leer(){        
        System.out.print("Ingrese el Plan: ");
        nombreP=Leer.dato();
    }
}
