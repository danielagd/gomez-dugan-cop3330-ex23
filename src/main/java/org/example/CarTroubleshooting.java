package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class CarTroubleshooting
{
    public static void main( String[] args )
    {
        // Program to help assist troubleshooting a car
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String car_silent = input.nextLine().toLowerCase();

        if (car_silent.equals("y") || car_silent.equals("yes"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String corroded = input.nextLine().toLowerCase();

            if (corroded.equals("y") || corroded.equals("yes"))
            {
                System.out.print("Clean terminals and try starting again.");
                return;
            }
            else if (corroded.equals("n") || corroded.equals("no"))
            {
                System.out.print("Replace cables and try again.");
                return;
            }
        }

        else if (car_silent.equals("n") || car_silent.equals("no"))
        {
            System.out.print("Does the cable make a slicking noise? ");
            String slicking = input.nextLine().toLowerCase();

            if (slicking.equals("y") || slicking.equals("yes"))
            {
                System.out.print("Replace the battery.");
                return;
            }

            else if (slicking.equals("n") || slicking.equals("no"))
            {
                System.out.print("Does the car crank up but fail to start? ");
                String crank = input.nextLine().toLowerCase();

                if (crank.equals("y") || crank.equals("yes"))
                {
                    System.out.print("Check spark plug connections.");
                    return;
                }

                else if (crank.equals("n") || crank.equals("no"))
                {
                    System.out.print("Does the engine start and then die? ");
                    String start = input.nextLine().toLowerCase();

                    if (start.equals("y") || start.equals("yes"))
                    {
                        System.out.print("Does your car have fuel injection? ");
                        String injection = input.nextLine().toLowerCase();

                        if (injection.equals("y") || injection.equals("yes"))
                        {
                            System.out.print("Get it in for service.");
                            return;
                        }
                        else if (injection.equals("n") || injection.equals("no"))
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }

                    else if (start.equals("n") || start.equals("no"))
                    {
                        System.out.print("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}
