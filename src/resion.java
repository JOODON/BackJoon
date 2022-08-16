import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class resion {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        String arr[] = new String[in.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i]=in.next();
        }
        in.close();

        for(int i=0; i< arr.length; i++){
            int cnt = 0;
            int sum = 0;

            for (int j=0; j<arr[i].length(); j++){
                if (arr[i].charAt(j) == 'O'){
                    cnt++;
                }else {
                    cnt=0;
                }
                sum+=cnt;
            }

        }
    }
}
