package it.polito.tdp.javafxcrashcourse;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txteta;

    @FXML
    private Button buttonok;

    @FXML
    private Label lbrisposta;

    @FXML
    void initialize() {
        assert txtnome != null : "fx:id=\"txtnome\" was not injected: check your FXML file 'scene.fxml'.";
        assert txteta != null : "fx:id=\"txteta\" was not injected: check your FXML file 'scene.fxml'.";
        assert buttonok != null : "fx:id=\"buttonok\" was not injected: check your FXML file 'scene.fxml'.";
        assert lbrisposta != null : "fx:id=\"lbrisposta\" was not injected: check your FXML file 'scene.fxml'.";

    }
}
