package servlets;

import javax.servlet.annotation.WebServlet;

@WebServlet("/projects")
public class ProjectsServlet extends BaseServlet {
    @Override
    protected String getJsonResponse() {
        return
        "{"
        + "\"projects\": ["
        + "{"
        + "\"name\": \"REST API Portfolio (this)\","
        + "\"description\": \"A portfolio presented as a REST API.\","
        + "\"technologies\": [\"Java\", \"Servlets\", \"Tomcat\", \"Github\", \"Web Hosting (through Railway.app)\"],"
        + "\"repository\": \"https://github.com/Janaa-Nandan/rest-api-portfolio\","
        + "\"purpose\": \"To showcase my skills and experience through a RESTful API instead of a traditional website, making my portfolio interactive and developer-friendly.\""
        + "},"
        + "{"
        + "\"name\": \"Database Utility System (v1.1)\","
        + "\"description\": \"A self-made database utility framework that enables seamless interaction with SQL databases via JDBC, supporting user-defined queries and custom drivers. Currently tested with MySQL and PostgreSQL but can support ANY SQL driver.\","
        + "\"technologies\": [\"Java\", \"JDBC\", \"MySQL\", \"PostgreSQL\"],"
        + "\"repository\": \"https://github.com/Janaa-Nandan/\","
        + "\"purpose\": \"To provide a flexible and lightweight database utility system that simplifies database interactions without hardcoding SQL queries or limiting users to specific databases.\""
        + "},"
        + "{"
        + "\"name\": \"Database Handler System\","
        + "\"description\": \"A DB Handler for a public database using sockets. The machine that runs the Java application will act as the public database server (only MySQL) and server socket, to which others can connect. This is where the initial version of the previous project was born.\","
        + "\"technologies\": [\"Java\", \"My Database Utility System (v1.0)\", \"MySQL\", \"Sockets\"],"
        + "\"repository\": \"https://github.com/Janaa-Nandan/\","
        + "\"purpose\": \"To allow a Java application to function as a publicly accessible MySQL database server, enabling external connections via sockets.\""
        + "},"
        + "{"
        + "\"name\": \"ZIET\","
        + "\"description\": \"My Tradeshow project that can suggest a diet for Zoho people according to their health requirements, personal tastes, and the food available at Zoho (Chennai). (This project was done with the help of 2 other colleagues).\","
        + "\"technologies\": [\"Java\", \"My Database Utility System (v1.1)\", \"MySQL\", \"Zoho Jeeves API\", \"Zoho Cliq Bot (some Deluge too)\", \"Zoho Sheets API\", \"Google Gemini API\", \"Servlets\", \"HTML+CSS+JS+(Chart.js from Node.js)\"]"
        + ","
        + "\"repository\": \"https://github.com/Janaa-Nandan/\","
        + "\"purpose\": \"To create an AI-driven diet recommendation system tailored to Zoho employees, considering their health needs, taste preferences, and available food options at Zoho (Chennai).\""
        + "}"
        + "]"
        + "}";
    }
}
