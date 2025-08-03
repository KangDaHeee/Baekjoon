//import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        for(int i = 0; i < num; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int x1_min = x[0];
        int x2_max = x[0];
        int y1_min = y[0];
        int y2_max = y[0];

        for(int i = 0; i < num; i++){
            x1_min = Math.min(x1_min, x[i]);
            x2_max = Math.max(x2_max, x[i]);
            y1_min = Math.min(y1_min, y[i]);
            y2_max = Math.max(y2_max, y[i]);
        }

        System.out.print((x2_max - x1_min)*(y2_max - y1_min));

        sc.close();
    }
}