package daksh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first = 0;
        int second = 1;

        for (int count = 0; count < n ; count++){
            System.out.println(first);
            int next = first + second ;
            first = second;
            second = next;
        }
        input.close();
    }
}
