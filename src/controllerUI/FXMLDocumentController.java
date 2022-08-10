/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerUI;

import datos.Productos;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import modelo.Pila;

/**
 *
 * @author Yulean
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private WebView idWeb;

    private WebEngine webEngine;
    Pila<Productos> pilap;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
       // label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        webEngine=idWeb.getEngine();
        pilap = new Pila<>();

    }

}
