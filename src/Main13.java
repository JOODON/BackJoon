import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a= in.nextInt();
        String b= in.next();
        int c=in.nextInt();
        int result =0;
        in.close();

        while (true){
            if (b.equals("+")){
                result=a+c;
            } else if (b.equals("-")) {
                result=a-c;
            } else if (b.equals("*")) {
                result=a*c;
            }else if (b.equals("=")){
                break;
            }
            else {
                result=a/c;
            }
        }
    }
}
