package common_selection_error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int radius;
//        double area, perimeter;
//        radius = new Scanner(System.in).nextInt();
//        if (radius >= 0) {
//            area = Math.PI * radius * radius;
//            perimeter = 2 * Math.PI * radius;
//            System.out.println("Area : " + area + "\nPerimeter :" + perimeter);
//        }

//        boolean even = true;
//        if(even){
//            System.out.println("even true");
//        }

//        int i = 3, j = 2, k = 3;
//        if (i > j)
//            if (i > k)
//                System.out.println("A");
//            else
//                System.out.println("B");

//        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
//        if(0.5 == x){
//            System.out.println("Test");
//        }

//        String cars[] ={"car1","car2","car3","car4"};
//        for(String car : cars){
//            System.out.println(car);
//        }

//        int i;
//        for (i = 0; i < 10; i++) ;
//        {
//            System.out.println("i is " + i);
//        }
//        System.out.println(sum(1.0,2));

//        String[] cars = new String[10];
//        cars[0] = "car1";

//        ArrayList<String> lists = new ArrayList<String>();
//        for(int i = 0 ; i <= 10 ; i++){
//            lists.add("car"+ i);
//        }
//        lists.add(2,"Car Me");
//        lists.remove(2);
//        System.out.println(lists.get(2));
//        for(String car : lists){
//            System.out.println(car);
//        }

        Map<String, String > myLists = new HashMap<String,String>();
        myLists.put("car1","Toyotal");
        myLists.put("car2","Camery");
        myLists.put("car3","prus");

        System.out.println(myLists.get("car3"));

     }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
