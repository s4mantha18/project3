package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("input a string");
        String input = new Scanner(System.in).nextLine();
        String[] inputarray = input.split("", input.length());
        String[] reversedarray = inputarray;
    }
}