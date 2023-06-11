/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoescuelas;

/**
 *
 * @author SARITA COPA
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //planes alternativas y especial
        LSimpleP p1=new LSimpleP();
        LSimpleP p2=new LSimpleP();
        LSimpleP p3=new LSimpleP();
        PlanEstudio pe1=new PlanEstudio("Desarrollo físico y psicomotor.");
        PlanEstudio pe2=new PlanEstudio("Atención educativa de alumnos con problemas de comunicación.");
        PlanEstudio pe3=new PlanEstudio("Enseñanza del español y matemáticas en la educación básica.");
        PlanEstudio pe4=new PlanEstudio("Desarrollo social y afectivo.");
        PlanEstudio pe5=new PlanEstudio("Planeación de la enseñanza y evaluación del aprendizaje.");
        PlanEstudio pe6=new PlanEstudio("Neurobiología del desarrollo.");
        p2.adiFinal(pe1);
        p2.adiFinal(pe2);
        p2.adiFinal(pe3);
        p3.adiFinal(pe4);
        p3.adiFinal(pe5);
        p3.adiFinal(pe6);
        LSimpleP p4=new LSimpleP();
        PlanEstudio pe7=new PlanEstudio("Área de Ciencias:");
        PlanEstudio pe8=new PlanEstudio("Área de Humanidades:");
        PlanEstudio pe9=new PlanEstudio("Área de Matemáticas:");
        PlanEstudio pe10=new PlanEstudio("Área de Artes y Creatividad:");
        p4.adiFinal(pe10);
        p4.adiFinal(pe9);
        p4.adiFinal(pe8);
        p4.adiFinal(pe7);
        LSimpleP p5=new LSimpleP();
        p5.adiFinal(pe10);
        p5.adiFinal(pe9);
        p5.adiFinal(pe8);
        //villa fatima
       Informacion inv3= new Informacion("adolecentes de 12 a 18 años","mañana y tarde",0,"primario 6 años-secundario 6años",5,p5);
       Institucion iv3=new Institucion("U.E. Nuestra Señora de Fátima","C/ Jumilla, 6, 46018 Valencia","Regular",72820880,inv3);
      
       Informacion inv1= new Informacion("niños, adolecentes","mañana y tarde",140,"2 años",5,p3);
       
       Institucion iv1=new Institucion("Centro de Apoyo para la Inclusión Effetá"," Guerrilleros Lanza, #1147","Especial",72586453,inv1);
       LDobleI liv=new LDobleI();
       liv.adiPrincipio(iv3);
       liv.adiFinal(iv1);
       
       LDobleI li1=new LDobleI();
       
       //SAN SEBASTIAN
       
       LDobleI lin1=new LDobleI();
       Informacion inf11= new Informacion("adolecentes de 12 a 18 años","mañana",0,"secundario 6años",5,p2);
       Institucion in11=new Institucion("VENEZUELA C","C. Jenaro Sanjines # 618","Regular",240611,inf11);
       Informacion inf12= new Informacion("niños y adolecentes","mañana y tarde",500,"4 años",3,p3);
       Institucion in12=new Institucion("INS Sedes Sapientiae","Avenida Armentia","Especial",77979026,inf12);
       Informacion inf13= new Informacion("niños, adolecentes","mañan y tarde",1100,"6 años",5,p2);
       Institucion in13=new Institucion("COLEGIO SAN ANTONIO DE PADUA","Calle Chuquisaca # 530","Regular",2460664,inf13);
       lin1.adiPrincipio(in11);
       lin1.adiFinal(in12);
       lin1.adiFinal(in13);
       
       //MIRAFLORES  
       LSimpleP pm1=new LSimpleP();
       
       LDobleI lin2=new LDobleI();
       Informacion inf21= new Informacion("niños y adolecentes","mañana y tarde",0,"primario 6 años-secundario 6años",4,pm1);
       Institucion in21=new Institucion("Boliviano Noruego","Calle Panamá # 1461 Esq. Bush","Regular",591-2-224404,inf21);
       Informacion inf22= new Informacion("niños, adolecentes y adultos","mañana,tarde y noche",0,"3 años",4,p5);
       Institucion in22=new Institucion("ESA","Av. Carrasco Final s/n","Alternativa",79590666,inf22);
       lin2.adiPrincipio(in21);
       lin2.adiFinal(in22);
       
       //ARANJUEZ
       LDobleI lin3=new LDobleI();
       Informacion inf31 =new Informacion("Niños y Adolecentes","mañana y tarde",0,"12años",3,pm1);
       Institucion in31=new Institucion("Mallasa"," AV. EL AGRARIO","Regular",32543655,inf31);
       lin3.adiFinal(in31);
       
       //Bajo tejar
       
       LDobleI lin4=new LDobleI();
       Informacion inf41= new Informacion("adolecentes de 12 a 18 años","mañana y tarde",0,"12 años",5,p3);
       Institucion in41=new Institucion("Colegio Holanda","Av. Entre Rios # 1172","Regular",71997040,inf41);      
       Informacion inf42= new Informacion("niños, adolecentes","mañan y tarde",1100,"6 años",5,p5);
       Institucion in42=new Institucion("CENTRO INFANTIL OVEJITAS DE JESUS","Calle Juana Gorriti N° 457","Alternativa",71219781,inf42);      
       lin4.adiPrincipio(in41);
       lin4.adiFinal(in42);
       lin4.adiFinal(in41);
       
       //delicias
       
       LDobleI lin5=new LDobleI();
       Informacion ind3= new Informacion("adolecentes de 12 a 18 años","mañana y tarde",330,"primario 6 años-secundario 6años",5,p4);
       Institucion id3=new Institucion("Unidad Educativa Las Delicias Prof. Jaime Escalante","Av. 3 de Mayo ","Regular",77577379,ind3);
       Informacion ind1= new Informacion("niños, adolecentes","mañana y tarde",500,"2 años",4,p4);
       Institucion id1=new Institucion("MANQ'A","Alto las delicias","Alternativa",78894078,ind1);      
       lin5.adiPrincipio(id3);
       lin5.adiFinal(id1);

       
       //Villa Fatima
        LDobleI lin8=new LDobleI();
        Informacion inc181 =new Informacion("Adolecentes","mañana,tarde y noche",2500,"6años",3,pm1);
        Institucion i81=new Institucion("Colegio nuestra Señora de Fatima","C.Virgen de la Concepcion","Regular",34364555,inc181);
        Informacion inc182 =new Informacion("Adolecentes","mañana,tarde y noche",2500,"6años",4,p4);
        Institucion i82=new Institucion("Colegio Alfredo Vargas","Av,Benigno Loza","Alternativa",34394045,inc182);
        Informacion inc183 =new Informacion("Adolecentes","mañana,tarde y noche",2500,"6años",2,pm1);
        Institucion i83=new Institucion("Unidad Educativa Adventista","C.Rep Cuba","Regular",34324645,inc183);
        Informacion inc184 =new Informacion("Adolecentes","mañana,tarde y noche",2500,"6años",1,pm1);
        Institucion i84=new Institucion("Colegio Boliviano Aleman Ave Maria","Av.Ramiro Castillo","Regular",34364777,inc184);
        Informacion inc185 =new Informacion("Adolecentes","mañana,tarde y noche",2500,"6años",3,p5);
        Institucion i85=new Institucion("Colegio Experimental Hugo Dabila","C. Fransisco de Miranda Final","Alternativa",34364888,inc185);
        Informacion inc186 =new Informacion("Adolecentes","mañana,tarde y noche",2500,"6años",5,p2);
        Institucion i86=new Institucion("Centro De apoyo para la inclucion","C.Guerrillos Lanza","Especial",34364999,inc186);
        lin8.adiPrincipio(i81);
        lin8.adiFinal(i82);
        lin8.adiFinal(i83);
        lin8.adiFinal(i84);
        lin8.adiFinal(i85);
        lin8.adiPrincipio(i86);
        
        //Villa Armando
        LDobleI li4 =new LDobleI();
        Informacion inc91 =new Informacion("Adolecentes y Niños","tarde y noche",0,"12años",3,pm1);
        Institucion i91=new Institucion("Unidad Educativa Fernando Bravo Fe","C.Phigo","Regular",38759436,inc91);
        li4.adiPrincipio(i91);
        
        //Alto Obrajes
        LDobleI li5 =new LDobleI();
        Informacion inc101 =new Informacion("Niños y Adolecentes","mañana y tarde",0,"12años",5,pm1);
        Institucion i101=new Institucion("Unidad Educativa IV Centerio","Av.Rene Camacho","Regular",38739230,inc101);
        Informacion inc102 =new Informacion("Adolecentes","mañana",789,"6años",5,pm1);
        Institucion i102=new Institucion("San Ignacio","Av.Hugo ernst River 7050","Regular",38739230,inc102);
        Informacion inc103 =new Informacion("Adolecentes","mañana",2484,"6años",4,pm1);
        Institucion i103=new Institucion("San Ignacio","Av.Hugo ernst River 7050","Regular",38732424,inc103);
        Informacion inc104 =new Informacion("Adolecentes con discapcidad Cognitiva","mañana",569,"4años",3,p2);
        Institucion i104=new Institucion("CEE ADAPTACION","Av.Hector Ormachea","Especial",38734654,inc104);
        li5.adiFinal(i104);
        li5.adiFinal(i103);
        li5.adiFinal(i102);
        li5.adiFinal(i101);
        
        //Irpavi
        LDobleI li6 =new LDobleI();
        Informacion inc111 =new Informacion("Niños y Adolecentes","mañana y tarde",0,"12años",5,pm1);
        Institucion i111=new Institucion("Unidad Educativa FEPPA-San Ignacio","Av.Hugo Esnest Rivera","Regular",33465876,inc111);
        Informacion inc112 =new Informacion("Adolecentes","mañana y tarde",1350,"6años",4,pm1);
        Institucion i112=new Institucion("Colegio Rose Marie de Barientes","C.6 de Irpavi,Pablo Caballero","Regular",38354655,inc112);
        Informacion inc113 = new Informacion("Adolecentes","mañana y tarde",2200,"3año",5,p4);
        Institucion i113 = new Institucion("Escuela de Padres","Ruiseñor 12","Alternativa",387334545,inc113);
        li6.adiPrincipio(i111);
        li6.adiPrincipio(i112);
        li6.adiPrincipio(i113);
        
       Zona z1= new Zona("San Sebastian",lin1);
       Zona z2= new Zona("Miraflores",lin2);
       Zona z3= new Zona("Aranjuez",lin3);
       Zona z5= new Zona("Bajo tejar",lin4);
       Zona z7= new Zona("Delicias",lin5);
       Zona z8= new Zona("Villa Fatima",lin8);
       Zona z10= new Zona("Villa Armando",li4);
       Zona z11= new Zona("Alto Obrajes",li5);
       Zona z12= new Zona("Irpavi",li6);
       
       CSimpleZ cz1=new CSimpleZ();
       cz1.adicionar(z1);
       cz1.adicionar(z2);
       
       CSimpleZ cz2=new CSimpleZ();
       cz2.adicionar(z3);
       
       CSimpleZ cz3=new CSimpleZ();      
       cz3.adicionar(z5);
       
       CSimpleZ cz4=new CSimpleZ();
       cz4.adicionar(z7);
       cz4.adicionar(z8);
       
       CSimpleZ cz5=new CSimpleZ();
       cz5.adicionar(z10);
       
       CSimpleZ cz6=new CSimpleZ();
       cz6.adicionar(z11);
       cz6.adicionar(z12);
       
       Macrodistrito m1= new Macrodistrito("CENTRO",cz1);
       Macrodistrito m2= new Macrodistrito("MALLASA",cz2);
       Macrodistrito m3= new Macrodistrito("MAXPAREDES",cz3);
       Macrodistrito m4= new Macrodistrito("PERIFERICA",cz4);
       Macrodistrito m5= new Macrodistrito("SAN ANTONIO",cz5);
       Macrodistrito m6= new Macrodistrito("SUR",cz6);
       
       CCircularM ccm=new CCircularM();
       ccm.adicionar(m1);
       ccm.adicionar(m2);
       ccm.adicionar(m3);
       ccm.adicionar(m4);
       ccm.adicionar(m5);
       ccm.adicionar(m6);
       ccm.mostrar();
       //ejercicio1
       //buscar  si existen institucione con un costo menor a x enla zona y 
       //si existen mostrar las instituciones 
       
       buscarInstituciones(ccm,200,"Miraflores");
        System.out.println("..........");
        contarInstituciones(ccm,"CENTRO");
        //verificar si existe la institución  con nombre x  , 
        //si existe entonces mostrar la ubicacion donde se encuentra el numero de contacto de la misma
        //isiste eszte?
         System.out.println("..........");
         verificar(ccm,"xxx");
    }
    
    private static void buscarInstituciones(CCircularM ccm, int x, String y) {
        int n= ccm.nroelem();
        int c=0;
        for (int k = 0; k < n; k++) {     
            Macrodistrito mx = ccm.eliminar();
            CSimpleZ cx=mx.getCz();
            int nn=cx.nroelem();
            for (int j = 0; j < nn; j++) {    
                Zona zx = cx.eliminar();
                if(zx.getNombre().equals(y)){
                    LDobleI li=zx.getLi();
                    
                    NodoI ix=li.getP();
                    while(ix!=null){
                        if(ix.getI().getIn().getCosto()<=x){
                            String nom=ix.getI().getNombre();
                            System.out.println(nom+" "+"con un costo de:"+ix.getI().getIn().getCosto());
                            c++;
                        }
                        ix=ix.getSig();
                    }
                }
                cx.adicionar(zx);
            }
            ccm.adicionar(mx);
        }
        if(c==0){
            System.out.println("no existen");
        }
        

    }
    private static void contarInstituciones(CCircularM ccm, String x) {
        int n= ccm.nroelem();
        for (int k = 0; k < n; k++) {     
            Macrodistrito mx = ccm.eliminar();
            if(mx.getNombre().equals(x)){
                CSimpleZ cx=mx.getCz();
                int nn=cx.nroelem();
                for (int j = 0; j < nn; j++) {    
                    Zona zx = cx.eliminar();
                    int cd=contarPrivadasPublicas(zx.getLi().getP());
                    
                    System.out.println(cd);
                   
                    cx.adicionar(zx);
                }
            }

            ccm.adicionar(mx);
        }
       
    }

    private static int contarPrivadasPublicas(NodoI p) {
       if(p!=null){
           if(p.getI().getIn().getCosto()==0 || p.getI().getIn().getCosto()>0){
               return contarPrivadasPublicas(p.getSig())+1;
           }
           return contarPrivadasPublicas(p.getSig());
       }
       else{
           return 0;
       }
    }

    private static void verificar(CCircularM ccm, String x) {
        int n= ccm.nroelem();
        int c=0;
        for (int k = 0; k < n; k++) {     
            Macrodistrito mx = ccm.eliminar();
            CSimpleZ cx=mx.getCz();
            int nn=cx.nroelem();
            for (int j = 0; j < nn; j++) {    
                Zona zx = cx.eliminar();
               
                    LDobleI li=zx.getLi();
                    
                    NodoI ix=li.getP();
                    while(ix!=null){
                        if(ix.getI().getNombre().equals(x)){
                            String nom=ix.getI().getNombre();
                            System.out.println(nom+" "+"ubicacon: "+ix.getI().getDireccion()+" "+"numero"+ix.getI().getContactos());
                            c++;
                        }
                        ix=ix.getSig();
                    }
                
                cx.adicionar(zx);
            }
            ccm.adicionar(mx);
        }
        if(c==0){
            System.out.println("no existen");
        }
        

    }
    
 
}
