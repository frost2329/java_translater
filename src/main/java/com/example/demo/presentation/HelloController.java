package com.example.demo.presentation;

import com.example.demo.entity.TranslateWord;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    public ListView wordsList;
    @FXML
    public Button showWordSButton;
    @FXML
    private Label labelText;
    @FXML
    private Button addWordButton;
    @FXML
    private TextField translateField;
    @FXML
    private TextField wordField;

    private TranslatePresenter presenter;

    private boolean isWordsListVisible = false;

    @FXML
    public void initialize() {
        presenter = new TranslatePresenter();
        presenter.attachVue(this);

        wordsList.setVisible(false);

        wordField.setOnAction((e)-> {
            String word = this.wordField.getText();
            presenter.onChangeWord(word);
        });

        addWordButton.setOnAction((e)-> {
            String word = this.wordField.getText();
            String translate = this.translateField.getText();
            presenter.onAddWord(word, translate);
        });

        showWordSButton.setOnAction((e)-> {
            if (!isWordsListVisible) {
                presenter.onShowTranslateWords();
                showWordSButton.setText("Скрыть сохраненные слова");
                wordsList.setVisible(true);
                isWordsListVisible = true;
            } else {
                showWordSButton.setText("Показать сохраненные слова");
                wordsList.setVisible(false);
                isWordsListVisible = false;
            }

        });

    }

    public void showResult(String translateWord) {

        labelText.setText(translateWord);
    }
    public void showTranslateWords(ObservableList<TranslateWord> translateWords) {
        wordsList.setItems(translateWords);
    }
}