package org.example;

import java.util.Scanner;

public class Keypad {
    private Scanner scanner = new Scanner(System.in);

    public String getInput() {
        System.out.print("Enter input: ");
        return scanner.nextLine();
    }
}
