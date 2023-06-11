
package proyectoescuelas;

public class Zona {
    
    private String nombre;
    private LDobleI li;
    //private LDobleI li;

    public Zona() {
    }
    
    public Zona(String nombre ,LDobleI li) {
        this.nombre = nombre;
        this.li = li;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LDobleI getLi() {
       return li;
    }

    public void setLi(LDobleI li) {
       this.li = li;
    }
    public void mostrar(){
        System.out.println("Zona:\t \t \t \t"+nombre);
        li.mostrar();
    }
    public void leer1() {
        System.out.println("Zona: ");
        nombre=Leer.dato();
        LDobleI l=new LDobleI();
        System.out.println("Nro de Zonas: ");
        int nu=Leer.datoInt();
        l.leer1(nu); 
        li=l;       
    }
    public void leer2() {
        System.out.println("Zona: ");
        nombre=Leer.dato();
        LDobleI l=new LDobleI();
        System.out.println("Nro de Zonas: ");
        int nu=Leer.datoInt();
        l.leer2(nu); 
        li=l;
    }
}
