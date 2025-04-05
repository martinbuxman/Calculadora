package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Calculadora;

public class CalculadoraController {

    private Calculadora calculadora = new Calculadora();

    @FXML
    private Label lblResultado;

    @FXML
    private Label lblPantalla;

    @FXML
    private TextField txtPrimerNumero;

    @FXML
    private TextField txtSegundoNumero;

    @FXML
    void borrarNumeros(ActionEvent event) {

        lblResultado.setText("");
        txtPrimerNumero.clear();
        txtSegundoNumero.clear();

    }

    @FXML
    void ansNumero(ActionEvent event) {
        txtPrimerNumero.clear();
        txtSegundoNumero.clear();
        txtPrimerNumero.setText(lblResultado.getText());
        lblResultado.setText("");

    }

    @FXML
    void logaritmoNaturalNumero(ActionEvent event) {
        double numero1 = Double.parseDouble(txtPrimerNumero.getText());

        double resultado = calculadora.log_natural(numero1);

        lblResultado.setText(String.valueOf(resultado));
    }

    @FXML
    void logaritmoNumero(ActionEvent event) {
        double numero1 = Double.parseDouble(txtPrimerNumero.getText());
        double numero2 = Double.parseDouble(txtSegundoNumero.getText());

        double resultado = calculadora.logaritmo(numero1,numero2);

        lblResultado.setText(String.valueOf(resultado));
    }



    @FXML
    void raizNumero(ActionEvent event) {
        double numero1 = Double.parseDouble(txtPrimerNumero.getText());
        double numero2 = Double.parseDouble(txtSegundoNumero.getText());

        double resultado = calculadora.raiz(numero1,numero2);

        lblResultado.setText(String.valueOf(resultado));

    }

    @FXML
    void potenciaNumero(ActionEvent event) {
        int numero1 = Integer.parseInt(txtPrimerNumero.getText());
        int numero2 = Integer.parseInt(txtSegundoNumero.getText());

        double resultado = calculadora.potencia(numero1,numero2);

        lblResultado.setText(String.valueOf(resultado));
    }

    @FXML
    void dividirNumeros(ActionEvent event) {
        double numero1 = Double.parseDouble(txtPrimerNumero.getText());
        double numero2 = Double.parseDouble(txtSegundoNumero.getText());

        if(numero2 == 0){
            lblResultado.setText("Error");
        }
        else{
            double resultado = calculadora.division(numero1,numero2);
            lblResultado.setText(String.valueOf(resultado));
        }
    }

    @FXML
    void multiplicarNumeros(ActionEvent event) {
        int numero1 = Integer.parseInt(txtPrimerNumero.getText());
        int numero2 = Integer.parseInt(txtSegundoNumero.getText());

        int resultado = calculadora.multiplicacion(numero1,numero2);

        lblResultado.setText(String.valueOf(resultado));
    }

    @FXML
    void restarNumeros(ActionEvent event) {
        int numero1 = Integer.parseInt(txtPrimerNumero.getText());
        int numero2 = Integer.parseInt(txtSegundoNumero.getText());

        int resultado = calculadora.resta(numero1,numero2);

        lblResultado.setText(String.valueOf(resultado));
    }

    @FXML
    void sumarNumeros(ActionEvent event) {
        int numero1 = Integer.parseInt(txtPrimerNumero.getText());
        int numero2 = Integer.parseInt(txtSegundoNumero.getText());

        int resultado = calculadora.suma(numero1,numero2);

        lblResultado.setText(String.valueOf(resultado));
    }
}
