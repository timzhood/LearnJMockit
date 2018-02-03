package com.timz;

import org.apache.log4j.Logger;

/**
 * Created by tim on 27/01/18.
 */
class Jim
{
    private static final Logger LOGGER = Logger.getLogger(Jim.class);

    private final Bob bob;

    public Jim(final Bob aBob)
    {
        super();

        this.bob = aBob;
    }

    public int doStuff(int number1, int number2)
    {
        final int result = this.bob.doStuff(number1, number2) + number1 + number2;
        LOGGER.debug("adding " + number1 + " with " + number2 + " to make " + result);
        return result;
    }

}
