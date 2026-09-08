package daksh;

import java.util.Scanner;

public class largest_number {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number : ");
        int num1 = input.nextInt();
        System.out.println("Please enter your second number : ");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println("The largest number is "+ num1);
        }else {
            System.out.println("The largest number is "+ num2);
        }
    }
}
