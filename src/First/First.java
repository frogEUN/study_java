package First;

public class First {
    // 클래스 > 메서드 > 실행문
    // 클래스 : 객체 지향 언어세어 프로그램을 개발하는 단위. 적어도 하나의 클래스 필요.
    // method 메서드 : 코드의 모임
    public static void main(String[] args){
        System.out.println("Hello World");
        int weight;  // 변수 선언
        weight = 50;  // 변수 초기화
        // 초깃값을 통하여 데이터 타입을 추론할 수 있는 var
        var number = 100;  // 메서드 내부에 있는 변수에 대해서만 사용
        final double PI;  // 상수, 프로그램 실행 도중 변경할 수 없는 데이터

        System.out.println(Holjjak(1));

        System.out.println(sum(3,4));

    }

    public static String Holjjak(int n){
        if (n%2 ==0){
            return "짝수";
        }
        else{
            return "홀수";
        }
    }




    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public int gap(int num1, int num2){
        if (num1>=num2){
            return num1 - num2;
        }
        else{
            return num2 - num1;
        }
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int share(int num1, int num2){
        return num1 / num2;
    }

    public int rest(int num1, int num2){
        return num1 % num2;
    }


}
