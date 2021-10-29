package com.medavie.blue.cross;

import java.util.Scanner;

/**
 * Main class and method to run CeilingFan class.
 * Author: Kyla Kieltyka
 * Date: October 24th, 2021
 */
public class Main {

    public static void main(String[] args) {

        CeilingFan ceilingFan = new CeilingFan();
        System.out.println("Ceiling Fan starting values:");
        currentFanValues(ceilingFan);
        menuOptions();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String userInput = scanner.next();

            if (userInput.equals("D") || userInput.equals("d")) {
                ceilingFan.pullDirectionCord();
            } else if (userInput.equals("S") || userInput.equals("s")) {
                ceilingFan.pullSpeedCord();
            } else if (userInput.equals("Q") || userInput.equals("q")) {
                break;
            } else {
                System.out.println("Sorry, that is invalid input. Please try again!");
            }
            currentFanValues(ceilingFan);
            menuOptions();
        }

        System.out.println("Thank you for trying this ceiling fan program.");
    }

    public static void menuOptions(){
        System.out.println("Please choose one ceiling fan action and press enter:");
        System.out.println("Press D to pull the direction cord.");
        System.out.println("Press S to pull the speed cord.");
        System.out.println("Press Q to quit the program." + "\n");
    }

    public static void currentFanValues(CeilingFan ceilingFan){
        System.out.println("Speed: " + ceilingFan.getSpeed());
        System.out.println("Direction: " + ceilingFan.getDirectionText() + "\n");
    }
}
