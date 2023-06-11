/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class LDobleI {
    private NodoI P;
    LDobleI(){
        P=null;
    }

    public NodoI getP() {
        return P;
    }

    public void setP(NodoI P) {
        this.P = P;
    }
    public boolean esvacia() {
    	return P==null;
    }
    public void adiFinal(Institucion elem){
        NodoI nuevo=new NodoI();
        nuevo.setI(elem);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoI r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }
    public void adiPrincipio(Institucion elem) {
    	NodoI nuevo=new NodoI();
    	nuevo.setI(elem);
        if(getP()==null)
            setP(nuevo);
        else
        {
            nuevo.setSig(getP());
            getP().setAnt(nuevo);
            setP(nuevo);
        }
	}
    public void leer2(int n)
    {
        for(int i=1;i<=n;i++){
            Institucion elem=new Institucion();
            elem.leer();
            adiFinal(elem);
        }
    }
    public void leer1(int n)
    {
        for(int i=1;i<=n;i++){
            Institucion elem=new Institucion();
            elem.leer();
            adiPrincipio(elem);
        }
    } 
	public void mostrar()
    {
        
        NodoI r=getP();
        while(r!=null){
            System.out.println("------------------------------------------------------------------------");
        	r.getI().mostrar();
            r=r.getSig();
        }
    }
	public int nroNodos() {
		int c=0;
		NodoI w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}/*
	public void leer2() {
		adiFinal(new Institucion());
		adiFinal(new Institucion());
		adiFinal(new Institucion());
		adiFinal(new Institucion());
		adiFinal(new Institucion());
	}*/
}
