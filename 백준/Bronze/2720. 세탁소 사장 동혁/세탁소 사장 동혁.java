import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] coin = new int[num];

        for(int i = 0; i < num; i++){
            coin[i] = sc.nextInt();
        }

        for(int i = 0; i < num; i++){
            int amount = coin[i];

            int q = amount / 25;
            amount %= 25;

            int d = amount / 10;
            amount %= 10;

            int n = amount / 5;
            amount %= 5;

            int p = amount;

            System.out.println(q + " " + d + " " + n + " " + p);
        }



        sc.close();
    }
}