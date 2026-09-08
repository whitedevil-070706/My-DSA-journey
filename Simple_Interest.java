package daksh;

import java.util.Scanner;

public class Simple_Interest {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Principal amount : ");
        int num1 = input.nextInt();
        System.out.println("Please enter the Rate of interest in decimal value : ");
        float num2 = input.nextFloat();
        System.out.println("Please enter the Time taken in Year : ");
        int num3 = input.nextInt();

        float Simple_Interest = (num1*num2*num3) ;

        System.out.println("The Simple Interest is :" + Simple_Interest);
    }
}
