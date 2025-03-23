package servlets;

import javax.servlet.annotation.WebServlet;

@WebServlet("/")
public class IndexServlet extends BaseServlet {
    @Override
    protected String getJsonResponse() {
        return
        "{"
        + "\"message\": \"Welcome to My REST API Portfolio!\","
        + "\"version\": \"1.0\","
        + "\"base_url\": \"https://your-api-url.com\","
        + "\"description\": \"This API provides structured information about me, my projects, skills, and experience.\","
        + "\"endpoints\": ["
        + "{ \"path\": \"/about\", \"method\": \"GET\", \"description\": \"Retrieves general bio information.\" },"
        + "{ \"path\": \"/projects\", \"method\": \"GET\", \"description\": \"Returns a list of my projects.\" },"
        + "{ \"path\": \"/skills\", \"method\": \"GET\", \"description\": \"Lists programming languages & technologies I know.\" }"
        + "]"
        + "}";
    }
}
