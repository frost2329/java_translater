package com.example.demo.presentation;

import com.example.demo.domain.TranslateInteractor;
import com.example.demo.entity.DBApi;
import com.example.demo.entity.TranslateApi;

public class TranslatePresenter {
    HelloController vue;
    TranslateInteractor interactor = new TranslateInteractor();
    public void attachVue(HelloController vue) {
        this.vue = vue;
    }
    public void onChangeWord (String word) {
        vue.showResult(interactor.getTranslateWord(word));
    }

    public void onAddWord(String word, String translate) {
        vue.showResult(interactor.saveWord(word, translate));
    }
    public void onShowTranslateWords() {
        vue.showTranslateWords(interactor.getTranslateWordsFromDB());
    }
}
