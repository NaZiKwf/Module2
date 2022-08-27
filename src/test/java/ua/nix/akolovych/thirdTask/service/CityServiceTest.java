package ua.nix.akolovych.thirdTask.service;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.nix.akolovych.thirdTask.utils.ConsoleHelper.print;

public class CityServiceTest {

    public String [] getFileLines(String input){
        String someTask = "";
        try {
            someTask = Files.readString(Paths.get(input));
        } catch (IOException e) {
            print(e.getMessage());
        }
        String[] arrayWaysCities = someTask.split("\n");
        return arrayWaysCities;
    }
    @Test
    void findTheCheapestRoad(){
        String expected = "3\n" + "2";
        String actual = CityService.findTheCheapestWay(getFileLines("src/main/resources/thirdTaskFiles/input.txt"));
        assertEquals(expected,actual);
    }
}
