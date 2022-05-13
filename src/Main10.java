import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        if (a==b&&b==c){
            System.out.println((a*1000)+10000);
        }
        else if (a==b||a==c){
            System.out.println((a*100)+1000);
        }
        else if (a==b||b==c){
            System.out.println((b*100)+1000);
    }
        else {
            System.out.println(Math.max(Math.max(a,b),c)*100);
        }
}
}
//백준2480번