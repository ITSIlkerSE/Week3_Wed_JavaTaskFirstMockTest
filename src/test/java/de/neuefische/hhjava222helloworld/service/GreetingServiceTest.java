package de.neuefische.hhjava222helloworld.service;


import de.neuefische.hhjava222helloworld.repository.GreetingsRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GreetingServiceTest {

    GreetingsRepo repoSim = mock(GreetingsRepo.class);
    GreetingService service = new GreetingService(repoSim);


    @Test
    void testMethodInGreetingsService_returnStringIfValid(){

        //Given

        String id = "31";
        when(repoSim.getGreetingById(id)).thenReturn("Funzt...");


        //When

        String actual = service.getGreetingById(id);



        //Then


        assertEquals("Ich sage Funzt... jeden Tag!", actual);


    }

}
