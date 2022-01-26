package edu.escuelaing.arem;

/**
 * Hello world!
 *
 */
import static spark.Spark.*;
public class SparkWebApp {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello Heroku");
    }
}
