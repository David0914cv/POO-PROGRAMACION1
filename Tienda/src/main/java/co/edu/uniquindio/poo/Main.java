package co.edu.uniquindio.poo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tienda tienda1=new Tienda("Tienda del Quindio","123");
        int opcion =0;
        while(opcion!=20){
            opcion= Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones:\n" +
                    "1.Crear Cliente:\n" +
                    "2.Crear Producto:\n" +
                    "3.Realizar compra:\n" +
                    "4.Consultar Clientes:\n" +
                    "5.Consultar Clientes:\n"));

            if (opcion==1){
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Cliente");
                String identificacion = JOptionPane.showInputDialog("Ingrese el identificacion del Cliente");
                String direccion = JOptionPane.showInputDialog("Ingrese el direccion del Cliente");
                String telefono = JOptionPane.showInputDialog("Ingrese el telefono de Cliente");
                String email = JOptionPane.showInputDialog("Ingrese el email de Cliente");

                Cliente cliente = new Cliente(nombre,identificacion,direccion,telefono,email);

                tienda1.registrarCliente(cliente);

                JOptionPane.showMessageDialog(null,"Cliente registrado correctamente");

            } else if (opcion==2){
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Producto");
                String codigo = JOptionPane.showInputDialog("Ingrese el codigo del Producto");
                String categoria = JOptionPane.showInputDialog("Ingrese la categoria del producto del Producto");
                int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del Producto"));
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del Producto"));

                Producto producto = new Producto(nombre,codigo,categoria,stock,precio);

                tienda1.registrarProducto(producto);
                JOptionPane.showMessageDialog(null,"Producto registrado correctamente");

            } else if (opcion==3) {
                boolean estadoCompra=true;
                while(estadoCompra){
                    String idProducto = JOptionPane.showInputDialog("Ingrese el id del Producto a comprar");
                    Producto productoEncontrado =tienda1.encontrarProducto(idProducto);
                    if (productoEncontrado==null){
                        JOptionPane.showMessageDialog(null,"El producto no existe");
                    }else {
                        int bandera=1;

                        Venta venta= new Venta("123","24/07/2025",20,0,0,tienda1.getListClientes().get(0));
                        while (bandera!=0){
                            int cantidadProducto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del Producto a comprar"));
                            double subTotal=productoEncontrado.getPrecio();
                            double total=productoEncontrado.getPrecio()*cantidadProducto;

                            DetalleVenta detalleVenta = new DetalleVenta(cantidadProducto,subTotal,total);
                            venta.registrarDetalleVenta(detalleVenta);
                        }


                    }
                }

            }else if (opcion==4){
                JOptionPane.showMessageDialog(null,"Lista de clientes:\n"+tienda1.getListClientes());
            } else if (opcion==5) {
                JOptionPane.showMessageDialog(null,"Lista de productos:\n"+tienda1.getListProductos());
            }

        }
    }
}