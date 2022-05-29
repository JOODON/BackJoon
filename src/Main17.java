import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        while (a>0){
            int b=a--;
            System.out.println(b);
        }
    }
}
//백준 2742