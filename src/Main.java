//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Array of 100 dataPoints
        int[] dataPoints = new int[100];
        int sum = 0;
        double average;
        int searchTarget1;
        int searchTarget2;
        int count = 0;
        int max = 0;
        int min = 101;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        //Creates a random int value for each int in the dataPoints array
        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        //Prints all data seperated by a bar on a single line
        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(+dataPoints[i] +" | ");
        }
        System.out.println("");

        //Calculates the sum of all data points
        for(int i = 0; i < dataPoints.length; i++)
        {
            sum = sum +dataPoints[i];
        }

        //Prints the sum
        System.out.println("The sum of all the numbers is " +sum);
        //Calculates average
        average = sum / dataPoints.length;
        //Prints average
        System.out.println("The average of all the numbers is " +average);

        //Input for value to find in dataPoints
        searchTarget1 = SafeInput.getRangedInt(in, "What number do you want to search for? ", 1, 100);

        //Counts how many times the given value is in dataPoints
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchTarget1)
            {
                count = count + 1;
            }
        }
        //Prints the amount of times the given value is in dataPoints
        System.out.println("Your number " +searchTarget1 +" was found " +count +" times in the data set.");

        searchTarget2 = SafeInput.getRangedInt(in, "What number do you want to search for? ", 1, 100);

        //Determines if the given number is in the array and if it is then what index it is at
        for(int i = 0; i < dataPoints.length; i++)
        {
            // dataPoints has given number
            if(dataPoints[i] == searchTarget2)
            {
                //Prints the given number as well as its index
                System.out.println("Your number " +searchTarget2 +" was found at index " +i);
                break;
            } else if(dataPoints[i] != searchTarget2 && i == 99) //dataPoints does not have given number
            {
                System.out.println("Your number was not in the array");
            }
        }

        //Finds the minimum and maximum of dataPoints
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(max < dataPoints[i])
            {
                max = dataPoints[i];
            }
            if(min > dataPoints[i])
            {
                min = dataPoints[i];
            }
        }

        //Prints the minimum and maximum of dataPoints
        System.out.println("Your max is " +max +" and your min is " +min);

        //Prints the average using getAverage method
        System.out.println("Average of dataPoints is: " +getAverage(dataPoints));

        //Prints the minimum using min method
        System.out.println("Your min is " +min(dataPoints));

        //Prints the max using max method
        System.out.println("Your max is " +max(dataPoints));

        //Prints the given number and the amount of times it is found in dataPoints
        System.out.println("Your number " +searchTarget1 +" was found " +occuranceScan(dataPoints, searchTarget1) +" times");

        //Prints the sum of dataPoints
        System.out.println("The sum of the data set was " +sum(dataPoints));

        //Prints the given number and whether dataPoints contains it using t/f
        System.out.println("It is " +contains(dataPoints, searchTarget1) +" that the data set contains " +searchTarget1);
    }

    //Gets average of an array
    public static double getAverage(int values[])
    {
        //Return var
        double retDouble = 0;

        double sum = 0;
        double average;

        //Calculates the sum of the array
        for(int i = 0; i < values.length; i++)
        {
            sum = sum +values[i];
        }

        //Calculates the average of the array
        average = sum / values.length;
        retDouble = average;

        return retDouble;
    }

    //Gets minimum value in array
    public static int min(int values[])
    {
        //Return var
        int min = 101;

        //Find min value
        for(int i = 0; i < values.length; i++)
        {
            if(min > values[i])
            {
                //Sets min value to return var
                min = values[i];
            }
        }
        return min;
    }

    //Gets max value in array
    public static int max(int values[])
    {
        //Return var
        int max = 0;

        //Finds max value
        for(int i = 0; i < values.length; i++)
        {
            if(max < values[i])
            {
                //Sets max value to return var
                max = values[i];
            }
        }
        return max;
    }

    //Determines number of times target value occurs in data set
    public static int occuranceScan(int values[], int target)
    {
        //Return var
        int count = 0;

        //Counter
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] == target)
            {
                count = count + 1;
            }
        }
        return count;
    }

    //Determines sum of all values in array
    public static int sum(int values[])
    {
        //Return var
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum = sum +values[i];
        }
        return sum;
    }

    //Determines if array contains target value then return t/f
    public static boolean contains(int values[], int target)
    {
        //Return var
        boolean arrayContains = false;

        //Checks for each value if it is target
        for(int i = 0; i < values.length; i++)
        {
            //Target Checker
            if(values[i] == target)
            {
                arrayContains = true;
                break;
            }
        }
        return arrayContains;
    }
}