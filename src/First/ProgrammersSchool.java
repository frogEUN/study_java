package First;
import java.util.*;

public class ProgrammersSchool {
}

// 피자 나눠 먹기 (1)
class Solution1 {
    public int solution(int n) {
        if(n % 7 == 0)
            return n / 7;
        else
            return n / 7 + 1;
        
        // 예술
        //return (n + 6) / 7;
    }
}