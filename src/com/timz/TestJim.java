package com.timz;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class TestJim
{
    @Test
    public void testBasic(@Mocked final Bob bob, @Mocked final Logger logger)
    {
        new Expectations()
        {{
            bob.doStuff(anyInt, anyInt);
            this.result = 1;
        }};

        final Jim jim = new Jim(bob);
        final int result = jim.doStuff(1, 2);
        Assert.assertEquals(4, result);

        new Verifications()
        {{
            logger.debug(withSubstring("adding"));
            times = 1;
        }};
    }
}