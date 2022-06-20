/* Q-5. Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.
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
