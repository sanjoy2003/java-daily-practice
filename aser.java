import java.lang.Math;
import java.util.Scanner;
public class aser {
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        System.out.println("enter the value");
        int b=sc.nextInt();
        System.out.println("enter the n value");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            {
               int c=(Math.pow(b,i));
               int res=+c;
                System.out.println(res);
            }
        }



    }
    
}
