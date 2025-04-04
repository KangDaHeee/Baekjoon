import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            String str = sc.next();
            int temp = str.length();
            System.out.println(str.charAt(0) + "" + str.charAt(temp - 1));
        }
        sc.close();
    }
}