package io.github.pengrad.openshift;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        ipAddress(args[0]);
        port(Integer.parseInt(args[1]));

        // Bot handler
        post("/myBot", new TestTelegramBot());

        // simple string by GET
        get("/hello", (req, res) -> "Hello World");

        // GET/POST handler
        post("/test", new Test());
        get("/test", new Test());
    }



    private static class Test implements Route {
        @Override
        public Object handle(Request request, Response response) throws Exception {
            return "ok, test";
        }
    }
}
