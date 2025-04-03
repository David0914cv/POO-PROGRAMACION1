package co.edu.uniquindio.poo.model;

public class Apoyo extends Vehiculo{

    private TipoFuncion tipoFuncion;

    public Apoyo(String id, String modelo, String anioFabricacion, int kilometraje, EstadoOperacion estadoOperacion, TipoFuncion tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperacion);
        this.tipoFuncion = tipoFuncion;
    }

    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }

    @Override
    public String toString() {
        return "Apoyo{" +
                "tipoFuncion=" + tipoFuncion +
                '}';
    }
}
