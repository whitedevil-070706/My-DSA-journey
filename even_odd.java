package daksh;

import java.util.Scanner;

public class even_odd {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int num1 = input.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("The given number is even");
        }else {
            System.out.println("The given number is odd");
        }
    }
}