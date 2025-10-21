/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author Student
 */
public class ProductoFactory {

    public Producto CrearProducto(String codigo, String nombre, double precio, int stock, Categoria categoria) {
        return new Producto(codigo,nombre,precio,stock,categoria);
    }
    
}
