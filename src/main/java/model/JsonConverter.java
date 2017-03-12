package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.*;
import java.net.URL;

public class JsonConverter {
    private static final String filename = "parkeerplaats.json";
    private String path;
    private static String staticPath = null;
    private static Gson gson;

    public JsonConverter(){
        URL url = this.getClass().getClassLoader().getResource(filename);
        if(url != null)
            path = this.getClass().getClassLoader().getResource(filename).getPath();
        else { //het bestand bestaat nog niet, dus bestand aanmaken en standaard parkeerplaats erin zetten
            File newFile = new File(JsonConverter.class.getProtectionDomain().getCodeSource().getLocation().getPath() + filename);
            try {
                //maak bestand aan
                newFile.getParentFile().mkdirs();
                newFile.createNewFile();
                //schrijf standaard parkeer plaats in bestand
                parkeerplaatsToJson(new Parkeerplaats(10,10,0));
                url = this.getClass().getClassLoader().getResource(filename);
                path = url.getPath();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static Gson getGson(){
        if(gson == null){
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(XMLGregorianCalendar.class,
                    new XMLGregorianCalendarConverter.Serializer());
            builder.registerTypeAdapter(XMLGregorianCalendar.class,
                    new XMLGregorianCalendarConverter.Deserializer());
            gson = builder.create();
        }
        return gson;
    }

    public String getPath(){
        return path;
    }

    private static String getFilePath(){
        if(staticPath == null)
            staticPath = new JsonConverter().getPath();
        return staticPath;
    }

    public static void parkeerplaatsToJson(Parkeerplaats parkeerplaats){
        try(Writer writer = new FileWriter(getFilePath())){
            getGson().toJson(parkeerplaats,writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Parkeerplaats getParkeerplaats(){
        Parkeerplaats parkeerplaats = null;
        try(Reader reader = new FileReader(getFilePath())){
            parkeerplaats = getGson().fromJson(reader, Parkeerplaats.class);
        } catch (FileNotFoundException e) {
            new File(getFilePath());
            System.out.println("file not found");
            parkeerplaatsToJson(new Parkeerplaats(10,10,0));
            getParkeerplaats();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parkeerplaats;
    }

}
