package com.example.demo.domain;

import java.util.Objects;

public class TranslateWord {
    private String word;
    private String translateWord;

    public TranslateWord (String word, String translateWord) {
        this.word = word;
        this.translateWord = translateWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslateWord() {
        return translateWord;
    }

    public void setTranslateWord(String translateWord) {
        this.translateWord = translateWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranslateWord that = (TranslateWord) o;
        return Objects.equals(word, that.word) && Objects.equals(translateWord, that.translateWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, translateWord);
    }

    @Override
    public String toString() {
        return "TranslateWord{" +
                "word='" + word + '\'' +
                ", translateWord='" + translateWord + '\'' +
                '}';
    }
}
