package com.sebastianrod.exercises;

import com.sebastianrod.Reader;
import com.sebastianrod.exercises.vehicle.Car;
import com.sebastianrod.exercises.vehicle.Vehicle;

public class Exe extends Reader {
    public static void execute01(){
        String user = inString("User: ");
        String skill = inString("Skill: ");

        System.out.println(user + " is " + skill);
    }

    public static void execute02(){
        int number = inInt("Number: ");
        System.out.println(number + "^" + 2 + " = " + (Math.pow(number, 2)));
    }

    public static void execute03(){
        double radius = inDouble("Radius: ");
        double circumference = (radius*2) * Math.PI;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Circumference: " + circumference + " cm");
        System.out.println("Area: " + area + " m^2");

    }

    public static void execute04(){
        int op;
        loop:
        while (true) {
            System.out.println("[1] Add Car\n[2] Show all Cars\n[3] Exit");
            op = inIntLimits("Option: ", 1, 3);

            switch (op){
                case 1:
                    Vehicle vh = new Car(
                            inString("Brand: "),
                            inString("Model: "),
                            inString("Color: "),
                            inInt("Speed: ") + " km/h",
                            inInt("Release year: "),
                            inBoolean("´System Navigation? (y/n): ")
                    );

                    vh.add();
                    break;
                case 2:
                    new Car().showAllForType();
                    break;
                default:
                    break loop;
            }

        }


    }

    public static void execute05(){
        int number = inInt("Number: ");
        System.out.println(number % 2 ==0 ? "Is even" : "Is odd");
    }

    public static void execute06(){
        double number01 = inDouble("Number 01: ");
        double number02 = inDouble("Number 02: ");
        System.out.println("Result: " + (number01*number02));

    }

}
