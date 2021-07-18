package common_selection_error;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int radius;
        double area, perimeter;
        radius = new Scanner(System.in).nextInt();
        if (radius >= 0) {
            area = Math.PI * radius * radius;
            perimeter = 2 * Math.PI * radius;
            System.out.println("Area : " + area + "\nPerimeter :" + perimeter);
        }
    }
}
