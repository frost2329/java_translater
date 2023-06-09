package com.example.demo.presentation;

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
    @FXML
    private TextField wordField;

    private TranslatePresenter presenter;

    @FXML
    public void initialize() {
        presenter = new TranslatePresenter();
        presenter.attachVue(this);

        wordField.setOnAction((e)-> {
            String word = this.wordField.getText();
            presenter.onChangeWord(word);
        });

        addWordButton.setOnAction((e)-> {
            String word = this.wordField.getText();
            String translate = this.translateField.getText();
            presenter.onAddWord(word, translate);
        });
    }

    public void showResult(String translateWord) {
        labelText.setText(translateWord);
    }
}