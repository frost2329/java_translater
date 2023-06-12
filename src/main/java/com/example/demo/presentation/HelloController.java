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
    private TextField wordField;
    @FXML
    private TextField translateField;
    @FXML
    private Label labelText;
    @FXML
    private Button addWordButton;
    @FXML
    public Button showWordSButton;
    @FXML
    public ListView wordsList;


    private TranslatePresenter presenter;
    private boolean isWordsListVisible = false;

    @FXML
    public void initialize() {
        presenter = new TranslatePresenter();
        presenter.attachVue(this);
        wordsList.setVisible(false);

        wordField.setOnAction((e)->onChangeTextWord());
        addWordButton.setOnAction((e)->onAddWord());
        showWordSButton.setOnAction((e)->onShowSavedWords());
    }
    private void onChangeTextWord() {
        String word = wordField.getText();
        presenter.onChangeWord(word);
    }

    private void onAddWord() {
        String word = wordField.getText();
        String translate = translateField.getText();
        presenter.onAddWord(word, translate);
        showWordSButton.setText("Показать сохраненные слова");
        wordsList.setVisible(false);
        isWordsListVisible = false;
        wordField.clear();
        translateField.clear();

    }

    private void onShowSavedWords() {
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
    }


    public void showResult(String translateWord) {
        labelText.setText(translateWord);
    }
    public void showTranslateWords(ObservableList<TranslateWord> translateWords) {
        wordsList.setItems(translateWords);
    }
}