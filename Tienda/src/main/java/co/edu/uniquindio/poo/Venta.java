package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigo,fecha;
    private double impuesto,subTotal,total;
    private Cliente cliente;
    private List<DetalleVenta> listDetalleVenta;

    public Venta(String codigo, String fecha,double impuesto,double subTotal, double total, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.subTotal = subTotal;
        this.total = total;
        this.cliente = cliente;
        this.listDetalleVenta = new ArrayList<>();
    }

    public void registrarDetalleVenta(DetalleVenta detalleVenta) {
        listDetalleVenta.add(detalleVenta);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
