import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        float[] arr = new float[num];

        for(int i = 0; i < arr.length; i++){
            int score = sc.nextInt();
            arr[i] = score;
        }
        float max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i]/max)*100;
        }

        float sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.printf("%.6f", sum / num);


        sc.close();
    }
}
