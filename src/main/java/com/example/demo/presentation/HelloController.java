package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label labelText;
    @FXML
    private Button addWordButton;
    @FXML
    private TextField translateField;

    private TranslateApi api = new TranslateApi();



    /*@FXML
    protected void addWordButton(){
        labelText.setText("Welcome!");
    }*/

    @FXML
    public void initialize() {
        addWordButton.setOnAction((e)-> {
            labelText.setText("Слово добавлено");
        });

        translateField.setOnAction((e)-> {
            String word = this.translateField.getText();
            TranslateWord translateWord = api.getTranslateWord(word);
            labelText.setText(translateWord.toString());
        });
    }
}