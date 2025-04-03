package co.edu.uniquindio.poo.model;

public class Blindado extends Vehiculo{
    private String nivelBlindaje;

    public Blindado(String id, String modelo, String anioFabricacion, int kilometraje, EstadoOperacion estadoOperacion, String nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperacion);
        this.nivelBlindaje = nivelBlindaje;
    }

    public String getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(String nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }
}
