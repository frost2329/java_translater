package com.example.demo.domain;

import javafx.collections.ObservableList;

public interface ITranslateInteractor {
    String getTranslateWord(String word);
    String saveWord(String word, String translate);

    ObservableList<TranslateWord> getTranslateWordsFromDB();
}
