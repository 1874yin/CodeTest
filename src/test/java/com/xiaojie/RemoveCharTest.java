package com.xiaojie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RemoveCharTest {

    String input1 = " aabcccbbad";
    String input2 = "abcccbad";
    String input3 = "a";
    String input4 = "";

    @Test
    public void testRemove() {
        assertEquals("d", RemoveCharacter.remove(input1));
        assertEquals("abbad", RemoveCharacter.remove(input2));
        assertEquals("a", RemoveCharacter.remove(input3));
        assertEquals("", RemoveCharacter.remove(input4));
    }

    @Test
    public void testReplace() {
        assertEquals("bad", RemoveCharacter.replace(input1));
        assertEquals("d", RemoveCharacter.replace(input2));
        assertEquals("a", RemoveCharacter.replace(input3));
        assertEquals("", RemoveCharacter.replace(input4));
    }
}
