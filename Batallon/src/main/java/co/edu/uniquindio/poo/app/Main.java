package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

public class Main {
    public static void main(String[] args) {

        Batallon batallon = new Batallon("123", "Batallon 1 Armenia");

        //vehiculos creados


        Vehiculo vehiculoTransporte1= new TransporteTropa("p1","2007","2005",20000, EstadoOperacion.DISPONIBLE,80);
        Vehiculo vehiculoTransporte2= new TransporteTropa("p11","2007","2005",20000, EstadoOperacion.DISPONIBLE,80);
        Vehiculo vehiculoBlindado1= new Blindado("p2","2015","2014",8000, EstadoOperacion.DISPONIBLE,"alto");
        Vehiculo vehiculoBlindado2= new Blindado("p22","2015","2014",8000, EstadoOperacion.DISPONIBLE,"alto");
        Vehiculo vehiculoApoyo1= new Apoyo("p3","2004","2003",50000, EstadoOperacion.DISPONIBLE,TipoFuncion.MEDICO);
        Vehiculo vehiculoApoyo2= new Apoyo("p33","2004","2003",50000, EstadoOperacion.DISPONIBLE,TipoFuncion.MEDICO);

        //Soldados creados

        Soldado soldado1=new Soldado("009","Juan");
        Soldado soldado2=new Soldado("011","Pedro");
        Soldado soldado3=new Soldado("022","Ruiz");

        //Misiones creados

        Mision mision1=new Mision("m1","02/04/2025","Catatumbo",true);
        Mision mision2=new Mision("m2","29/03/2025","Popayan",true);

        batallon.agregarMision(mision1);
        batallon.agregarMision(mision2);
        batallon.agregarSoldado(soldado1);
        batallon.agregarSoldado(soldado2);
        batallon.agregarSoldado(soldado3);
        batallon.agregarVehiculo(vehiculoBlindado1);
        batallon.agregarVehiculo(vehiculoBlindado2);
        batallon.agregarVehiculo(vehiculoApoyo1);
        batallon.agregarVehiculo(vehiculoApoyo2);
        batallon.agregarVehiculo(vehiculoTransporte1);
        batallon.agregarVehiculo(vehiculoTransporte2);
        mision1.agregarVehiculoMision(vehiculoBlindado1);
        mision1.agregarVehiculoMision(vehiculoTransporte1);
        System.out.println(batallon.obtenerVehiculosMision());
    }
}