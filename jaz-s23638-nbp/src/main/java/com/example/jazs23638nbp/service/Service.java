package com.example.jazs23638nbp.service;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@org.springframework.stereotype.Service
public class Service {
    public static Double getExchangeData() {
        URL url;
        try {
            url = new URL( "http://api.nbp.pl/api/cenyzlota/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

//            int responseCode = connection.getResponseCode();
//            if (responseCode != 200) {
//
//            } else {
//                String inline = "";
//                Scanner scanner = new Scanner(url.openStream());
//
//                //Write all the JSON data into a string using a scanner
//                while (scanner.hasNext()) {
//                    inline += scanner.nextLine();
//                }
//
//                //Close the scanner
//                scanner.close();
//
//                JSONParser parser = new JSONParser();
//                JSONObject data_obj = (JSONObject) parser.parse(inline);
//
//                JSONArray cenyzlota = (JSONArray) data_obj.get("cenyzlota");
//                return getAverageRate(cenyzlota);
//
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static double getAverageRate(JSONArray rates) {
//        double sum = 0;
//        for (int i = 0; i < rates.size(); i++) {
//            JSONObject obj = (JSONObject) rates.get(i);
//            double value = Double.parseDouble(obj.get("mid").toString());
//            sum += value;
//        }
//        return sum / rates.size();
//    }

}
