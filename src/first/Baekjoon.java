package first;

import java.io.*;
import java.util.*;

// 1316번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n;
        for (int i = 0; i < n; i++){
            char[] word = br.readLine().toCharArray();
            List<String> temp = new ArrayList<String>();
            char preChar;
            temp.add(String.valueOf(word[0]));
            char currentChar;
            for(int j = 1; j<word.length; j++){
                preChar = word[j-1];
                currentChar = word[j];
                if(preChar == currentChar) continue;
                if(temp.contains(String.valueOf(word[j]))){
                    result -= 1;
                    break;
                }
                temp.add(String.valueOf(word[j]));
            }
        }
        System.out.println(result);

    }  // end of main


}
