package pl.coderslab;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int start = Integer.parseInt(req.getParameter("start"));
            int end = Integer.parseInt(req.getParameter("end"));
            try (var responseWriter = resp.getWriter()) {
                for (int i = start; i <= end; i++) {
                    resp.getWriter().append(String.format("%d, ", i));
                }
            }
        } catch (NumberFormatException e) {
            resp.getWriter().write("BRAK");
        }
    }
}
