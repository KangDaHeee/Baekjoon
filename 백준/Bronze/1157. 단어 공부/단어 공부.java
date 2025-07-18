import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String st = s.toUpperCase();
        int[] arr = new int[26];

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            arr[ch - 'A'] += 1;
        }

        int max = -1;
        int index = -1;
        boolean dup = false;

        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
                dup = false;
            }else if(arr[i] == max){
                dup = true;
            }
        }

        if(dup){
            System.out.print("?");
        }else{
            System.out.print((char)(index + 'A'));
        }
        
        sc.close();
    }
}