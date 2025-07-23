import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int res = 0;

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                res = i;
                count++;
            }
            if(count == k){
                System.out.print(res);
                break;
            }
        }
        if(count < k){
            System.out.print("0");
        }

        sc.close();
    }
}