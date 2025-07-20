import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][15];
        String input = "";

        for(int i = 0; i < 5; i++){
            input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = String.valueOf(input.charAt(j));
            }

        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) {
                    System.out.print(arr[j][i]);
                }
            }
        }


        sc.close();
    }
}