package com.example.demo.entity;

import com.example.demo.domain.TranslateWord;

public class TranslateApi implements ITranslateApi{
    @Override
    public TranslateWord getTranslateWord(String word) {
        return new TranslateWord(word, "перевод " + word);
    }
}
