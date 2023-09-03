package First;

import java.io.*;
import java.util.StringTokenizer;

// 10952번
// 문제 요약
// 0 0 이 들어올 때까지 A + B
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
