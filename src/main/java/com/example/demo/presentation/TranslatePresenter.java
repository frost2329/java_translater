package com.example.demo.presentation;

import com.example.demo.domain.DBApi;
import com.example.demo.domain.TranslateApi;

public class TranslatePresenter {
    HelloController vue;
    TranslateApi api = new TranslateApi();
    DBApi dbApi = new DBApi();
    public void attachVue(HelloController vue) {
        this.vue = vue;
    }
    public void onChangeWord (String word) {
        vue.showResult(api.getTranslateWord(word).getTranslateWord());
    }

    public void onAddWord(String word, String translate) {
        vue.showResult(dbApi.addWordInDB(word, translate));
    }
}
