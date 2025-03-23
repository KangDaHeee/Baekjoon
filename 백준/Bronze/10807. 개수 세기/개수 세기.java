import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]==a){
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}