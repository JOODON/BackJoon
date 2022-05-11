import java.util.Scanner;

public class Main4 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        if(a==b){
            System.out.println("==");
        }
        else if(a<b){
            System.out.println("<");
        }
        else {
            System.out.println(">");
            }
    }
}
//백준 1330번 문제