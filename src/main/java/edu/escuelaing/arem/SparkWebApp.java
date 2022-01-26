package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
import static spark.Spark.*;
public class SparkWebApp {

    public static void main(String[] args) {
        System.out.println("Initiating server... Ready");
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080; //returns default port if heroku-port isn't set
    }
}
