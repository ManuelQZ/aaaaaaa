package co.edu.uniquindio.cliente.clienteapp.controller;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.cliente.clienteapp.model.Cliente;
import co.edu.uniquindio.cliente.clienteapp.model.ClaseCliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClienteController {

  private Cliente resultado;

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
      
      ClaseCliente tiposCliente = new ClaseCliente();

      String nombre = txtNombre.getText();

      int edad = Integer.parseInt(txtEdad.getText());
      String apellido = txtApellido.getText();
      String numeroCelular = txtCelular.getText();
      String cedula = txtCedula.getText();
      String numeroTelefono = txtTelefonoFijo.getText();

        
      if (rButtonClienteBasico.isSelected()) {
          if (nombre != null && edad != 0 && apellido != null && cedula != null) {
              System.out.println(nombre);
             resultado = tiposCliente.clienteBasic(nombre, apellido, edad, cedula);

          }
          
      } else if(rButtonClientePremium.isSelected()) {
          if (nombre != null && edad != 0 && apellido != null && cedula != null) {
             resultado = tiposCliente.clientePremium(nombre, apellido, edad, cedula, numeroTelefono);
          }

      } else if(rButtonClienteVip.isSelected()) {
          if (nombre != null && edad != 0 && apellido != null && cedula != null) {
             resultado = tiposCliente.clienteVip(nombre, apellido, edad, cedula, numeroTelefono, numeroCelular);
          }
      } else {

          txtResultado.setText("No se eligio ningun tipo de cliente");
      }
      if (resultado != null){
          txtResultado.setText(resultado.toString());
      } else {
           System.out.println(resultado);
       }

   }
}
