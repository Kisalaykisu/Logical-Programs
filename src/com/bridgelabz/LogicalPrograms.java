/* Q-4) Reverse a number
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
*/
package com.bridgelabz;  // Package
import java.util.Scanner;   // Import Scanner


public class LogicalPrograms {
    public static void main(String[] args) {  // Entry point of Program
        Scanner scanner = new Scanner(System.in);  // Make Scanner obj
        System.out.println("Enter a number: ");
        String number = scanner.next();
        int newNum = Integer.parseInt(number); // this method is  used to convert String to Integer in Java
        int reverseNum=0;

        for(int i=1;i<=number.length();i++){
            int remainder = newNum%10;  //To find remainder
            newNum = newNum/10;
            reverseNum = reverseNum*10+remainder;  //Reverse Number logic
        }
        System.out.println("Reverse number is: "+ reverseNum);
        }

}
