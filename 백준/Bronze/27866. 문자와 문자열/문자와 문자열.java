import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt();

        System.out.print(str.charAt(num-1));

        sc.close();
    }
}
