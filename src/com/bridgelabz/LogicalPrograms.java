/* Q-2)  Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28
*/
package com.bridgelabz;  // Package
import java.util.Scanner;   // Import Scanner


public class LogicalPrograms {
    public static void main(String[] args) {  // Entry point of Program
        Scanner scanner = new Scanner(System.in);  // make Scanner obj
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();  //Input int
        int sum = 0;
        System.out.println("The divisors are ");

        for(int i=1; i<num ;i++){
            if (num%i==0){
                sum+=i;
                System.out.println(i);
            }
        }
        if (sum==num){
            System.out.println("So "+num + " is a perfect number");
        }else
            System.out.println("So "+num+" is not a perfect number");
        }

}
