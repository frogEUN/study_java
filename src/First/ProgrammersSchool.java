package First;
import java.util.ArrayList;
import java.util.Collections;

public class ProgrammersSchool {

    public static void main(String args[]){
        System.out.println(Solution3.solution(new int[]{1, 1, 1, 1}));
    }
}

// 최빈값 구하기
// *내가 풀어본 답
class Solution3 {
    public static int solution(int[] array) {
        if(array.length == 1)
            return array[0];
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        ArrayList<Integer> check = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            if (Collections.frequency(check, array[i]) == 0){
                check.add(array[i]);
                var temp = new ArrayList<Integer>();
                temp.add(array[i]);
                var count = 0;
                for (int a : array){
                    if(a == array[i])
                        count++;
                }
                temp.add(count);
                if(nums.size() == 0){
                    nums.add(temp);
                }
                else {
                    for(int l = 0; l < nums.size(); l++){
                        // 정렬해서 넣기
                        if (temp.get(1) >= nums.get(l).get(1)){
                            nums.add(l, temp);
                            break;
                        }
                        if (l==nums.size()-1){
                            nums.add(temp);
                        }
                    }
                }

            }
        }
        if(nums.size() >= 2 && nums.get(0).get(1).equals(nums.get(1).get(1))){
            return -1;
        }
        else{
            return nums.get(0).get(0);
        }

    }
}
