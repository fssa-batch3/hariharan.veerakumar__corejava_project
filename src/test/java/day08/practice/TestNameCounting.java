package day08.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class TestNameCounting {
@Test
public void testValidCounting() {
	String str = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
    String[] names = str.split(",");

    HashMap<String, Integer> nameCount = new HashMap<>();

    for (String name : names) {
        name = name.trim();
        nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
    }
    
    assertEquals(5, nameCount.size()); 

    assertEquals(2, nameCount.get("Ram"));
    assertEquals(1, nameCount.get("Superman")); 
    assertEquals(2, nameCount.get("Spider")); 
    assertEquals(2, nameCount.get("hey"));
    assertEquals(1, nameCount.get("hello"));
}
@Test
public void testInvalidCounting() {
	String str = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
    String[] names = str.split(",");

    HashMap<String, Integer> nameCount = new HashMap<>();

    for (String name : names) {
        name = name.trim();
        nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
    }
    assertNotEquals(6,nameCount.size());
    
    assertNotEquals(3, nameCount.get("Ram"));
    assertNotEquals(0, nameCount.get("Superman")); 
    assertNotEquals(3, nameCount.get("Spider")); 
    assertNotEquals(0, nameCount.get("hey"));
    assertNotEquals(3, nameCount.get("hello"));
    
}
}
