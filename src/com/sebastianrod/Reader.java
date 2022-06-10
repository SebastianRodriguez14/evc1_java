package com.sebastianrod;

import java.util.Locale;
import java.util.Scanner;

public class Reader {

    private static Scanner sc = new Scanner(System.in);

    public static String inString(String text){
        System.out.print(text);
        String result = sc.nextLine();
        return result;
    }

    public static int inInt(String text){
        int number;
        while(true){
            try{
                System.out.print(text);
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        return number;
    }

    public static int inIntLimits(String text, int l1, int l2){
        int number;
        while(true){
            try{
                System.out.print(text);
                number = Integer.parseInt(sc.nextLine());

                if (number<l1 || number >l2) throw new Exception("Number out of limits");

                break;
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        return number;
    }

    public static double inDouble(String text){
        double number;
        while(true){
            try{
                System.out.print(text);
                number = Double.parseDouble(sc.nextLine());
                break;
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        return number;
    }

    public static boolean inBoolean(String text){
        boolean result;
        String answer;
        while(true){
            try{
                System.out.print(text);
                answer = sc.nextLine().toLowerCase();
                if (answer.equals("y")){
                    result = true;
                } else if(answer.equals("n")){
                    result = false;
                } else{
                    throw new Exception("Answer with 'y' or 'n'");
                }

                break;
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return result;
    }

}
