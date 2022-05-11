import java.util.Scanner;

public class Main5 {
    public static void main(String[]args){
            Scanner in=new Scanner(System.in);
            int a= in.nextInt();
            if(a<=100 && a>=0)
                if(a<=100 && 90<=a){
                    System.out.println("A");
                }
                else if(a<=89 && a>=80){
                    System.out.println("B");
                }
                else if (a<=79 && a>=70){
                    System.out.println("C");
                }
                else if (a<=69 && a>=60){
                    System.out.println("D");
                }
                else {
                    System.out.println("F");
                }
        }
    }
//백준 9498번
