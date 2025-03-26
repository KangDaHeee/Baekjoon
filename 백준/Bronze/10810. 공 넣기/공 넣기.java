import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int t = 0; t<m; t++){

            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int x = i - 1; x < j; x++){
                arr[x] = k;
            }

        }

        for(int b = 0; b < n; b++){
            System.out.print(arr[b] + " ");
        }

        sc.close();
    }
}
