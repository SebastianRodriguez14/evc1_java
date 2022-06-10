package com.sebastianrod;

import com.sebastianrod.exercises.*;
import com.sebastianrod.exercises.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        loop:
        while(true){
            String answer = Reader.inString("Type exe and the number of exercise (exm: exe1) or exit to finish: ");
            switch (answer){
                case "exe1":
                    Exe.execute01();
                    break;
                case "exe2":
                    Exe.execute02();
                    break;
                case "exe3":
                    Exe.execute03();
                    break;
                case "exe4":
                    Exe.execute04();
                    break;
                case "exe5":
                    Exe.execute05();
                    break;
                case "exe6":
                    Exe.execute06();
                    break;
                case "exit":
                    break loop;
                default:
                    System.out.println("Write a valid option");
                    break;
            }
        }


    }

}
