package ua.nix.akolovych.firstTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class DatesFormat {

    public void run(){
        List<String> dates = List.of("1969/07/14","03-02-2018","07.10.1952","1950\09\07","31@1963@05","26z\09z\1965z","25/01/1978");
        List<String> formats = List.of("yyyy/MM/dd","dd/MM/yyyy","MM-dd-yyyy");

        System.out.println("List of dates: ");
        System.out.println(findCorrectDates(dates,formats));

    }

    public List<String> findCorrectDates(List<String> dates, List<String> correctFormats){
        List<String> correctDates = new ArrayList<>();

        for(String date: dates){
            LocalDate localDate = null;
            for(String format: correctFormats){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
              try {
                  localDate = LocalDate.parse(date,formatter);
                  break;
              }
              catch (DateTimeParseException e){
                  continue;
              }
            }
            if(localDate == null){
                continue;
            }
            else{
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
               String formatDate = localDate.format(formatter);
               correctDates.add(formatDate);
            }
        }
        return correctDates;
    }


}

