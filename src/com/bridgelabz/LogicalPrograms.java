/* Q-3.) Prime Number
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime numbers.
*/
package com.bridgelabz;  // Package
import java.util.Scanner;   // Import Scanner


public class LogicalPrograms {
    public static void main(String[] args) {  // Entry point of Program
        Scanner scanner = new Scanner(System.in);  //make scanner obj
        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); //Input int
        int count=0;

        for(int i=2;i<num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==0){
            System.out.println(num+ " is a prime number");
        }else
            System.out.println(num + " is not a prime number");
        }

}
