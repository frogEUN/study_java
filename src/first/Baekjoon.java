package first;

import java.io.*;

// 10988번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(temp(br.readLine().toCharArray()));
        br.close();
    }

    private static int temp(char[] word){
        int l = word.length;
        for (int i = 0; i<l; i++){
            if(i == l-1-i) break;
            if(word[i] != word[l-1-i]){
                return 0;
            }
        }
        return 1;
    }

}
