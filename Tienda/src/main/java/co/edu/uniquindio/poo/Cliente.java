package co.edu.uniquindio.poo;

public class Cliente {
    private String nombre,identificacion,direccion,telefono,email;

    /**
     * Metodo constructor de la clase
     * @param nombre
     * @param identificacion
     * @param direccion
     * @param telefono
     * @param email
     */
    public Cliente(String nombre, String identificacion, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Metodo para retornar nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para retornar email
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para retornar telefono
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Metodo para retornar direccion
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo para retornar identificacion
     * @return
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Metodo para actualizar nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo para actualizar identificacion
     * @param identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Metodo para actualizar direccion
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para actualizar telefono
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
