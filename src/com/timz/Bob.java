package com.timz;

import org.apache.log4j.Logger;

class Bob
{
    private static final Logger LOGGER = Logger.getLogger(Bob.class);

    public int doStuff(int number1, int number2)
    {
        final int result = number1 * number2;
        LOGGER.debug("multiplying " + number1 + " with " + number2 + " to make " + result);
        return result;
    }
}
