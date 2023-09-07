package first;

import java.io.*;

// 2444번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            bw.write(" ".repeat(n-i) + "*".repeat(i * 2 - 1) + "\n");
        }
        for(int i=n-1; i>=1; i--){
            bw.write(" ".repeat(n-i) + "*".repeat(i * 2 - 1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }



}
