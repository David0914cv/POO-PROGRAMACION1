package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class DetalleVenta {
    private int cantidad;
    private double subtotal,total;
    private List<Producto> listDetalleVentaProductos;

    public DetalleVenta(int cantidad, double subtotal, double total) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
        this.listDetalleVentaProductos = new ArrayList<>();
    }
}
