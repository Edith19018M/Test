/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author Desktop
 */
public class CSimpleZ {
    private int max=20;
    private Zona v[]=new Zona[max+1];
    private int ini,fin;

    CSimpleZ()
    {
        ini=fin=0;
    }
    boolean esvacia ()
    {
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (fin == max)
	    return (true);
	return (false);
    }
    int nroelem ()
    {
	return (fin - ini);
    }
    void adicionar (Zona elem)
    {
	if (!esllena ())
	{
	    fin++;         //v[fin+1]=elem
	    v [fin] = elem;  //fin=fin+1
	}
	else
	    System.out.println ("Cola Simple llena");
    }
    Zona eliminar ()
    {
    	Zona elem = null;
	if (!esvacia ())
	{
	    ini++;
	    elem = v [ini];
	    if (ini == fin)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola Simple vacia");
	return (elem);
    }
    void mostrar ()
    {
	if (esvacia ())
	    System.out.println ("Cola vacia");
	else
	{
	    CSimpleZ aux = new CSimpleZ ();
	    while (!esvacia ())
	    {
		Zona elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    void llenar1(int n) {
	for (int i = 0; i < n; i++) {
            Zona x=new Zona();
            x.leer1();
            adicionar(x);
	}
    }
    void llenar2(int n) {
	for (int i = 0; i < n; i++) {
            Zona x=new Zona();
            x.leer1();
            adicionar(x);
	}
    }
    void vaciar (CSimpleZ a)
    {
            while (!a.esvacia ())
                adicionar (a.eliminar ());

    }

}
