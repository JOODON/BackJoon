import java.util.Scanner;

public class Main2 {
    public static void main(String[]args){
        Scanner sin =new Scanner(System.in);
        int a=sin.nextInt();
        int b=sin.nextInt();
        int c=sin.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
        //백준 10430번
    }
}
