package org.example;

import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

/**
 * Hello world!
 */
public class App {
    public static JSONObject readingJsonFile() {
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader("/Users/rahul/Downloads/iplTeam/src/main/java/org/example/rcbTeam.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (JSONObject) obj;
    }
    public static int calculateForeignPlayers() {
        JSONObject innerObj;
        int foreignPlayers = 0;
        try {
            JSONObject jsonObject = readingJsonFile();
            JSONArray players = (JSONArray) jsonObject.get("player");
            Iterator i = players.iterator();

            while (i.hasNext()) {
                innerObj = (JSONObject) i.next();
                if (!innerObj.get("country").toString().equalsIgnoreCase("India")) {
                    foreignPlayers++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return foreignPlayers;
    }
    public static int calculateWicketkeeper(){
        JSONObject innerObj;
        int wicketKeeper=0;
        try {
            JSONObject jsonObject = readingJsonFile();
            JSONArray players = (JSONArray) jsonObject.get("player");
            Iterator i = players.iterator();

            while (i.hasNext()) {
                innerObj = (JSONObject) i.next();
                if (innerObj.get("role").toString().equalsIgnoreCase("Wicket-keeper")) {
                    wicketKeeper ++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return wicketKeeper;
    }
}
