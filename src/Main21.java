import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        in.close();

        int []count=new int[10];
        int total=a*b*c;

        while (total>0){
            count[total%10]++;//
            total/=10;//1703730
        }
        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }
    }
}
