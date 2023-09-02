package First;

import java.io.*;
import java.util.StringTokenizer;

// 11021번
// 문제 요약
// 입력 : 테스트 케이스 개수, 각 줄 마다 A B
// 출력 : Case #x: A+B
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String result = "Case #" + (i+1) + ": " + (a + b);
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
