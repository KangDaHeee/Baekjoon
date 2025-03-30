import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            int num = sc.nextInt();
            if(num >= 42){
                arr[i] = num % 42;
                set.add(arr[i]);
            }
            else{
                arr[i] = num;
                set.add(arr[i]);
            }
        }
        
        System.out.print(set.size());
        sc.close();
    }
}
