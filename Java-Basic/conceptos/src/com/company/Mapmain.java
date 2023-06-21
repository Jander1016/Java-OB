package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mapmain {

    public static void main(String[] args) {
        Map<String, String> persons = new HashMap<>();

        persons.put("12345678U","person 1");
        persons.put("34534523W","person 2");
        persons.put("66623242R","person 3");
        persons.put("12345632P","person 4");

        for (String key : persons.keySet())
        {
            System.out.println(key);
        }

        for (String person : persons.values())
        {
            System.out.println(person);
        }

        for (Map.Entry<String,String> pair : persons.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
