/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software2.patterns.mvc.imp;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import software2.patterns.mvc.abst.Controlador;
import software2.patterns.mvc.abst.Evento;
import software2.patterns.mvc.abst.Modelo;
import software2.patterns.mvc.abst.Vista;

/**
 *
 * @author Ricardo
 */
public class Principal {
    
    
    public static final int LIMITE=100;
    public static final int NUMEROEVENTOS=100;
    
    
    public static void main(String[] args)
    { ArrayList<String> list=new ArrayList<String>();
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      list.add("E");
      list.add("F");
      list.add("G");
      list.add("H");
      list.add("I");
    
      Modelo modelo=new Modelo(list);
      
      //Creación de vista de barra
      Vista v1=new VistaDiagramaBarra(modelo);
      v1.inicializar();
      
      
      Vista v2=new VistaTabla(modelo);
      v2.inicializar();
      
      Vista v3=new VistaEspecial(modelo);
      v3.inicializar();
      
      Vista v4=new VistaDosPuntos(modelo);
      v4.inicializar();
      
      Controlador c1=v1.obtenerControlador();
      Controlador c2=v2.obtenerControlador();
      Controlador c3=v3.obtenerControlador();
      Controlador c4=v4.obtenerControlador();
      
       List<Controlador> cs=new ArrayList<Controlador>();
       cs.add(c1);
       cs.add(c2);
       cs.add(c3);
       cs.add(c4);
      
       List<Evento> l=new ArrayList<Evento>();
       
       int i=0;
       
       //Generación de eventos
       for(;i<NUMEROEVENTOS;i++)
       {  int k=(int) (Math.random()*list.size());
          int k1=(int) (Math.random()*LIMITE);
          
         
       }
       
       //Al finalizar tengo en la lista l 100 eventos aleatorios
       
        Iterator<Evento> it=l.iterator();
       
         while(it.hasNext())
         {
           Evento e=it.next();
           System.out.println("Evento "+e);
           //Lanzar moneda
            Controlador c=cs.get((int)(Math.random()*cs.size()));
           
            c.manejarEvento(e);
            try {
                Thread.sleep(1000+(int)(Math.random()*5000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         }
      
          
    
      
       
       
    
       
       
      
    }
    
}
