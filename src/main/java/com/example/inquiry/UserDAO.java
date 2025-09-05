package com.example.inquiry;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private static Map<String, String> users = new HashMap<>();

    static {
        // デフォルトユーザー
        users.put("admin", "pass");
        users.put("test", "1234");
    }

    public static void addUser(String username, String password) {
        users.put(username, password);
        System.out.println("ユーザー追加: " + username + " / " + password);
    }

    public static boolean validateUser(String username, String password) {
        System.out.println("認証チェック: " + username + " / " + password);
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
