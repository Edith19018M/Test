/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class LSimpleP {
    private NodoP P;
    LSimpleP()
    {
        P=null;
    }

    public NodoP getP() {
        return P;
    }

    public void setP(NodoP p) {
        this.P = p;
    }
    public int nroNodos() {
	int c=0;
	NodoP w=getP();
	while(w!=null) {
            c++;
            w=w.getSig();
	}
	return c;
    }
    public void adiPrincipio(PlanEstudio plan){
        NodoP nue=new NodoP();
        nue.setP(plan);
        nue.setSig(getP());
        setP(nue);
    }
    public void adiFinal(PlanEstudio plan){
        NodoP nuevo=new NodoP();
        nuevo.setP(plan);
        
        if(getP()==null)
            setP(nuevo);
        else {
            NodoP r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void mostrar()
    {
        NodoP o=getP();
        while(o!=null)
        {   
            o.getP().mostrar();
            o=o.getSig();
        }
    }
    ////
    public void Leer(int n)
    {
        for(int i=1;i<=n;i++){
            PlanEstudio plan = new PlanEstudio();
            plan.leer();
            adiFinal(plan);
        }
    }
    
}
