import java.util.Scanner;

public class Main8 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();

        if(b<45){
            a--;
            b=60-(45-b);
            if(a<0){
                a=23;//0시 전이면 오후 23시니깐 23으로 출력
            }
            System.out.println(a+" "+b);
        }
        else {
            System.out.println(a+" "+(b-45));
        }
    }
}
//백준 2884번 문제