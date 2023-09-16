package first;

public class ProgrammersSchool {
}

// 옷가게 할인 받기
class Solution1 {
    public int solution(int price) {
        if(price>=500000) return (int)(price * 0.80);
        else if(price>=300000) return (int)(price * 0.90);
        else if(price>=100000) return (int)(price * 0.95);
        return price;
    }
}
