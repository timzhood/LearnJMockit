package com.timz;

import mockit.Mocked;
import mockit.Verifications;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestJim
{
    @Test
    public void testBasic(@Mocked final Logger logger)
    {
        final Jim jim = new Jim();
        jim.doStuff(1, 2);

        new Verifications()
        {{
            logger.debug(anyString);
            times = 1;
        }};
    }
}
