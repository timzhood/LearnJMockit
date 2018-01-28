package com.timz;

import org.apache.log4j.Logger;

/**
 * Created by tim on 27/01/18.
 */
public class Jim
{
    private static Logger LOGGER = Logger.getLogger(Jim.class);

    public int doStuff(int number1, int number2)
    {
        final int result = number1 + number2;
        LOGGER.debug("adding " + number1 + " with " + number2 + " to make " + result);
        return result;
    }

}
