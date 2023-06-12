package com.example.demo.entity;

public class TranslateApi implements ITranslateApi{
    @Override
    public TranslateWord getTranslateWord(String word) {
        return new TranslateWord(word, "перевод " + word);
    }
}
