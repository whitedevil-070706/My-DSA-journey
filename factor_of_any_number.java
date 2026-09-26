package daksh;

import java.util.Scanner;

public class factor_of_any_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        System.out.println("These are the factors of " + n + "are :" );
        for (int i = 1; i <= n; i++) {
            if(n % i ==0){
                System.out.println( i + " ");
            }
        }
    }
}
l