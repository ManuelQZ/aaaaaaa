package co.edu.uniquindio.cliente.clienteapp.model;

public class ClienteBuilder {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String email;
    protected String telefonoFijo;
    protected String telefonoCelular;
    protected String direccion;
    protected int edad;
    protected double estatura;


    public ClienteBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
    }


    public ClienteBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public ClienteBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public ClienteBuilder email(String email) {
        this.email = email;
        return this;
    }

    public ClienteBuilder telefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
        return this;
    }

    public ClienteBuilder telefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
        return this;
    }

    public ClienteBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public ClienteBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public ClienteBuilder estatura(double estatura) {
        this.estatura = estatura;
        return this;
    }

    public Cliente build() {
        return new Cliente (nombre,
                apellido,
                cedula,
                email,
                telefonoFijo,
                telefonoCelular,
                direccion,
                edad,
                estatura);
    }
}
