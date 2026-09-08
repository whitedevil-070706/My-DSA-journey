package daksh;

import java.util.Scanner;

public class greeting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello welcome to Global Tech Consultancy : Mr/Ms. " + name);
    }
};
