package com.fun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program prints greetings based on a user's first name and age
 */
public class Greeter {
    public static void main(String[] args) {

        var greetingOfTheDay = "Welcome, adventurer!";
        var specialGreeting = "Welcome, your highness!";
        var defaultGreeting = ", howdy adventurer!";

        var names = new String[]{"rachel", "jennifer", "paul", "james"};
        var specialName = "sarah";

        // This collects input from the user. Notice the ceremony involved with the Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name? ");
        var name = input.nextLine();
        System.out.println("What is your age? ");
        var age = input.nextInt();
        input.close();

        // Comparison to Python - a string array does not contain the 'contains' method
        var nameList = Arrays.stream(names).toList();
        //General note - the String class in Java does not have a built-in toTitleCase or capitalize function
        if (nameList.contains(name)&& age >= 21) {
            System.out.println(greetingOfTheDay);
            System.out.println(name + " , A special drink awaits you!");
        }
        else if (specialName.equalsIgnoreCase(name)) {
            System.out.println(specialGreeting);
            System.out.println(name + ", A special feasts awaits you in the castle!");
        }
        else {
            System.out.println(name + defaultGreeting);
        }
    }
}
