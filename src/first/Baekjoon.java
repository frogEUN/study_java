package first;

import java.io.*;
import java.util.StringTokenizer;

// 2566번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] nums = new int[9][9];
        int max = 0;
        int max_hang = 0;
        int max_yeol = 0;
        for (int h=0; h<9; h++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int y=0; y<9; y++){
                int temp = Integer.parseInt(st.nextToken());
                nums[h][y] = temp;
                if(temp>=max){
                    max = temp;
                    max_hang = h;
                    max_yeol = y;
                }
            }
        }
        System.out.println(max);
        String result = (max_hang+1) + " " + (max_yeol+1);
        System.out.println(result);

    }


}
