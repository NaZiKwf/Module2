package ua.nix.akolovych.secondTask;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UniqueNamesTest {
    @Test
    void findUniqueName_returnString(){
        UniqueNames uniqueNames = new UniqueNames();
        List<String> names = List.of("yulia","petro","yulia","olga","petro","anna");
        String expected = "olga";
        String actual = uniqueNames.findUniqueName(names);
        assertEquals(expected,actual);
    }
    @Test
    void findUniqueName_returnException(){
        UniqueNames uniqueNames = new UniqueNames();
        List<String> names = List.of();
        assertThrows(RuntimeException.class,()->uniqueNames.findUniqueName(names));
    }
}

