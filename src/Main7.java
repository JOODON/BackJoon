import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();
        if (x > 0 && y>0) {
            System.out.println(1);
        }
        else if(x > 0 && y < 0 )  {
            System.out.println(4);
        }
        else if (x < 0 && y>0) {
            System.out.println(2);
        }

        else if (x < 0 && y<0) {
            System.out.println(3);
        }
    }
//백준 14681문제
}

