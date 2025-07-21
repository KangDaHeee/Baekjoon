import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        int count = (v - b) / (a - b);

        if ((v - b) % (a - b) != 0) {
            count++;
        }

        System.out.print(count);
        sc.close();
    }
}