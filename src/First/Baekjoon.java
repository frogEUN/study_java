package First;

import java.io.*;

// 5597번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] students = new int[30];
        for(int k = 0; k < 28; k++){
            int num = Integer.parseInt(br.readLine());
            students[num-1] = 1;
        }
        for(int i = 0; i < 30; i++){
            if (students[i] == 0){
                bw.write(String.valueOf(i + 1));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
