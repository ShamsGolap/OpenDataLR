package com.example.shams.opendatalr.utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Shams on 26/01/2017.
 */

public class JSONParser {
    private JSONObject jsonObject = null;

    public JSONParser(URL url) {
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }

            inputStream.close();

            String json = stringBuilder.toString();
            jsonObject = new JSONObject(json);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getJSONObject() {
        return this.jsonObject;
    }
}
