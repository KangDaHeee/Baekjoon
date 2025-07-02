import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder result = new StringBuilder();

            for(int j = 0; j < s.length(); j++){
                char ch = s.charAt(j);
                for(int k=0; k<n; k++){
                    result.append(ch);
                }
            }
            System.out.println((result.toString()));
        }
        sc.close();
    }
}
