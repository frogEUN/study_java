package First;

public class ProgrammersSchool {
}

// 두 수의 나눗셈
class Solution1 {
    public int solution(int num1, int num2) {
        double answer = (num1 / (num2*1.0)) * 1000;
        return (int)answer;
    }
}

// 숫자 비교하기
class Solution2 {
    public int solution(int num1, int num2) {
        if(num1 == num2)
            return 1;
        else
            return -1;

        //int answer = (num1 == num2) ? 1 : -1;
        //return answer;
    }
}

// 분수의 덧셈
class Solution3 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        answer[1] = denom1 * denom2;
        for (int i = 500; i >= 2; i--){
            if(answer[0]%i == 0 && answer[1]%i == 0){
                answer[0] = answer[0] / i;
                answer[1] = answer[1] / i;
            }
        }
        return answer;
    }
}

// 배열 두 배 만들기
class Solution4 {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 2;
        }
        return numbers;

        // 신기한 방법
        //return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}

