package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    public static String getStatusImage(int code) {
        String imageUrl = "https://http.cat/" + code + ".jpg";

        try {
            URL url = new URL(imageUrl);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            int responseCode = httpConn.getResponseCode();

            // Check if the response is OK (HTTP status code 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                return "https://http.cat/" + code + ".jpg";
            } else {
                System.out.println("Error: " + httpConn.getResponseMessage());
            }

            httpConn.disconnect();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        return "https://http.cat/" + code + ".jpg";
    }
}
