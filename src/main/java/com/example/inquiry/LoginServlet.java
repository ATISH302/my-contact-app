package com.example.inquiry;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		    req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}
	
	
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

     // UserDAO を使って認証
        if (UserDAO.validateUser(username, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", username);
            
         //  ログイン成功後はトップページへ
            resp.sendRedirect(req.getContextPath() + "/index.jsp");
        } else {
            req.setAttribute("error", "ユーザー名またはパスワードが違います");
//            req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
            req.getRequestDispatcher("/login.jsp").forward(req, resp);

        }
    }
}

