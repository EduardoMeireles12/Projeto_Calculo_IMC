package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // executa a GUI
        GUI gui = new GUI();
        gui.start();
        gui.imcInput(scanner);

        scanner.close();
    }
}