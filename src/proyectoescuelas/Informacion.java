/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class Informacion {
    private String enfocado;
    private String turno;
    private double costo;    
    private String ciclo;
    private int Puntuacion;
    private LSimpleP pl;

    public Informacion( String enfocado,String turno,double costo, String ciclo, int Puntuacion, LSimpleP pl) {
        this.enfocado = enfocado;
        this.turno=turno;
        this.costo = costo;
        this.ciclo = ciclo;
        this.Puntuacion = Puntuacion;
        this.pl = pl;
    }
    public Informacion(){
    }
    public String getTurno() {
        return turno;
    }

    public double getCosto() {
        return costo;
    }

    public String getEnfocado() {
        return enfocado;
    }

    public String getCiclo() {
        return ciclo;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public LSimpleP getPl() {
        return pl;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setEnfocado(String enfocado) {
        this.enfocado= enfocado;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public void setPl(LSimpleP pl) {
        this.pl = pl;
    }
    public void mostrar(){
        System.out.println("Para: "+enfocado+"\nTurno: "+turno+"\tCosto: "+costo+"\tCiclo: "+ciclo+"\tPuntuacion: "+Puntuacion);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Plan De Estudios");
        pl.mostrar();
    }
    public void leer(){
        System.out.println("Enfocado: ");
        enfocado=Leer.dato();
        System.out.println("Turno: ");
        turno=Leer.dato();
        System.out.println("Costo: ");
        costo=Leer.datoDouble();
        System.out.println("Ciclo: ");
        ciclo=Leer.dato();
        System.out.println("Puntuacion: ");
        Puntuacion=Leer.datoInt();
        System.out.println("---------------------------------");
        LSimpleP p1=new LSimpleP();
        System.out.println("Ingrese nro de Planes: ");
        int nu=Leer.datoInt();
        p1.Leer(nu);
        pl=p1;

    }
}
