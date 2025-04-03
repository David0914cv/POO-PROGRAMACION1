package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Batallon {

    private String codigo,nombre;
    private List<Vehiculo> listVehiculos;
    private List<Mision> listMisiones;
    private List<Soldado> listSoldados;

    public Batallon(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listVehiculos = new ArrayList<>();
        this.listMisiones = new ArrayList<>();
        this.listSoldados = new ArrayList<>();
    }

    private List<Mision> obtenerMisionesActivas(){
        List<Mision> listMisionesActivas = new ArrayList<>();

        for (Mision mision : listMisiones){

            if (mision.getEstado()){
                listMisionesActivas.add(mision);
            }
        }

        return listMisionesActivas;
    }

    public List<Vehiculo> obtenerVehiculosMision(){
        List<Vehiculo> listVehiculosMision = new ArrayList<>();
        List<Mision> listMisionesActivas = obtenerMisionesActivas();

        for (Mision mision : listMisionesActivas){

            listVehiculosMision.addAll(mision.getListaVehiculosMision());
        }

        return listVehiculosMision;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.listVehiculos.add(vehiculo);
    }

    public void agregarMision(Mision mision) {
        this.listMisiones.add(mision);
    }

    public void agregarSoldado(Soldado soldado) {
        this.listSoldados.add(soldado);
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Soldado> getListSoldados() {
        return listSoldados;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mision> getListMisiones() {
        return listMisiones;
    }

    public List<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Batallon{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listVehiculos=" + listVehiculos +
                ", listMisiones=" + listMisiones +
                ", listSoldados=" + listSoldados +
                '}';
    }
}
