package ua.com.univerpulse.servlet;

import ua.com.univerpulse.model.News;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by svivanov on 28.03.16.
 */
@WebServlet(name = "archivenewsservlet", urlPatterns = {"/archivenews"})
public class ArchiveNewsServlet extends HttpServlet {
    private List<News> newsList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        fillArrayNews();

        req.setAttribute("newslist", newsList);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/archivenews.jsp");
        dispatcher.forward(req,resp);
    }

    private void fillArrayNews() {
        if (!newsList.isEmpty()) {
            return;
        }
        newsList.add(new News(
                "01.03.1916",
                "1916: The year that changed Ireland",
                "Ready for a revolution?\n" +
                        "\n" +
                        "1916 was a tumultuous year in Ireland’s history, with the country in a process of change that permanently altered its political and social landscape. Many believed that World War One would be over by Christmas 1914, but by 1916 it was still raging.\n" +
                        "\n" +
                        "Resentment towards British rule was growing in Ireland, with rebels plotting an independent Irish Republic. The events of this year not only affected those involved in the fighting, but touched the lives of ordinary people on the island.",
                "images/archnews01.jpg")
        );
    }
}
