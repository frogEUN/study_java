package First;

import java.io.*;
import java.util.StringTokenizer;

// 10810번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] baskets = new int[n];
        for(int k = 0; k < m; k++){
            StringTokenizer stt = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stt.nextToken());
            int end = Integer.parseInt(stt.nextToken());
            int what = Integer.parseInt(stt.nextToken());
            for (int i = start; i <= end; i++){
                baskets[i-1] = what;
            }
        }
        String result = "";
        for(int i: baskets){
            result = result + String.valueOf(i) + " ";
        }
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
