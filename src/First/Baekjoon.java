package First;

import java.io.*;
import java.util.StringTokenizer;

// 10813번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] baskets = new int[n];
        for(int i = 0; i < n; i++){
            baskets[i] = i+1;
        }
        for(int k = 0; k < m; k++){
            StringTokenizer stt = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(stt.nextToken()) - 1;
            int two = Integer.parseInt(stt.nextToken()) - 1;
            int temp = baskets[one];
            baskets[one] = baskets[two];
            baskets[two] = temp;
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
