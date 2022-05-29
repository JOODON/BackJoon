import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){//입력값이 정수인지 판단 아니면 false를 출력//
            int a = in.nextInt();
            int b = in.nextInt();
            int sum=a+b;
            System.out.println(sum);
        }
    }
}
