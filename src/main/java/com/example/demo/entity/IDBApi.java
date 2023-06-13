package com.example.demo.entity;

import com.example.demo.domain.TranslateWord;

import java.util.List;

public interface IDBApi {
    String addWordInDB(String word, String translate);
    List<TranslateWord> getSavedWords();
}
