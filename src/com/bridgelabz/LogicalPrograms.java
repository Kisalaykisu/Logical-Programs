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
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray(); // toCharArray() method converts the given string into a sequence of characters.
        int max=100000000;
        int random=(int) (Math.random()*max);  //random function
        StringBuffer sb=new StringBuffer(); // StringBuffer is a peer class of String that provides much of the functionality of strings.

        while (random>0)
        {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode=sb.toString();  // tostring is built method used to return a string.
        System.out.println("Coupon Code: "+couponCode);
    }

}
