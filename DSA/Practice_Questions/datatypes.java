package Practice_Questions;

import java.util.*;

public class datatypes {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        // Que 1 
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float sum = a+b+c;
        // float avg = sum/3;
        // System.out.println(avg);

        // Que 2 
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println(area);

        // Que 3 
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println(total);
        float gst = (18*total)/100;
        System.out.println(total + gst);
    }
}
