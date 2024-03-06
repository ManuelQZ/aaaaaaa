package co.edu.uniquindio.cliente.clienteapp.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String telefonoFijo;
    private String telefonoCelular;
    private String direccion;
    private int edad;
    private double estatura;

    public Cliente() {
    }

    public Cliente (String nombre,
                    String apellido,
                    String cedula,
                    String email,
                    String telefonoFijo,
                    String telefonoCelular,
                    String direccion,
                    int edad,
                    double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
        this.edad = edad;
        this.estatura = estatura;
    }

//    public static ClienteBuilder builder () {
//        return new ClienteBuilder();
//    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", telefonoFijo='" + telefonoFijo + '\'' +
                ", telefonoCelular='" + telefonoCelular + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }

    public void setTipoCliente(String tipoCliente) {
    }
}