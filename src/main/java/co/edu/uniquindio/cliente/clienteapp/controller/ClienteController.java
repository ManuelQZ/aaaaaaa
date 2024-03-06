package co.edu.uniquindio.cliente.clienteapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.clienteapp.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtTelefonoFijo;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextArea txtResultado;

    @FXML
    private ToggleGroup grupo1;

    @FXML
    private RadioButton rButtonClienteBasico;

    @FXML
    private RadioButton rButtonClientePremium;

    @FXML
    private RadioButton rButtonClienteVip;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    void onAgregarCliente(ActionEvent event) {
        agregarCliente();
    }

    @FXML
    void initialize() {
    }

    private void agregarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellido.getText());
        cliente.setCedula(txtCedula.getText());
        cliente.setEdad(Integer.parseInt(txtEdad.getText()));
        cliente.setTelefonoFijo(txtTelefonoFijo.getText());
        cliente.setTelefonoCelular(txtCelular.getText());
        txtResultado.setText(cliente.toString());

        ToggleGroup grupoTipoCliente = null;
        RadioButton selectedRadioButton = (RadioButton) grupoTipoCliente.getSelectedToggle();
        String tipoCliente = selectedRadioButton.getText();
        cliente.setTipoCliente(tipoCliente);

        txtResultado.setText(cliente.toString());

    }
}