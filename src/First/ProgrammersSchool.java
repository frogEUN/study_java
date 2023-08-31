package First;
import java.util.*;

public class ProgrammersSchool {
}

// 최빈값 구하기
// *해답

class Solution {
    public int solution(int[] array) {
        int maxCount = 0;  // 가장 많이 등장한 횟수
        int answer = 0;   // 가장 많이 등장한 수

        // 각 숫자의 등장 횟수를 저장할 해시맵
        Map<Integer, Integer> map = new HashMap<>();

        // array를 순회하면서
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            // getOrDefault -> 주어진 key에 해당하는 값을 가져오되 없다면 기본값을 반환

            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                // 다중 최빈값 처리
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
