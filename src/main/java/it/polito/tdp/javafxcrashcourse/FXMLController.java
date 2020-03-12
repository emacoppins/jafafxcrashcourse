package it.polito.tdp.javafxcrashcourse;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
    void handleOk(ActionEvent event) {
    	
    	String nome = txtnome.getText();
    	String etas= txteta.getText();
    	String dialogo=null;
    	int eta=0;
    	
    	if(nome.length()==0)
    		dialogo="devi inserire il nome";
    		lbrisposta.setText(dialogo);
    	
    	try{
    		 eta= Integer.parseInt(etas);
    		
    	} catch (NumberFormatException npe) {
    		lbrisposta.setText("l eta non è un numero");
    	}
    	
    	
    	String saluto;
    	
    	if(eta<18)
    		 saluto = " ciaociao raga " + nome + "!";
    	
    	else
    		 saluto = " boonasera " + nome + "!";
    	
    	lbrisposta.setText(saluto);
   
    }

    @FXML
    void initialize() {
        assert txtnome != null : "fx:id=\"txtnome\" was not injected: check your FXML file 'scene.fxml'.";
        assert txteta != null : "fx:id=\"txteta\" was not injected: check your FXML file 'scene.fxml'.";
        assert buttonok != null : "fx:id=\"buttonok\" was not injected: check your FXML file 'scene.fxml'.";
        assert lbrisposta != null : "fx:id=\"lbrisposta\" was not injected: check your FXML file 'scene.fxml'.";

    }
}
