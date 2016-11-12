package com.example.java;

import java.util.Scanner;

public class SwitchStrings {



            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = sc.nextLine();




                        switch (input) {
                            case "Jan":
                                System.out.println("The month is 1");
                                break;
                            case "Feb":
                                System.out.println("The month is 2");
                                break;
                            case "Mar":
                                System.out.println("The month is 3");
                                break;
                            case "Apr":
                                System.out.println("The month is 4");
                                break;
                            case "May":
                                System.out.println("The month is 5");
                                break;
                            case "June":
                                System.out.println("The month is 6");
                                break;
                            default:
                                System.out.println("You chose a different month!");

                        }


            }



}
