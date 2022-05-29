import java.util.Arrays;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int [] a=new int[b];

      for (int i=0;i<b;i++){
          a[i]=in.nextInt();
      }
        Arrays.sort(a);//이걸 사용하면 순차적으로 정렬
        System.out.println(a[0]+" "+a[b-1]);
    }
}
//백준 10818