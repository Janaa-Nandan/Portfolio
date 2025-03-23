package servlets;

import javax.servlet.annotation.WebServlet;

@WebServlet("/hh")
public class ErrorServlet extends BaseServlet {
    @Override
    protected String getJsonResponse() {
        return "{ \"error\": \"Endpoint not found\", \"status\": 404, \"message\": \"The requested endpoint does not exist.\" }";
    }
}
