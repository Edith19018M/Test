/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class NodoP {
    private PlanEstudio P;
    private NodoP ant,sig;
    
    NodoP(){
        ant=sig=null;
    }

    public PlanEstudio getP() {
        return P;
    }

    public NodoP getAnt() {
        return ant;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setP(PlanEstudio P) {
        this.P = P;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
}
