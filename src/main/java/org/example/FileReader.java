package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final String PATH = "src/main/resources/country-list.csv";
    private List<String> capitalCities;

    public List<String> getCapitalCities() {
        return capitalCities;
    }

    public void readCsv(){

        capitalCities = new ArrayList<>();

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(PATH), StandardCharsets.UTF_8);
            String line = bufferedReader.readLine();
            while (line != null){
                String[] attributes = line.split(",");
                String city = attributes[1].replace("\"","");
                capitalCities.add(city);
                line = bufferedReader.readLine();
            }

    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
    }
}


