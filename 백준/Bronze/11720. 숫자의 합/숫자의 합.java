import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        String a = sc.next();

        for(int i = 0; i < num; i++){
            sum += a.charAt(i) - '0';
        }

        System.out.print(sum);
        sc.close();
    }
}
