package daksh;

import java.util.Scanner;

public class Substract_the_product_and_sum_of_digits_of_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired number: ");
        int n = input.nextInt();
        int product = 1;
        int sum = 0;
        while (n>0){
       int digit = n % 10;
       product *= digit;
       sum += digit;
       n /= 10;
        }
        int desired_number = (product - sum);
        System.out.println("the answer is : "+ desired_number );
    }
}