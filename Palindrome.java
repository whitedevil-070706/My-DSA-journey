package daksh;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        int original = n;
        int ans = 0;
        int cout = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = (ans * 10) + rem;
            n /= 10;
            cout++;
        }
        System.out.println("reversed number: "+ ans);

        if (original == ans) {
            System.out.println("The given number is a palindrome.");
        }else {
            System.out.println("The given number is not a palindrome.");
        }
    }
}
