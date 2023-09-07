package first;

import java.io.*;
import java.util.*;

// 1546번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] scores = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        for(int i = 0; i < n; i++){
            double temp = (double)Integer.parseInt(st.nextToken());
            scores[i] = temp;
            if(temp>=max){
                max = temp;
            }
        }
        double sum = 0;
        for(int i = 0; i < scores.length; i++){
            scores[i] = (scores[i] / max) * 100.0;
            sum += scores[i];
        }
        System.out.print(String.valueOf(sum / n));
    }  // end of main


}
