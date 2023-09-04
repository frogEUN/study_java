package First;

import java.io.*;
import java.util.*;

// 3052번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<10; i++){
            int n = Integer.parseInt(br.readLine()) % 42;
            if(!nums.contains(n)){
                nums.add(n);
            }
        }
        bw.write(String.valueOf(nums.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
