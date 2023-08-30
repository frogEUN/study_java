package First;

public class First {
    // 클래스 > 메서드 > 실행문
    // 클래스 : 객체 지향 언어세어 프로그램을 개발하는 단위. 적어도 하나의 클래스 필요.
    // method 메서드 : 코드의 모임
    public static void main(String[] args) {
        System.out.println("Hello World");
        int weight;  // 변수 선언
        weight = 50;  // 변수 초기화
        // 초깃값을 통하여 데이터 타입을 추론할 수 있는 var
        var number = 100;  // 메서드 내부에 있는 변수에 대해서만 사용
        final double PI;  // 상수, 프로그램 실행 도중 변경할 수 없는 데이터

//        for (int i = 2; i <= 9; i++){
//            for (int k = 1; k <= 9; k++){
//                System.out.printf("%d x %d = %d\n", i, k, i*k);
//            }
//        }

        gugudan(2, 5);
        System.out.println();
        gugudan(6, 9);

    }

    public static void gugudan(int one, int two){
        for (int i=1; i<=9; i++){
            for(int s=one; s<=two; s++){
                System.out.printf("%d x %d = %d\t", s, i, s*i);
            }
            System.out.println();
        }
    }
}
