/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico6;

import Jframe.PantallaPrincipal;

/**
 *
 * @author El Angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1 =new Producto(100, "Perfume++", 154.15  , "Perfume", 15);
        Producto p2 =new Producto(102, "Ace", 200.15  , "Limpieza", 50);
        Supermercado_DeTodo.listaProductos.add(p1);
        Supermercado_DeTodo.listaProductos.add(p2);
        PantallaPrincipal pp=new PantallaPrincipal();
      
        pp.repaint();
        
        pp.setVisible(true);
        
    }
    
}
