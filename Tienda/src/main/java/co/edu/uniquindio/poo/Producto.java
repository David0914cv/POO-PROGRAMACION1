package co.edu.uniquindio.poo;

public class Producto {
    private String nombre,codigo,categoria;
    private int precio,stock;

    public Producto(String nombre, String codigo, String categoria, int precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }
}
