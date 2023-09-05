package First;

import java.io.*;
import java.util.*;

// 10811번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] baskets = new int[size];
        for(int i=0; i < size; i++){
            baskets[i] = i+1;
        }
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken())-1;
            int two = Integer.parseInt(st.nextToken())-1;
            int[] temp = new int[two-one+1];
            for(int q = 0, w = two; q < temp.length && w >= one; q++, w--){
                temp[q] = baskets[w];
            }
            for(int j=0, k=one; j<two-one+1 && k <= two; j++, k++){
                baskets[k] = temp[j];
            }

        }  // end of for(n)
        String result = "";
        for(int i=0; i<baskets.length; i++){
            result = result + baskets[i] + " ";
        }
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }  // end of main

}
