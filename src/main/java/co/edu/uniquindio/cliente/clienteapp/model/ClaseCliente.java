package co.edu.uniquindio.cliente.clienteapp.model;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.clienteapp.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class ClaseCliente {

    public ClaseCliente() {
    }


    public Cliente clienteBasic(String nombre, String apellido, int edad, String cedula) {
        Cliente basic = new ClienteBuilder()
                .nombre(nombre)
                .apellido(apellido)
                .edad(edad)
                .cedula(cedula)
                .build();
        return basic;
    }
    public Cliente clientePremium (String nombre, String apellido,int edad, String cedula, String telefonoFijo){
         Cliente premium = new ClienteBuilder()
                    .nombre(nombre)
                    .apellido(apellido)
                    .edad(edad)
                    .cedula(cedula)
                    .telefonoFijo(telefonoFijo)
                    .build();
            return premium;
        }

    public Cliente clienteVip (String nombre, String apellido,int edad, String cedula, String telefonoFijo, String
        telefonoCelular){
        Cliente vip = new ClienteBuilder()
                    .nombre(nombre)
                    .apellido(apellido)
                    .edad(edad)
                    .cedula(cedula)
                    .telefonoFijo(telefonoFijo)
                    .telefonoCelular(telefonoCelular)
                    .build();
            return vip;
        }


}
