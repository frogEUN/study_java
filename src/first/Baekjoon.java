package first;

import java.io.*;
import java.util.StringTokenizer;

// 2738번
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] one = new int[n][m];
        int[][] two = new int[n][m];
        for(int nn = 0; nn < n; nn++){
            st = new StringTokenizer(br.readLine());
            for(int mm = 0; mm < m; mm++){
                one[nn][mm] = Integer.parseInt(st.nextToken());
            }
        }
        for(int nn = 0; nn < n; nn++){
            st = new StringTokenizer(br.readLine());
            for(int mm = 0; mm < m; mm++){
                two[nn][mm] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] result = new int[n][m];
        for(int nn = 0; nn < n; nn++){
            for(int mm = 0; mm < m; mm++){
                result[nn][mm] = one[nn][mm] + two[nn][mm];
            }
        }

        for(int nn = 0; nn < n; nn++){
            for(int mm = 0; mm < m; mm++){
                bw.write(String.valueOf(result[nn][mm]) + " ");
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();

    }


}
