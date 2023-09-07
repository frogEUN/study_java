package first;

import java.io.*;
import java.util.*;

// 2941번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> alpha = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        String word = br.readLine();
        for(String a: alpha){
            word = word.replace(a, "+");
        }
        System.out.println(word.length());
    }  // end of main


}
