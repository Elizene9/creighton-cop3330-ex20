/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Create a tax calculator that handles multiple states and multiple counties within each state.
 The program prompts the user for the order amount and the state where the order will be shipped.

Wisconsin residents must be changed 5% sales tax with an additional county-level charge.
 For Wisconsin residents, prompt for the county of residence.
For Eau Claire county residents, add an additional 0.005 tax.
For Dunn county residents, add an additional 0.004 tax.
Illinois residents must be charged 8% sales tax with no additional county-level charge.
All other states are not charged tax.
The program then displays the tax and the total for Wisconsin and Illinois
 residents but just the total for everyone else.

Example Output
What is the order amount? 10
What state do you live in? Wisconsin
What county do you live in? Dane
The tax is $0.50.
The total is $10.50.
Constraints
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.
 */
package Exercise_20;

import java.util.Scanner;

public class ex_20 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double tax = 0;
        System.out.print("What is the order amount? ");

        double total = input.nextDouble();
        System.out.print("\nWhat state do you live in? ");
        String state = input.next();

        if (state.equals("Wisconsin")) {
            tax += .05;
            System.out.print("\nWhat county do you live in? ");
            String county = input.next();

            if (county.equals("Dunn"))
                tax += .004;

            else if (county.equals("Eau Claire"))
                tax += .005;
        }
        else if (state.equals("Illinois"))
            tax += .08;

        double order = (tax * total) + total;

        if (state.equals("Wisconsin") || state.equals("Illinois"))
            System.out.printf("\nThe tax is $%.2f.\nThe total is $%.2f", tax * total, order);

        else
            System.out.printf("\nThe total is $%.2f", order);
    }
}
