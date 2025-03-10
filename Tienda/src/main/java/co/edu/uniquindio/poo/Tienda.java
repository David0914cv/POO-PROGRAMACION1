package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre,nit;
    private List<Cliente> listClientes;
    private List<Producto> listProductos;

    public Tienda(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listClientes = new ArrayList<>();
        this.listProductos = new ArrayList<>();
    }

    public Producto encontrarProducto(String codigo){
        Producto producto = null;

        for (Producto p : listProductos) {
            if (p.getCodigo().equals(codigo)) {
                producto=p;
            }
        }

        return producto;
    }



    public void registrarCliente(Cliente cliente) {
        listClientes.add(cliente);
    }

    public void registrarProducto(Producto producto) {
        listProductos.add(producto);
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
