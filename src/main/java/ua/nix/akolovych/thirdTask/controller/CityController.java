package ua.nix.akolovych.thirdTask.controller;

import ua.nix.akolovych.thirdTask.service.CityService;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static ua.nix.akolovych.thirdTask.utils.ConsoleHelper.print;

public class CityController {
    private static final String input = "src/main/resources/thirdTaskFiles/input.txt";
    private static final String output = "src/main/resources/thirdTaskFiles/output.txt";

    public void run() {
        String someTask = "";
        try {
            someTask = Files.readString(Paths.get(input));
        } catch (IOException e) {
            print(e.getMessage());
        }
        String[] arrayWaysCities = someTask.split("\n");
        String result = CityService.findTheCheapestWay(arrayWaysCities);
        print("Result:\n" + result);
        Path path = Paths.get(output);
        try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))){
            writer.write(result);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
