import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int sum=0;
        for (int i=0;i<a+1;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
//백준 8393