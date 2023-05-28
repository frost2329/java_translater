package com.example.demo;

public class TranslateApi {
    TranslateWord getTranslateWord(String word) {
        return new TranslateWord(word, "перевод " + word);
    }
}
