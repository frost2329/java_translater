package com.example.demo.domain;

import com.example.demo.entity.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class TranslateInteractor implements ITranslateInteractor {
    ITranslateApi api = new TranslateApi();
    IDBApi dbApi = new DBApi();

    @Override
    public String getTranslateWord(String word) {
        return "Перевод слова будет доступен в следующей версии  :)";
    }
    @Override
    public String saveWord(String word, String translate) {
        return dbApi.addWordInDB(word, translate);
    }

    public ObservableList<TranslateWord> getTranslateWordsFromDB() {
        List<TranslateWord> wordsList = dbApi.getSavedWords();
        ObservableList<TranslateWord> words = FXCollections.observableArrayList(wordsList);
        return words;
    }
}
