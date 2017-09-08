package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private TextArea response;

    @FXML
    private String

    @FXML
    private TextField txtInput;
    @FXML
    private String message = "";


    @FXML
    public void ButtonClick(ActionEvent event) {
        if (txtInput.getText() != null) {
            response.setText(response.getText() + "\n User: " + txtInput.getText());
            txtInput.setText("");
        }
    }
    @FXML
    public void Input(KeyEvent event){
        if(event.getCode() == KeyCode.ENTER) {
            response.setText(response.getText() + "\n User: " +  txtInput.getText());
            txtInput.setText("");
        }
    }




}
