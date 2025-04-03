package co.edu.uniquindio.poo.model;

public class TransporteTropa extends Vehiculo {
    private int capacidadSoldados;

    public TransporteTropa(String id, String modelo, String anioFabricacion, int kilometraje, EstadoOperacion estadoOperacion, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperacion);
        this.capacidadSoldados = capacidadSoldados;
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}
