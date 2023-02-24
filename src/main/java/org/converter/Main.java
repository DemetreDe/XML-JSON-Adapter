package org.converter;

import org.json.JSONObject;
import org.json.XML;

import java.io.FileReader;

public class Main {
    public static final String jsonDirectory = "src/main/resources/file.json";
    public static final String xmlDirectory = "src/main/resources/file.xml";

    public static void main(String[] args) {
        //JSON TO XML
        String jsonStr  = new FileToString(jsonDirectory).readFile();
        JSONObject json = new JSONObject(jsonStr);
        System.out.println(XML.toString(json));

        //XML TO JAVA
        String xmlStr  = new FileToString(xmlDirectory).readFile();
        JSONObject jsonFromXml = XML.toJSONObject(xmlStr);
        System.out.println(jsonFromXml);
    }
}