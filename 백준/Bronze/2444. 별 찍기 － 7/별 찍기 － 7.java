import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for(int i = 0; i < num; i++){
        for(int j = num-1; j > i; j--) {
            System.out.print(" ");
        }
        for(int k = 0; k < i*2+1; k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i = num - 2; i >= 0; i--){
        for(int k = num-1; k > i; k--){
            System.out.print(" ");
        }
        for(int j = 0; j < i*2+1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
    }
}