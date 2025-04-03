package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Mision {
    private String id,fecha,ubicacion;
    private boolean estado;
    private List<Soldado> listaSoldadosMision;
    private List<Vehiculo> listaVehiculosMision;

    public Mision(String id, String fecha, String ubicacion, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.listaSoldadosMision = new ArrayList<>();
        this.listaVehiculosMision = new ArrayList<>();
    }

    public void agregarSoldadoMision(Soldado soldado) {
        listaSoldadosMision.add(soldado);
    }

    public void agregarVehiculoMision(Vehiculo vehiculo) {
        listaVehiculosMision.add(vehiculo);
    }

    public String getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public List<Soldado> getListaSoldadosMision() {
        return listaSoldadosMision;
    }

    public List<Vehiculo> getListaVehiculosMision() {
        return listaVehiculosMision;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", estado=" + estado +
                ", listaSoldadosMision=" + listaSoldadosMision +
                ", listaVehiculosMision=" + listaVehiculosMision +
                '}';
    }
}
