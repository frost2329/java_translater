package com.example.demo.domain;

import com.example.demo.entity.TranslateWord;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public interface ITranslateInteractor {
    String getTranslateWord(String word);
    String saveWord(String word, String translate);

    ObservableList<TranslateWord> getTranslateWordsFromDB();
}
