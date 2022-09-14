package de.neuefische.hhjava222helloworld.service;

import de.neuefische.hhjava222helloworld.repository.GreetingsRepo;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingsRepo repo;

    public GreetingService(GreetingsRepo repo) {
        this.repo = repo;
    }


    public String getGreetingById(String id){
        return "Ich sage " +  repo.getGreetingById(id) + " jeden Tag!";
    }

}
