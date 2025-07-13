import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String rev = new StringBuffer(str).reverse().toString();

        if(str.equals(rev)){
            bw.write("1");
        }else{
            bw.write("0");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}