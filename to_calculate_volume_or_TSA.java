package daksh;

import java.util.Scanner;

public class to_calculate_volume_or_TSA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter whether you want to calculate volume or TSA or CSA :");
        String choice = input.nextLine().trim();
        if (choice.equals("TSA")){
            System.out.println("Enter the shape of choice :");
            String shape = input.nextLine().trim();
            if (shape.equals("Cube")){
                System.out.println("Enter the length of face :");
                float  square_face = input.nextFloat();
                float TSA_of_cube = (float) (6*square_face*square_face);
                System.out.println("The TSA of the cube is : "+ TSA_of_cube);
            }
        }else if (choice.equals("CSA")){
            System.out.println("Enter the shape of choice :");
            String shape = input.nextLine().trim();
            if (shape.equals("cylinder")){
                System.out.println("Enter the radius of cylinder :");
                float  radius = input.nextFloat();
                System.out.println("Enter the height of the cylinder :");
                float height = input.nextFloat();
                float CSA_of_cylinder = (float) (Math.PI*2*radius*height);
                System.out.println("The CSA of cylinder is : "+ CSA_of_cylinder);
            }
        } else if (choice.equals("Volume")) {
            System.out.println("Enter the shape of choice :");
            String shape = input.nextLine().trim();
            if (shape.equals("cone")){
                System.out.println("Enter the radius of cone :");
                float radius = input.nextFloat();
                System.out.println("Enter the height of the cone :");
                float height = input.nextFloat();
                float volume = (float) (Math.PI*(1/3)*radius*radius*height);
                System.out.println("The volume is : "+ volume);
            } else if (shape.equals("prism")) {
                System.out.println("Enter the Base area of prism :");
                float Base_Area = input.nextFloat();
                System.out.println("Enter the height of the prism :");
                float height =  input.nextFloat();
                float volume = (float) (Base_Area*height);
                System.out.println("The volume is : "+ volume);
            } else if (shape.equals("cylinder")) {
                System.out.println("Enter the radius of Cylinder :");
                float radius = input.nextFloat();
                System.out.println("Enter the  height of the Cylinder :");
                float height = input.nextFloat();
                float volume = (float) (Math.PI*radius*radius*height);
                System.out.println("The volume is : "+ volume);
            }else if (shape.equals("pyramid")) {
                System.out.println("Enter the Base area of pyramid :");
                float Base_Area = input.nextFloat();
                System.out.println("Enter the height of the pyramid :");
                float height = input.nextFloat();
                float volume = (float) ((1/3)*Base_Area*height);
                System.out.println("The volume is : "+ volume);
            } else if (shape.equals("sphere")) {
                System.out.println("Enter the radius of Sphere :");
                float radius = input.nextFloat();
                float volume = (float) (Math.PI*radius*radius*radius*(4/3));
                System.out.println("The volume is : "+ volume);
            }


        }

    }
}
