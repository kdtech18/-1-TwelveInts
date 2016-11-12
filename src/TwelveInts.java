/* TwelveInts.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   10/4/2016
*/

import java.util.Scanner;

public class TwelveInts
    {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
        {
            int[] numbers = new int[12];
        for (int i = 0; i < numbers.length; i++)
            {
                System.out.print("Please enter int " + (i + 1) + ": ");
                numbers[i] = scan.nextInt();
            }
            printFToL(numbers);
            printLToF(numbers);
        }// end main method
    public static void printFToL(int[] arr)
        {
        for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
    public static void printLToF(int[] arr)
        {
        for (int i = arr.length; i >= 0; i--)
            {
                System.out.println(arr[i]);
            }
        }
    }
