import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a=in.nextInt();

        for (int i=0;i<=a-1;i++){
            int b=in.nextInt();
            int c=in.nextInt();
            System.out.println(b+c);
        }
    }
}
//백준 19050문제