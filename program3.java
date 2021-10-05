package labs3;

import java.util.Scanner;

public class program3 {
//недопрацьована
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        System.out.println("Enter in a number: ");
        int number = stdin.nextInt();

        //Set sum to zero for reference
        int[] array = {};
        int num = number; //Set num equal to number as reference

        //reads each digit of the scanned number and individually adds them                 together
        //as it goes through the digits, keep dividing by 10 until its 0.
        String numToString = "";

        while (num > 0) {
            int lastDigit = num % 10; 
            numToString +=lastDigit+" + ";
           
            num = num/10;
        }
        //eliminate the last + sign 
        numToString = numToString.substring(0,numToString.lastIndexOf("+")).trim();
        System.out.println(array);
	}

}
