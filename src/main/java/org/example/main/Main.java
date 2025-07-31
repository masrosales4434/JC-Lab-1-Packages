package org.example.main;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

import static java.lang.System.*;
// Import here manually
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ClassOne classOne = new ClassOne();

        out.println(classOne.greet());

        ClassTwo classTwo = new ClassTwo();

        out.println(classTwo.greet());

        ClassThree classThree = new ClassThree();

        out.println(classThree.greet());
    }
}