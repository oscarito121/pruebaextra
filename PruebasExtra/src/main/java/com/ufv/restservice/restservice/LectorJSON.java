package com.ufv.restservice.restservice;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectorJSON {
    public ArrayList<ClaseAlmacenarDatosJson> leerJSON() throws Exception{
        String jsonString;
        try {
            jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/Covid19-TIA_ZonasBasicasSalud.json")));
            //System.out.println(jsonString);
            Gson gson1 = new GsonBuilder().setDateFormat("yyyy/MM/dd HH:mm:ss").create();
            Type listType = new TypeToken<ArrayList<ClaseAlmacenarDatosJson>>() {
            }.getType();
            JsonObject jsonObject1 = new JsonParser().parse(jsonString).getAsJsonObject();
            JsonArray jsonArray1 = jsonObject1.getAsJsonArray("data");
            ArrayList<ClaseAlmacenarDatosJson> datosCovidZonasBasicas = gson1.fromJson(jsonArray1, listType);

            return datosCovidZonasBasicas;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
