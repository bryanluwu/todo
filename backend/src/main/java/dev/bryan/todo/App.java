package dev.bryan.todo;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Gson gson = new Gson();
        String json = gson.toJson("hello");
        Task demo = new Task("1", "desc", "date");
        System.out.println(demo.desc);
    }
}
