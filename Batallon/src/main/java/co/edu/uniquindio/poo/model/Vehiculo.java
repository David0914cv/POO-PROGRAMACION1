package co.edu.uniquindio.poo.model;

public class Vehiculo {

    private String id,modelo,anioFabricacion;
    private int kilometraje;
    private EstadoOperacion estadoOperacion;

    public Vehiculo(String id, String modelo, String anioFabricacion, int kilometraje,EstadoOperacion estadoOperacion) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperacion = estadoOperacion;
    }

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public EstadoOperacion getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setEstadoOperacion(EstadoOperacion estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion='" + anioFabricacion + '\'' +
                ", kilometraje='" + kilometraje + '\'' +
                ", estadoOperacion=" + estadoOperacion +
                '}';
    }
}
