import java.util.Scanner;
public class ass{
    public static void maoin(String arr[]){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
           
        System.out.println("the addition value is:"+(add(a,b)));
        
    }
    static int add(int a,int b){
        int c=a+b;
        return c;
    }
}
