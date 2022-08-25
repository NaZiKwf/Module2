package ua.nix.akolovych.firstTask;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.firstTask.DatesFormat;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatesFormatTest {
    @Test
    void findCorrectDates_stringDatesAndFormats_returnCorrectDates(){
        DatesFormat datesFormat = new DatesFormat();
        List<String> dates = List.of("1969/07/14","03-02-2018","07.10.1952","1950\09\07","31@1963@05","26z\09z\1965z","25/01/1978");
        List<String> formats = List.of("yyyy/MM/dd","dd/MM/yyyy","MM-dd-yyyy");
        List<String> expected = List.of("19690714", "20180302", "19780125");
        List<String> actual = datesFormat.findCorrectDates(dates,formats);
        assertEquals(expected,actual);
    }

    @Test
    void findCorrectDates_NotCorrectDates_returnList(){
        DatesFormat datesFormat = new DatesFormat();
        List<String> dates = List.of("07.10.1952","1950\09\07","31@1963@05","26z\09z\1965z");
        List<String> formats = List.of("yyyy/MM/dd","dd/MM/yyyy","MM-dd-yyyy");
        List<String> expected = List.of();
        List<String> actual = datesFormat.findCorrectDates(dates,formats);
        assertEquals(expected,actual);
    }
}