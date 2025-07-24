import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();
            int res = 0;

            if(num == -1){
                break;
            }

            List<Integer> list = new ArrayList<>();

            for(int i = 1; i <num; i++){
                if(num % i == 0){
                    res += i;
                    list.add(i);
                }
            }
            if(num == res){
                System.out.print(num + " = ");
                for(int i = 0; i < list.size(); i++){
                    System.out.print(list.get(i));
                    if(i + 1 < list.size()){
                        System.out.print(" + ");
                    }else {
                        System.out.println();
                    }
                }
            }else{
                System.out.println(num + " is NOT perfect.");
            }
        }



        sc.close();
    }
}