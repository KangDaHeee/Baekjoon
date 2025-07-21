import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int len = (int)Math.pow(2, num) + 1;
        int result = len * len;

        System.out.print(result);

        sc.close();
    }
}