package de.neuefische.hhjava222helloworld.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class GreetingsRepo {

    Map<String, String> greetingsMap = new HashMap<>(
            Map.of("1", "Hey",
                    "2", "Hallo",
                    "3", "Servus",
                    "4", "Grüß Gott!",
                    "5", "Wie geht es Ihnen"));


    public String getGreetingById(String id){
      return greetingsMap.get(id);

    }



}
