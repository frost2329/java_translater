package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public interface IDBApi {
    String addWordInDB(String word, String translate);

    List<TranslateWord> getSavedWords();
}
