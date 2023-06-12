package com.example.demo.domain;

import com.example.demo.entity.DBApi;
import com.example.demo.entity.TranslateApi;
import com.example.demo.entity.TranslateWord;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class TranslateInteractor implements ITranslateInteractor {
    TranslateApi api = new TranslateApi();
    DBApi dbApi = new DBApi();
    @Override
    public String getTranslateWord(String word) {
        return api.getTranslateWord(word).getTranslate();
    }
    @Override
    public String saveWord(String word, String translate) {
        return dbApi.addWordInDB(word, translate);
    }

    public ObservableList<TranslateWord> getTranslateWordsFromDB() {
        List<TranslateWord> words = new ArrayList<>();
        words.add(new TranslateWord("Слово", "Перевод"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));
        words.add(new TranslateWord("Слово2", "Перевод2"));

        ObservableList<TranslateWord> translateWords = FXCollections.observableArrayList(words);
        return translateWords;
    }
}
