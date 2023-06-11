
package proyectoescuelas;

public class CCircularM {
    private int ini,fin,max=50;
   
	private Macrodistrito[] v=new Macrodistrito[max+1];
	CCircularM() {
		ini=fin=0;
	}
	int nroelem() {
		return (max+fin-ini)%max;
	}
	boolean esvacia() {
		return nroelem()==0;
	}
	boolean eslleno() {
		return (max-1)==nroelem();
	}
	void adicionar(Macrodistrito elem) {
		if(!eslleno()) {
			
			fin=(fin+1)%max;
			v[fin]=elem;
		}
		else
			System.out.println("cola llena");
	}
	Macrodistrito eliminar() {
		Macrodistrito elem=null;
                CSimpleZ aux1= new CSimpleZ();
		if(!esvacia()) {
			ini=(ini+1)%max;
			elem=v[ini];
                        
			if(ini==fin)
				ini=fin=0;
		}
		else
			System.out.println("cola vacia");
		return elem;                    
	}
	void llenar1(int n) {
		for (int i = 0; i < n; i++) {     
                    System.out.println("Macrodistrito: ");
                    String x=Leer.dato();
                    CSimpleZ z=new CSimpleZ ();
                    System.out.println("Nro de Zonas: ");
                    int nu=Leer.datoInt();
                    z.llenar1(nu);
	            Macrodistrito mx=new Macrodistrito(x,z);
		    adicionar(mx);
		}
	}
        void llenar2(int n) {
		for (int i = 0; i < n; i++) {     
                    System.out.println("Macrodistrito :");
                    String x=Leer.dato();
                    CSimpleZ z=new CSimpleZ ();
                    System.out.println("Nro de Zonas");
                    int nu=Leer.datoInt();
                    z.llenar2(nu);
	            Macrodistrito mx=new Macrodistrito(x,z);
		    adicionar(mx);
		}
	}
	void mostrar() {
                
		CCircularM aux=new CCircularM();
		while(!esvacia()) {
			Macrodistrito x=eliminar();
                        x.mostrar();
                        aux.adicionar(x);
		}
		vaciar(aux);
	}
	void vaciar(CCircularM w) {
		while(!w.esvacia())
			adicionar(w.eliminar());
	}
}
