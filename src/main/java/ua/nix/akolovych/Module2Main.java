package ua.nix.akolovych;

import ua.nix.akolovych.firstTask.DatesFormat;
import ua.nix.akolovych.secondTask.UniqueNames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Module2Main {
    public static void main(String[] args) {
        try {
            System.out.print("Choose task number : \n");
            System.out.print("Correct dates : press 1 \n");
            System.out.print("Unique name : press 2 \n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String numOfTask = bufferedReader.readLine();
                switch (numOfTask) {
                    case "1":
                        new DatesFormat().run();
                        break;
                    case "2":
                        new UniqueNames(List.of("Demon","Ivan","Demon")).run();
                        break;
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
