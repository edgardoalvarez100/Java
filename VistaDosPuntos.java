/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software2.patterns.mvc.imp;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import software2.patterns.mvc.abst.Controlador;
import software2.patterns.mvc.abst.Modelo;
import software2.patterns.mvc.abst.Vista;


public class VistaDosPuntos extends Vista {

    public Vista2Puntos(Modelo m) {
        super(m);

    }

    @Override
    protected void dibujar() {
        System.out.println("Mostrar datos Dos Puntos");
        Modelo m = this.obtenerModelo();
        Map map = m.obtenerMapa();
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s);
            System.out.print("::::::::::::::::" + map.get(s));
            System.out.println();
        }

    }

    @Override
    protected Controlador construirControlador() {
        return new ControladorDosPuntos(this);
    }
}
