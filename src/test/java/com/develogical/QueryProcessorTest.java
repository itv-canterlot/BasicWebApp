package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void isWhatsYourNameWorking() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("Which github project do we use"));
    }

    @Test
    public void PlusWorking() throws Exception {
        assertThat(queryProcessor.process("2019 plus 35"), containsString("2054"));
    }

    @Test
    public void isLargestNumber() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 517, 30"), containsString("517"));
    }

    @Test
    public void multiplicationWorking() throws Exception{
        assertThat(queryProcessor.process("8becb370: what is 13 multiplied by 8"), containsString("104"));
    }

    @Test
    public void isLargestNumberMultiple() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 517, 30, 225"), containsString("517"));
    }
    @Test
    public void squareAndCube() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is a square and a cube: 3, 64"), containsString("64"));
    }

    @Test
    public void ColourOfBanana() throws Exception {
        assertThat(queryProcessor.process("colour is a banana"), containsString("yellow"));
    }

    @Test
    public void theresaMay() throws Exception {
        assertThat(queryProcessor.process("07858240: which year was Theresa May first elected as the Prime Minister of Great Britain"), containsString("2016"));

    }

    @Test
    public void EiffelTower() throws Exception {
        assertThat(queryProcessor.process("1d1bb6c0: which city is the Eiffel tower in"), containsString("Paris"));

    }
}
