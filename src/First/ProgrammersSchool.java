package First;
import java.util.ArrayList;
import java.util.List;
public class ProgrammersSchool {
}

// 나머지 구하기
class Solution1 {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;

        // 다른 풀이
//        while (num1 >= num2) {
//            num1 = num1 - num2;
//        }
//        int answer = num1;
//        return answer;
    }
}

// 중앙값 구하기


class Solution2 {
    public int solution(int[] array) {
        List<Integer> nums = new ArrayList<>();
        nums.add(0, array[0]);

        for(int i = 1; i < array.length; i++){
            boolean temp = true;
            for(int k = 0; k < nums.size(); k++){
                if (array[i] <= nums.get(k)){
                    nums.add(k, array[i]);
                    temp = false;
                    break;
                }
            }
            if(temp){
                nums.add(nums.size(), array[i]);
            }
        }
        return nums.get((nums.size())/2);
    }
}




// 짝수는 싫어요
class Solution4 {
    public int[] solution(int n) {
        if(n%2==1)
            n += 1;
        int temp = 1;
        int[] nums = new int[n/2];
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = temp;
            temp += 2;
        }
        return nums;

        // 아름다운 풀이
        //return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}