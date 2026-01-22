import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("Weekly Sleep Analyzer");
        System.out.println("This program will help you track how many hours you sleep each day.");
        System.out.println("You will enter your sleep data for 7 days.");   
        System.out.println();

        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        double[] weekData = new double[7];

        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------
        for (int i = 0; i < weekData.length; i++) {
            System.out.println("Enter hours slept for day " + (i + 1) + ": ");
            double hours = input.nextDouble(); 
            while (hours < 0 || hours > 24) {
                System.out.println("Invalid input. Please enter a value between 0 and 24.");
                hours = input.nextDouble();
            }
            weekData[i] = hours;
        }


        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData sleepData = new WeeklyData(weekData);

        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------
        System.out.println("Weekly Sleep Summary");
        System.out.println("Total hours slept: " + sleepData.getTotal());
        System.out.println("Average sleep per night: " + sleepData.getAverage());
        System.out.println("Most sleep in a night: " + sleepData.getMax());
        System.out.println("Least sleep in a night: " + sleepData.getMin());

        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.println("Data breakdown");
        System.out.println(sleepData.toString());


        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
        if (sleepData.getAverage() < 7) {
            System.out.println("You should try to get more sleep next week!");
        } else {
            System.out.println("Great job on getting enough sleep this week!");
        }


    }
}
