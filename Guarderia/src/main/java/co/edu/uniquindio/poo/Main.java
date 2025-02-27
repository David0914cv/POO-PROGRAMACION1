package co.edu.uniquindio.poo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Pequeños Gigantes");

        int opcion = 0;

        while (opcion != 8) {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("\n Menu interativo de la guarderia" +
                    "\n1. Agregar Niño"+
                    "\n2. Eliminar Niño"+
                    "\n3. Actualizar Niño"+
                    "\n4. Mostrar lista de Niños"+
                    "\n5. Mostrar nombre niño con más vocales"+
                    "\n6. Mostrar nombre niño palindromo"+
                    "\n7. Mostrar nombre niño con más consonantes"+
                    "\n8. Salir"+
                    "\nSelecciona una opcion: "));

            //----------------------------------

            if(opcion == 1) {

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Niño");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Niño"));
                String genero = JOptionPane.showInputDialog("Ingrese el genero del Niño");
                String documento = JOptionPane.showInputDialog("Ingrese el documento del Niño");
                String alergia = JOptionPane.showInputDialog("Ingrese la alergia del Niño");
                String acudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente del Niño");
                String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el numero de contacto del acudiente del Niño");
                String ID = JOptionPane.showInputDialog("Ingrese el ID del Niño");

                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, acudiente, contactoAcudiente, ID);
                guarderia.almacenarNinios(ninio);

            } else if (opcion == 2) {
                String IDEliminarNinio = JOptionPane.showInputDialog("Ingrese ID del Niño a elimianr: ");
                guarderia.eliminarNinio(IDEliminarNinio);
            } else if (opcion == 3) {

                String IDActualizar = JOptionPane.showInputDialog("Ingrese el ID del Niño a actualizar: ");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Niño a actualizar: ");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Niño a actualizar: "));
                String genero = JOptionPane.showInputDialog("Ingrese el genero del Niño a actualizar: ");
                String documento = JOptionPane.showInputDialog("Ingrese el documento del Niño a actualizar: ");
                String alergia = JOptionPane.showInputDialog("Ingrese la alergia del Niño a actualizar: ");
                String acudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente del Niño a actualizar: ");
                String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el numero de contacto del acudiente del Niño a actualizar: ");
                String ID = JOptionPane.showInputDialog("Ingrese el ID del Niño a actualizar: ");

                Ninio ninio = new Ninio(nombre, edad, genero, documento, alergia, acudiente, contactoAcudiente, ID);
                guarderia.actualizarNinio(IDActualizar, ninio);
            } else if (opcion == 4) {
                JOptionPane.showMessageDialog(null,"Mostrar la lista de niños almacenados: ");

                for(Ninio ninio : guarderia.getListNinios()){
                    JOptionPane.showMessageDialog(null,ninio);
                }
            } else if (opcion == 8) {
                JOptionPane.showMessageDialog(null,"Chaooo pues.............. ");
                break;
            } else if (opcion == 5) {
                JOptionPane.showMessageDialog(null,"El nombre del niño con más vocales es: "+guarderia.determinarMayorVocales().getNombres());
            } else if (opcion == 6) {
                JOptionPane.showMessageDialog(null,"El nombre del niño con nombre palindromo es: "+guarderia.reconocerPalindromo().getNombres());
            } else if (opcion == 7) {
                JOptionPane.showMessageDialog(null,"El nombre del niño con más consonantes es: "+guarderia.determinarMayorConsonantes().getNombres());
            } else {
                JOptionPane.showMessageDialog(null,"Opcion no valida");
            }
        }


    }
}