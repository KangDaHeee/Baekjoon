import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 < num2 && num2 % num1 == 0){
                System.out.println("factor");
            } else if (num1 > num2 && num1 % num2 == 0) {
                System.out.println("multiple");
            } else if (num1 == 0 && num2 == 0) {
                break;
            } else {
                System.out.println("neither");
            }
        }

        sc.close();
    }
}