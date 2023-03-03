package Coursera.HW6_CIT590.MyfirstJavaProject;

import java.util.Scanner;

/*
 * My first java class 
 * @author: William Gao
 */

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();
        int x = 5;
        double y = 5.0;
        boolean flag = true;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("flag: " + flag);

        /*
         * Strings and characters
         */

        String dept = "cit"; 
        char letter = 'A';
        String course = dept + 590;
        String grade = letter + "";
        String courseInformation = course + ": " + grade;
        System.out.println(courseInformation);
        /*
         * Math Operations
         */

        double d = 2 * x + 10;
        double z = 2 * y + 5;
        System.out.println();
        System.out.println("d:"+d);
        System.out.println("z:"+z);
        System.out.println("x/2 = "+ (x/2)); //only return the integer of the result 
        System.out.println("x/2 = "+ (x/2.0)); // use float to get decimals 
        System.out.println("x Pow 4 = " + Math.pow(x, 4));

        /*
         * String Operations 
         */
        String fullName = "William" + "Gao";
        String fullNameUpper = fullName.toUpperCase();
        String fullNameLower = fullName.toLowerCase();
        System.out.println(fullName);
        System.out.println(fullNameUpper);
        System.out.println(fullNameLower);

        /*
         * Conditionals and Loops 
         */
        //Conditional Checking if x is even, using the modulus or %operator
        System.out.println();
        System.out.println("x: " + x);

        if (x % 2 == 0) {
            System.out.println(x+" is even");
        } else {
            System.out.println(x + " is odd");
        }
        
        double e = 2.3;
        double f = 2.4;
        double g = 2.5;

        System.out.println();
        if (e > 2 && e < f){
            System.out.println(e + " is between 2 and "+f);
        } else if (e <= 2){
            System.out.println(e + " is smaller than 2 and "+f);
        } else {
            System.out.println(0);
        }

        if (e > 2 || e < f){
            System.out.println(1); //type sout
        } else if (e <= 2){
            System.out.println(2);
        } else {
            System.out.println(0);
        }
        System.out.println("while loop");
        System.out.println();
        int i = 0;
        while (i < e){
            System.out.println(i);
            i++;
        }

        System.out.println("for loop");
        for (int k = 1; k <= f; k++){
            System.out.println("k: "+k);
        }

        /* casting */
        //cast int to String
        String intToString = Integer.toString(1);
        System.out.println(intToString + " " + intToString.getClass()); /// how to get type 
        
        String doubletoString = Double.toString(1.1);
        System.out.println(doubletoString + " " + doubletoString.getClass()); /// how to get type 

        int stringToInt = Character.parseInt("1"); /// still use Integer class
        System.out.println(stringToInt + " " + ((Object)stringToInt).getClass()); 

        double stringToDouble = Double.parseDouble("1.1");
        System.out.println(stringToDouble + " " + ((Object)stringToDouble).getClass()); 
        // primitive type Double and int does not have get class function so have to case to Object first
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int myInt = scan.nextInt();
        System.out.println("Your number is: " + myInt);
        for (int t = 1; t<11; t++) {
            System.out.println(t+" x "+myInt+"= "+(t*myInt));
        }
        System.out.println();
        System.out.println("Enter a String:");
        String myString = scan.next(); // get string  scan.nextInt() to get int, nextLine() to get whole line

        for (int h = 0; h<myString.length(); h++){
            System.out.println(myString.charAt(h));
        }
    }
}
