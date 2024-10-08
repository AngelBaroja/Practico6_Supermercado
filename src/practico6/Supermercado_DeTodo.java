/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico6;

import java.util.TreeSet;

/**
 *
 * @author El Angel
 */
public class Supermercado_DeTodo {
   public static TreeSet<Producto> listaProductos= new TreeSet();

    public Supermercado_DeTodo() {
    }
    
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
    
    public void eliminarProducto(Producto producto){
        listaProductos.remove(producto);
    }
    
    public static Producto buscarXcodigo(int codigo){
        Producto producto=null;
        for (Producto listaProducto : listaProductos) {
            if (codigo==listaProducto.getCodigo()) {
                producto=listaProducto;
                break;
            }
        }
        return producto;
    }
    
    public static TreeSet<Producto> buscarXprecio(int minimo, int maximo){
        TreeSet<Producto> listaPrecio=new TreeSet();
        for (Producto listaProducto : listaProductos) {
            if (listaProducto.getPrecio()<=maximo && listaProducto.getPrecio()>=minimo) {
                listaPrecio.add(listaProducto);
            }
        }
        return listaPrecio;
    }
    
     public static TreeSet<Producto> buscarXnombre(String descripcion){
        TreeSet<Producto> listaNombre=new TreeSet();
        descripcion=descripcion.toLowerCase();
        for (Producto listaProducto : listaProductos) {
            String descripcionProducto=listaProducto.getDescripcion().toLowerCase();
            if (descripcionProducto.contains(descripcion)) {
                listaNombre.add(listaProducto);
            }
        }
        return listaNombre;
    }
     
    public static TreeSet<Producto> buscarXrubro(String rubro){
        TreeSet<Producto>listaRubro=new TreeSet();
        for (Producto listaProducto : listaProductos) {
            if (listaProducto.getRubro().equalsIgnoreCase(rubro)) {
                listaRubro.add(listaProducto);
            }
        }
        return listaRubro;
    }
    
     public void actualizar(Producto producto){        
        for (Producto listaProducto : listaProductos) {
            if (producto.getCodigo()==listaProducto.getCodigo()) {
                listaProductos.remove(listaProducto);
                break;
            }
        }
        listaProductos.add(producto);        
    }
    
}
