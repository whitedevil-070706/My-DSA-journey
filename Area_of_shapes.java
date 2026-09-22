package daksh;

import java.util.Scanner;

public class Area_of_shapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shape name you need to calculate the area of : ");
        String Shape = input.nextLine().trim();
        if (Shape.equals("circle")) {
            System.out.println("Enter the radius of circle : ");
            float radius = input.nextFloat();
            double Area_of_circle = (double) (Math.PI*radius*radius);
            System.out.println("The area of circle is : "+ Area_of_circle);
        } else if (Shape.equals("triangle")) {
            System.out.println("Enter the breadth of triangle : ");
            float b = input.nextFloat();
            System.out.println("Enter the height of triangle : ");
            float h = input.nextFloat();
            float area_of_triangle = (float) ((.5)*b*h);
            System.out.println("The area of triangle is : "+ area_of_triangle);
        } else if (Shape.equals("rectangle")) {
            System.out.println("Enter the base of rectangle : ");
            float base = input.nextFloat();
            System.out.println("Enter the length of rectangle : ");
            float length = input.nextFloat();
            float Area_of_rectangle = (float) (length*base);
            System.out.println("The area of the rectangle is : "+ Area_of_rectangle);
        }else if (Shape.equals("parallelogram")) {
            System.out.println("Enter the height of parallelogram : ");
            float height = input.nextFloat();
            System.out.println("Enter the length of parallelogram : ");
            float base = input.nextFloat();
            float Area_of_parallelogram = (float) (height * base);
            System.out.println("The area of the  is : " + Area_of_parallelogram);
        }else if (Shape.equals("rhombus")) {
            System.out.println("Enter the length of first diagonal of rhombus : ");
            float d1 = input.nextFloat();
            System.out.println("Enter the length of second diagonal of rhombus : ");
            float d2 = input.nextFloat();
            float Area_of_rhombus = (float) ((d1 * d2)/2);
            System.out.println("The area of the  is : " + Area_of_rhombus);
        }else if (Shape.equals("Isosceles Triangle")) {
            System.out.println("Enter the height of Isosceles Triangle : ");
            float height = input.nextFloat();
            System.out.println("Enter the base of Isosceles Triangle : ");
            float base = input.nextFloat();
            float Area_of_Isosceles_triangle = (float) ((height * base) * .5);
            System.out.println("The area of the  is : " + Area_of_Isosceles_triangle);
        }else if (Shape.equals("Equilateral_Triangle")) {
            System.out.println("Enter the side of Equilateral Triangle : ");
            float sideLength = input.nextFloat();
            float Area_of_Equilateral_triangle = (float) ((Math.sqrt(3)/4)*sideLength*sideLength);
            System.out.println("The area of the Equilateral Triangle is : " + Area_of_Equilateral_triangle);

        }


    }
}
