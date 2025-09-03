package com.example.inquiry;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    // 仮のユーザーデータベース（本来はDBを使う）
    private static Map<String, String> users = new HashMap<>();

    // ユーザー登録
    public static void addUser(String username, String password) {
        users.put(username, password);
    }

    // 認証チェック
    public static boolean validateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
