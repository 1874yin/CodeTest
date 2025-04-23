package com.xiaojie;

import org.junit.Assert;
import org.junit.Test;


public class RemoveCharTest {

    String input1 = " aabcccbbad";
    String input2 = "abcccbad";

    @Test
    public void testRemove() {
        Assert.assertEquals("d", RemoveCharacter.remove(input1));
        Assert.assertEquals("abbad", RemoveCharacter.remove(input2));
    }

    @Test
    public void testReplace() {
        Assert.assertEquals("bad", RemoveCharacter.replace(input1));
        Assert.assertEquals("d", RemoveCharacter.replace(input2));
    }
}
