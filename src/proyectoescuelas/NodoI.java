/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class NodoI {
   // private Ins
    private Institucion i;
    private NodoI ant,sig;

    public Institucion getI() {
        return i;
    }

    public NodoI getAnt() {
        return ant;
    }

    public NodoI getSig() {
        return sig;
    }

    public void setI(Institucion i) {
        this.i = i;
    }

    public void setAnt(NodoI ant) {
        this.ant = ant;
    }

    public void setSig(NodoI sig) {
        this.sig = sig;
    }
    
    
}
