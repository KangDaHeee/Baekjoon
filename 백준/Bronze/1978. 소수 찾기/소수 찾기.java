import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = 0;

        int count2 = 0;

        for(int i = 0; i < num; i++){
            n = sc.nextInt();
            if(n == 1){
                continue;
            }
            int count1 = 0;
            for(int j = 2; j < n; j++){
                if(n % j == 0){
                    count1++;
                }
            }
            if(count1 == 0){
                count2++;
            }
        }

        System.out.print(count2);

        sc.close();
    }
}