package com.example.demo.domain;

import com.example.demo.db.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBApi implements IDBApi {
    DBConnector connector = new DBConnector();
    @Override
    public String addWordInDB(String word, String translate) {
        try {
            connector.init();
            if (DBConnector.connection == null) throw new RuntimeException();
            String sql = "insert into words (word, translate) values (?, ?);";
            PreparedStatement preparedStatement = connector.connection.prepareStatement(sql);
            preparedStatement.setString(1, word);
            preparedStatement.setString(2, translate);
            preparedStatement.executeUpdate();
            //connector.close();
            return "Слово добавлено";
        } catch (Exception e) {
            e.printStackTrace();
            return "Ошибка БД";
        }
    }
}
