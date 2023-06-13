package com.example.demo.entity;

import com.example.demo.db.DBConnector;
import com.example.demo.domain.TranslateWord;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBApi implements IDBApi {
    static final String SQL_INSERT = "insert into words (word, translate) values (?, ?);";
    static final String SQL_SELECT_ALL = "select distinct word, translate from words order by words.word";

    DBConnector connector = DBConnector.getConnector();

    @Override
    public String addWordInDB(String word, String translate) {
        try {
            connector.init();
            if (connector.connection == null) throw new RuntimeException();
            PreparedStatement preparedStatement = connector.connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, word.toLowerCase());
            preparedStatement.setString(2, translate.toLowerCase());
            preparedStatement.executeUpdate();
            connector.closeConnection();
            return "Слово "+ word.toLowerCase() +" сохранено в словаре";
        } catch (Exception e) {
            e.printStackTrace();
            return "Ошибка БД";
        }
    }

    @Override
    public List<TranslateWord> getSavedWords() {
        List resultList = new ArrayList<TranslateWord>();
        try {
            connector.init();
            if (connector.connection == null) throw new RuntimeException();
            Statement statement = connector.connection.createStatement();
            ResultSet result= statement.executeQuery(SQL_SELECT_ALL);
            while (result.next()) {
                String currentWord = result.getString("word");
                String currentTranslate = result.getString("translate");
                resultList.add(new TranslateWord(currentWord, currentTranslate));

            }
            connector.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }
}
