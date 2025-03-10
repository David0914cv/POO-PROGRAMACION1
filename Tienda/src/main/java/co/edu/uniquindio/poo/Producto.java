package co.edu.uniquindio.poo;

public class Producto {
    private String nombre,codigo,categoria;
    private int stock;
    private double precio;

    public Producto(String nombre, String codigo, String categoria, int stock,double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto\n{" +
                "\nnombre='" + nombre + '\'' +
                ", \ncodigo='" + codigo + '\'' +
                ", \ncategoria='" + categoria + '\'' +
                ", \nstock=" + stock +
                ", \nprecio=" + precio +
                '}';
    }
}
