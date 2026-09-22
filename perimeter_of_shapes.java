package daksh;

import java.util.Scanner;

public class perimeter_of_shapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shape name you need to calculate the Perimeter of : ");
        String Shape = input.nextLine().trim();
        if  (Shape.equals("circle")) {
            System.out.println("Enter the radius of the circle : ");
            float radius = input.nextFloat();
            float perimeter_of_circle = (float) (2 * Math.PI * radius);
        }else  if (Shape.equals("rectangle")) {
            System.out.println("Enter the length of side");
        float length = input.nextFloat();
            System.out.println("Enter the base of side");
        float base = input.nextFloat();
        float perimeter_of_rectangle = (float) (2 * base * length);
            System.out.println("The perimeter of the rectangle is :" + perimeter_of_rectangle);
        }else  if (Shape.equals("square")) {
            System.out.println("Enter the length of side");
            float length = input.nextFloat();
            float perimeter_of_square = (float) (4*length);
            System.out.println("The perimeter of the square is :" + perimeter_of_square);
        }else if (Shape.equals("equalatrial triangle")){
            System.out.println("Enter the length of side");
            float length = input.nextFloat();
            float perimeter_of_triangle = (float) (3*length);
            System.out.println("The perimeter of the triangle is :" + perimeter_of_triangle);
        }else if (Shape.equals("parellogram")){
            System.out.println("Enter the length of side");
            float s = input.nextFloat();
            float b = input.nextFloat();
            float perimeter_of_parellelogram = (float) (2*(s+b));
            System.out.println("perimeter of parellelogram :" +  perimeter_of_parellelogram);
        } else if (Shape.equals("Rhombus")) {
            System.out.println("Enter the length of side");
            float s = input.nextFloat();
            float perimeter_ofRhombus = (float) (4*s);
            System.out.println("perimeter of  Rhombus :" +  perimeter_ofRhombus);
        }
    }
}
