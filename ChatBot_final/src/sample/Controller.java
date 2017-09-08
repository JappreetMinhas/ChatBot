package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {
    @FXML
    private TextArea response;

    @FXML
    private String abc = "";

    @FXML
    private TextField txtInput;
    @FXML
    private String message = "";


    @FXML
    public void ButtonClick(ActionEvent event) {
        if (txtInput.getText() != null) {
            response.setText(response.getText() + "\n User: " + txtInput.getText());
            abc = txtInput.getText();
            response.setText(response.getText() + "\n System: " + SystemOut(abc));
            txtInput.setText("");
        }
    }
    @FXML
    public void Input(KeyEvent event){
        if(event.getCode() == KeyCode.ENTER) {
            response.setText(response.getText() + "\n User: " +  txtInput.getText());
            abc = txtInput.getText();
            response.setText(response.getText() + "\n System: " + SystemOut(txtInput.getText()));
            txtInput.setText("");
        }
    }

    @FXML
    private String SystemOut(String abc){
        String str = abc.toLowerCase();
        Random rn = new Random();
        int max = 5;
        int min = 1;
        int rand = rn.nextInt(max) + min;
        if(str.equals("hi")||str.equals("hello")||str.equals("hey")||str.equals("hi!")||str.equals("hey!")||str.equals("hola")||str.equals("yo")){
            String[] a = {"hey","hello","hi","Yo","Hola!"};
            return a[rand];
        }
        else if(str.equals("where do you live?")||str.equals("where you live.")||str.equals("where do you live")||str.equals("where ")||str.equals("hey!")||str.equals("hola")||str.equals("yo")){
            String[] a = {"In Computer Memory","In CPU","In Virtual World","In Silicon","In Virtual World"};
            return a[rand];
        }

        else if(str.equals("Who are you")||str.equals("who are you?")||str.equals("who are u")||str.equals("who r u")||str.equals("who r u?")||str.equals("who are u?")||str.equals("whats your name")||str.equals("whats ur name")||str.equals("whats your name?")){
            String[] a = {"I'm ChatBot","I'm ChatBot.","Chatbot","ChatBot","myself Chatbot!"};
            return a[rand];
        }

        if (str.equals("how are you?")||str.equals("how you doin?")||str.equals("how have you been?")){
            String[] a = {"I'm fine. Thank you!","I'm good.","I'm fine.","I'm well","I'm stuck inside a computer system, so... good"};
            return a[rand];
        }
        if(str.equals("what's up?")||str.equals("whats up?")||str.equals("whats going on")||str.equals("whats up")||str.equals("what's up")){
            String[] a = {"Nothing much.","Chilling",""};
            return a[rand];
        }
        if(str.equals("help me.")||str.equals("help.")||str.equals("help")||str.equals("help me")||str.equals("please help")){
            String[] a = {"Still working on server","Still working on server","Still working on server","Still working on server","Still working on server"};
            return a[rand];
        }


        return "I don't know what you're saying.";
    }


}
