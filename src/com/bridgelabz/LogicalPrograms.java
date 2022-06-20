/* Q-1. Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
package com.bridgelabz;
*/
package com.bridgelabz;  // Package
import java.util.Scanner;   // Import Scanner
import java.util.SplittableRandom; //Import SplittableRandom

public class LogicalPrograms {
    public static void main(String[] args) {  // Entry point of Program
        int a=0,b=1,sum;  //Initializing
        Scanner sc = new Scanner(System.in);  //Make new Scanner obj
        System.out.println("Enter the value of terms n: ");
        int n = sc.nextInt();  // Input int

        for(int i=0;i<n;i++){
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
