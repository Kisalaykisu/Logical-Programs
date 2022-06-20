/* Q-6. Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
*/
package com.bridgelabz;  // Package

import java.time.Duration; // time duration
import java.time.Instant;  // the specific time instant on the current timeline
import java.util.Locale;   // a specific geographical, political, or cultural region.
import java.util.Scanner;  // Import scanner

public class LogicalPrograms {
        static Instant start;  // Starting point
        static Instant stop;   // Ending Point

        public static void main(String[] args) {  // Entry point of the program

            Scanner scanner = new Scanner(System.in);  //  Make Scanner obj
            System.out.println("Enter S to start the stop watch: ");
            char variable = (scanner.next().toUpperCase(Locale.ROOT)).charAt(0);  //root locale is the locale whose language, country, and variant are empty ("") strings.
            if (variable == 'S') {
                start = Instant.now();
                System.out.println("StopWatch has started..");
            }
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter S again to stop the stop watch: ");
            char variable2 = (scanner.next().toUpperCase(Locale.ROOT)).charAt(0);
            if (variable2 == 'S') {
                stop = Instant.now(); //to obtain the current instant from the system UTC clock.
                System.out.println("Watch Stopped");
            }
            double elapsedTime = Duration.between(start,stop).toMillis(); // toMillis() is used to get the value of this duration in number of milli-seconds
            System.out.println("Time elapsed is: "+ elapsedTime/1000 + "  seconds");
        }

    }


