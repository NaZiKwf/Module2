package ua.nix.akolovych.secondTask;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueNames {

    List<String> names;
    public UniqueNames(List<String> names){
        this.names=names;
    }
    public UniqueNames(){

    }

    public void run(){
        System.out.println("List of name: ");
        System.out.println(names);
        try{
            System.out.println(findUniqueName(names));
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }

    public String findUniqueName(List<String> names){
        Map <String,Integer> numOfNames = new LinkedHashMap<>();
        for(String name: names){
            if(numOfNames.containsKey(name)){
                numOfNames.put(name,numOfNames.get(name) + 1);
            }
            else{
                numOfNames.put(name,1);
            }
        }

        Set<Map.Entry <String, Integer>> entryList = numOfNames.entrySet();
        for(Map.Entry <String, Integer> entry : entryList){
            if(entry.getValue() == 1){
                return entry.getKey();
            }

        }
        throw new RuntimeException("List don't have unique name");
    }

}
