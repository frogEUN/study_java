package First;

public class NumberTypeDemo {
    // <쉽게 배우는 자바 프로그래밍> 50쪽 예제 2-2
    public static void main(String[] args){
        int mach;
        int distance;
        mach = 340;
        distance = mach * 60 * 60;
        System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

        double radius;
        double area;
        radius = 10.0;
        area = radius * radius * 3.14;
        System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
    }
}
