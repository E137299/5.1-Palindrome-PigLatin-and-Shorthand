import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class TestStringManipulator{
    @test
    public void testReverse1(){
        String test = StringManipulator.reverse("elephant");
        assertEquals(test,"tnahpele");
    }

    @test
    public void testReverse2(){
        String test = StringManipulator.reverse("classroom");
        assertEquals(test,"moorssalc");
    }

    @test 
    public void testIsPalindrome1(){
        boolean result = StringManipulator.isPalindrome("Lewd did I live, & evil I did dwel.");
        assertEquals(result,true);
    }

    @test 
    public void testIsPalindrome2(){
        boolean result = StringManipulator.isPalindrome("horse");
        assertEquals(result,false);
    }

    @test 
    public void testToPigLatin1(){
        String pig = StringManipulator.toPigLatin("My name is David");
        assertEquals(pig, "Myay amenay isyay Avidday");
    }

    @test 
    public void testToPigLatin2(){
        String pig = StringManipulator.toPigLatin("Go Austin High Maroons!");
        assertEquals(pig, "Ogay Austinyay Ighhay Aroonsmay!");
    }

    @test 
    public void testToShorthand1(){
        String shorthand = StringManipulator.toShorthand("I need to talk to you and ask for help");
        assertEquals(shorthand, " nd 2 tlk 2 U & sk 4 hlp");
    }

}