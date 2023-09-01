package First;

import java.io.*;
import java.util.StringTokenizer;

// 15552번: 빠른 A+B
public class Baekjoon {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // Scanner보다 속도가 빠르다
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        // BufferedReader : 입력은 readLine() 메서드 사용. 리턴값이 String으로 고정되어 있어 형변환 필요.
        //                  예외처리 반드시 필요! -> throws IOException
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // BufferedReader를 통해 읽어온 데이터를 공백 단위로 가공하고자 한다면 StringTokenizer 혹은 String.split() 사용
            // StringTokenizer : nextToken()을 통해 readLine()을 통해 입력받은 값을 공백 단위로 구분하여 순서대로 호출
            // String.split() : 배열에 데이터 저장     예) String arr[] = s.split(" ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b));  // 출력
            bw.newLine();  // 줄바꿈
        }
        bw.flush();  // 스트림을 비움
        bw.close();  // 스트림을 닫음
    }
}

// *참고할만한 자료
// https://rlakuku-program.tistory.com/33
