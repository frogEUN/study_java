package First;

import java.io.*;
import java.util.StringTokenizer;

// 10951번
// 문제 요약
// 입력이 끝날 때까지 A+B 출력
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            String input = br.readLine();
            if(input == null) break;
            StringTokenizer st = new StringTokenizer(input);
            if(!st.hasMoreTokens()) break;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a + b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
