package first;

import java.io.*;

// 10798번
public class Baekjoon {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] words = new char[5][15];
        for (int i = 0; i < 5; i++){
            int l = 0;
            String word = br.readLine();
            on: while(true) {
                try{
                    words[i][l] = word.charAt(l);
                    l++;
                }
                catch(StringIndexOutOfBoundsException e){
                    break on;
                }

            }
        }
        for (int i=0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(words[j][i] != '\0')
                    bw.write(words[j][i]);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }


}
