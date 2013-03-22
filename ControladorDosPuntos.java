/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software2.patterns.mvc.imp;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import software2.patterns.mvc.abst.Controlador;
import software2.patterns.mvc.abst.Evento;
import software2.patterns.mvc.abst.Vista;

/**
 *
 * @author 200811211872
 */
public class ControladorDosPuntos extends Controlador{

    
     public ControladorDosPuntos(Vista v)
    {
      super(v);
    }
    @Override
    public void manejarEvento(Evento v) {
      try {
            String s=v.obtenerNombre();
            BigInteger b=v.obtenerDato();
            
            this.modelo.cambiarVoto(s, b);
        } catch (ModeloExcepcion ex) {
            Logger.getLogger(ControladorDosPuntos.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    
}
