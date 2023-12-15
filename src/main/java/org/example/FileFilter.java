package org.example;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public class FileFilter {
    public Field type;

    public static boolean isCapitalCity(List<String> list, String city){
        /*
        for (int i = 0;i < list.size();i++) {
            //return Objects.equals(list.get(i), city);
        }*/
        return list.contains(city);

    }
}
