package org.converter;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class Main {
    public static final String jsonDirectory = "src/main/resources/file.json";
    public static final String xmlDirectory = "src/main/resources/file.xml";


    public static void main(String[] args) {

        //JSON TO XML
        String data = convertToXML(new FileToString(jsonDirectory).readFile(),"root");
        System.out.println(data);

        //XML TO JAVA
        String xmlStr  = new FileToString(xmlDirectory).readFile();
        JSONObject jsonFromXml = XML.toJSONObject(xmlStr);
        System.out.println(jsonFromXml);
    }

    public static String convertToXML(String jsonString, String root) throws JSONException {    // handle JSONException

        // create instance of JSONObject by passing jsonString to the constructor
        JSONObject jsonObject = new JSONObject(jsonString);

        // use XML.toString() method to convert JSON into XML and store the result into a string
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<"+root+">" + XML.toString(jsonObject) + "</"+root+">";

        // pass the XML data to the main() method
        return xml;
    }

}
