package com.practice.input;

import java.util.Scanner;

public class InputParser {

    private final Scanner scanner;

    InputParser( Scanner scanner ) {
        this.scanner = scanner;
    }

    public String getPlayName(String message) {
        System.out.println(message + " : ");
        return scanner.nextLine();
    }
}
