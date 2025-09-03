package com.example.inquiry;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // UserDAO に保存
        UserDAO.addUser(username, password);

        // 自動ログイン
        HttpSession session = req.getSession();
        session.setAttribute("user", username);

        // 登録後は問い合わせフォームへ
        resp.sendRedirect(req.getContextPath() + "/inquiry");
    }
}