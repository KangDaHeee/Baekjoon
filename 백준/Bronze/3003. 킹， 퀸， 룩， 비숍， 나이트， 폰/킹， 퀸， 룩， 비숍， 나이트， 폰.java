import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] correct = {1,1,2,2,2,8};

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 6; i++){
            int num = Integer.parseInt(st.nextToken());
            int diff = correct[i] - num;
            bw.write(diff+" ");
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}