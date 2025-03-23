package servlets;

import javax.servlet.annotation.WebServlet;

@WebServlet("/about")
public class AboutMeServlet extends BaseServlet {
	
    @Override
    protected String getJsonResponse() {
        return
        "{"
        + "\"name\": \"Janaa\","
        + "\"role\": \"Backend Developer\","
        + "\"bio\": \"I am Janaa, a student of Zoho Schools of Technology. As a back-end developer, I specialize in designing efficient, scalable, and secure server-side applications. Passionate about low-level programming, performance tuning, and debugging. Also aspiring to master C++ and system-level architectural programming.\","
        + "\"skills_url\": \"/skills\","
        + "\"projects_url\": \"/projects\","
        + "\"contact\": {"
        + "\"linkedin\": \"https://www.linkedin.com/in/janaarthanan-nandan\","
        + "\"github\": \"https://github.com/Janaa-Nandan\","
        + "\"twitter\": \"https://x.com/Janaarthan\","
        + "\"email\": \"janaarthanan.n@zohocorp.com\","
        + "\"phone\": \"+91 83003 36187\""
        + "}"
        + "}";
    }
//    public static void main(Stirng[] args) {
//    	AboutMeServlet obj = new AboutMeServlet();
//        obj.doGet();
//    }
}
