import java.util.Scanner;

public class Main3 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));// / 나누기 % 나머지
        System.out.println(a*(b/100));//나머지값 생략
        System.out.println(a*b);
//백준 2588 곱셈
    }
}
