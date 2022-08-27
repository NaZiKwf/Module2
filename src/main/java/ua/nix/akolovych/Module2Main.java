package ua.nix.akolovych;

import ua.nix.akolovych.firstTask.DatesFormat;
import ua.nix.akolovych.secondTask.UniqueNames;
import ua.nix.akolovych.thirdTask.controller.CityController;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Module2Main {
    public static void main(String[] args) {
        try {
            System.out.print("Correct dates : press 1 \n");
            System.out.print("Unique name : press 2 \n");
            System.out.print("Most profitable way between two cities: press 3 \n");
            System.out.print("Choose task number : ");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String numOfTask = bufferedReader.readLine();
                switch (numOfTask) {
                    case "1":
                        new DatesFormat().run();
                        break;
                    case "2":
                        new UniqueNames(List.of("Demon","Ivan","Demon")).run();
                        break;
                    case "3":
                        new CityController().run();
                        break;
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
