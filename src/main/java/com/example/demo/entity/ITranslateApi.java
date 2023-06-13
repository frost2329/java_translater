package com.example.demo.entity;

import com.example.demo.domain.TranslateWord;

public interface ITranslateApi {
    TranslateWord getTranslateWord(String word);
}
