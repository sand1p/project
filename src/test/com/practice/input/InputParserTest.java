package com.practice.input;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class InputParserTest {
    @Test
    public void shouldReturnUserEnteredName() {
        final Scanner scanner = new Scanner( "Dummy Player" );
        final InputParser inputParser = new InputParser(scanner);
        String name = inputParser.getPlayName("Enter your name");
        final String expectedName = "Dummy Player";
        Assert.assertEquals( "name should be same ", expectedName, name);
    }
}
