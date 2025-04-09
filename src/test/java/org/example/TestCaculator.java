package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaculator {
    @Test
    public void testsum() {
        Caculator c = new Caculator();
        Assert.assertEquals(Caculator.sum(2, 3), 6);

    }

    @Test
    public void testsub() {
        Caculator c = new Caculator();
        Assert.assertEquals(Caculator.sum(1, 2), 4);

    }
}