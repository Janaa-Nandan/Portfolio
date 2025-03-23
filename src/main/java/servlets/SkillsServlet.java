package servlets;

import javax.servlet.annotation.WebServlet;

@WebServlet("/skills")
public class SkillsServlet extends BaseServlet {
    @Override
    protected String getJsonResponse() {
        return
        "{"
        + "\"skills\": ["
        + "{ \"name\": \"Java\", \"proficiency\": \"90%\", \"experience\": \"1 year\" },"
        + "{ \"name\": \"Python\", \"proficiency\": \"80%\", \"experience\": \"3 years\" },"
        + "{ \"name\": \"C++\", \"proficiency\": \"60%\", \"experience\": \"1 month\" },"
        + "{ \"name\": \"MySQL\", \"proficiency\": \"85%\", \"experience\": \"3 years\" },"
        + "{ \"name\": \"Problem Solving\", \"proficiency\": \"85%\", \"experience\": \"N/A\" },"
        + "{ \"name\": \"Web Development\", \"proficiency\": \"70%\", \"experience\": \"N/A\" }"
        + "]"
        + "}";
    }
}
