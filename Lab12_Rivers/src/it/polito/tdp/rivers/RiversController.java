package it.polito.tdp.rivers;

import it.polito.tdp.rivers.exception.RiversException;
import it.polito.tdp.rivers.model.Model;
import it.polito.tdp.rivers.model.River;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RiversController {

	private Model model;
	
	public void setModel(Model model) {
		this.model = model;
		try {
			this.boxRiver.getItems().addAll(this.model.getAllRivers());
		} catch (RiversException e) {
			// TODO Auto-generated catch block
			this.txtResult.setText("Errore nel caricamento dei dati dei fiumi");
		}
	}

    @FXML
    private ComboBox<River> boxRiver;

    @FXML
    private TextField txtStartDate;

    @FXML
    private TextField txtEndDate;

    @FXML
    private TextField txtNumMeasurements;

    @FXML
    private TextField txtFMed;

    @FXML
    private TextField txtK;

    @FXML
    private Button btnSimula;

    @FXML
    private TextArea txtResult;

    @FXML
    void doSimulation(ActionEvent event) {

    }

    @FXML
    void findRiverInformations(ActionEvent event) {
    	River r = boxRiver.getValue();
    	txtStartDate.setText(r.getFirstMeasure().toString());
    	txtEndDate.setText(r.getLastMeasure().toString());
    	txtNumMeasurements.setText(String.valueOf(r.getNumberOfMeasures()));
    	txtFMed.setText(String.valueOf(r.getAverageFlow()));
    	
    }

}
