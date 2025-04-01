import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for(int t = 0; t < M; t++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            int start = i - 1;
            int end = j - 1;

            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


        sc.close();
    }
}
