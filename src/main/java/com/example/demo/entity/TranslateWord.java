package com.example.demo.entity;

import java.util.Objects;

public class TranslateWord {
    private String word;
    private String translate;

    public TranslateWord (String word, String translateWord) {
        this.word = word;
        this.translate = translateWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranslateWord that = (TranslateWord) o;
        return Objects.equals(word, that.word) && Objects.equals(translate, that.translate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, translate);
    }

    @Override
    public String toString() {
        return "TranslateWord{" +
                "word='" + word + '\'' +
                ", translateWord='" + translate + '\'' +
                '}';
    }
}
