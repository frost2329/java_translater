package com.example.demo.presentation;

import com.example.demo.domain.TranslateWord;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
        wordField.clear();
        translateField.clear();

    }

    private void onShowSavedWords() {
        if (!wordsList.isVisible()) {
            presenter.onShowTranslateWords();
            showWordSButton.setText("Скрыть сохраненные слова");
            wordsList.setVisible(true);
        } else {
            showWordSButton.setText("Показать сохраненные слова");
            wordsList.setVisible(false);
        }
    }


    public void showResult(String translateWord) {
        labelText.setText(translateWord);
    }
    public void showTranslateWords(ObservableList<TranslateWord> translateWords) {
        wordsList.setItems(translateWords);
    }
}