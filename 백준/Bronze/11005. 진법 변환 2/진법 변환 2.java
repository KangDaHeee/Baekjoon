import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        int b = sc.nextInt();
        long result = 0;
        int idx = 0;
        char[] arr = new char[100];

        while(n > 0){
            result = n % b;

            if( result < 10){
                arr[idx] = (char)(result + '0');
            }else{
                arr[idx] = (char)(result - 10 + 'A');
            }

            n = n / b;
            idx++;
        }

        for(int i = idx - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }

        sc.close();
    }
}