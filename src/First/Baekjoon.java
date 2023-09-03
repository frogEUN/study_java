package First;

import java.io.*;

// 2439번
// 문제 요약
// 입력 : N
// 출력 : 첫째 줄부터 N번째줄까지 1~n개 * 출력, 오른쪽 정렬
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++){
            String result = " ".repeat(n-i) + "*".repeat(i);
            bw.write(result);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
